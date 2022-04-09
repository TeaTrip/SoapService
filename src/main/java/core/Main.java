package core;
import core.service.MovieService;

import javax.xml.ws.Endpoint;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "http://localhost:8080/movies";
        Endpoint.publish(url, new MovieService());
    }
}
