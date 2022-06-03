package core.errors;

public class MovieServiceFault {
    private static final String DEFAULT_MESSAGE = "Wrong parameter provided";

    protected String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public static MovieServiceFault defaultInstance() {
        MovieServiceFault fault = new MovieServiceFault();
        fault.message = DEFAULT_MESSAGE;
        return fault;
    }
}
