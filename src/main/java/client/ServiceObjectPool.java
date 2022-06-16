package client;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Supplier;

public class ServiceObjectPool<T> extends GenericObjectPool<T> {
    public ServiceObjectPool(Supplier<T> factory) {
        super(new BasePooledObjectFactory<T>() {
            @Override
            public T create() throws Exception {
                return factory.get();
            }
            @Override
            public PooledObject<T> wrap(T obj) {
                return new DefaultPooledObject<>(obj);
            }
        });
    }

    public static class PooledServiceProxy<T> implements InvocationHandler {
        private ServiceObjectPool<T> pool;

        public PooledServiceProxy(ServiceObjectPool<T> pool) {
            this.pool = pool;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            T t = null;
            try {
                t = this.pool.borrowObject();
                return method.invoke(t, args);
            } finally {
                if (t != null)
                    this.pool.returnObject(t);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public T getProxy(Class<? super T> interfaceType) {
        PooledServiceProxy<T> handler = new PooledServiceProxy<>(this);
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType}, handler);
    }
}
