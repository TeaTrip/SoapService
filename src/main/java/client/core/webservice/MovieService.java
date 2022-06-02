
package client.core.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MovieService", targetNamespace = "http://webservice.core/", wsdlLocation = "http://localhost:8282/MovieService?wsdl")
public class MovieService
    extends Service
{

    private final static URL MOVIESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESERVICE_EXCEPTION;
    private final static QName MOVIESERVICE_QNAME = new QName("http://webservice.core/", "MovieService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/MovieService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESERVICE_WSDL_LOCATION = url;
        MOVIESERVICE_EXCEPTION = e;
    }

    public MovieService() {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME);
    }

    public MovieService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESERVICE_QNAME, features);
    }

    public MovieService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESERVICE_QNAME);
    }

    public MovieService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESERVICE_QNAME, features);
    }

    public MovieService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MovieService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieWebService
     */
    @WebEndpoint(name = "MovieWebServicePort")
    public MovieWebService getMovieWebServicePort() {
        return super.getPort(new QName("http://webservice.core/", "MovieWebServicePort"), MovieWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieWebService
     */
    @WebEndpoint(name = "MovieWebServicePort")
    public MovieWebService getMovieWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.core/", "MovieWebServicePort"), MovieWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESERVICE_EXCEPTION!= null) {
            throw MOVIESERVICE_EXCEPTION;
        }
        return MOVIESERVICE_WSDL_LOCATION;
    }

}
