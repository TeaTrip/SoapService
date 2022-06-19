package core.errors;

import javax.xml.ws.WebFault;
@WebFault(faultBean =
        "core.errors.ThrottlingException")
public class ThrottlingException extends Exception {
    private static final long serialVersionUID = -6647544772732631047L;
    private final MovieServiceFault fault;
    public ThrottlingException(String message, MovieServiceFault fault)
    {
        super(message);
        this.fault = fault;
    }
    public ThrottlingException(String message, MovieServiceFault fault,
                                     Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }
    public MovieServiceFault getFaultInfo() {
        return fault;
    }
}
