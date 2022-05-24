package core;
import core.webservice.MovieWebService;


import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8282/MovieService";
        Endpoint.publish(url, new MovieWebService());
    }
}
