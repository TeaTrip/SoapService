package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;




import client.core.webservice.Movie;
import client.core.webservice.MovieService;
import core.methods.movie.MovieMethodsImplement;
//import core.wishmaster.ifmo.ws.jaxws.client.Movie;
//import core.wishmaster.ifmo.ws.jaxws.client.MovieService;


import javax.xml.namespace.QName;

public class Client {

    public static void main(String[] args) throws MalformedURLException {

        Properties systemProps = System.getProperties();
        systemProps.put("javax.net.ssl.keyStorePassword","passwordForKeystore");
        systemProps.put("javax.net.ssl.keyStore","pathToKeystore.ks");
        systemProps.put("javax.net.ssl.trustStore", "pathToTruststore.ts");
        systemProps.put("javax.net.ssl.trustStorePassword","passwordForTrustStore");
        System.setProperties(systemProps);

        URL url = new URL("http://localhost:8282/MovieService?wsdl");
        URL url2 = new URL("http://desktop-fnkud04:8080/J2EEService-2.0-SNAPSHOT/MovieService?wsdl");
        MovieService movieService = new MovieService(url);

        System.out.println("\n===============================\n" +
                "selectAll\n");
        List<Movie> movies = movieService.getMovieWebServicePort().selectAll();
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");
        System.out.println("\n===============================\n" +
                "selectByName\n");
        movies = movieService.getMovieWebServicePort().selectByName("Не смотрите наверх");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByDirector\n");
        movies = movieService.getMovieWebServicePort().selectByDirector("Рейнальдо Маркус Грин");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByGenre\n");
        movies = movieService.getMovieWebServicePort().selectByGenre("Комедия");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByRating\n");
        movies = movieService.getMovieWebServicePort().selectByRating(6);
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByYear\n");
        movies = movieService.getMovieWebServicePort().selectByYear(2009);
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByRatingAndGenre\n");
        movies = movieService.getMovieWebServicePort().selectByRatingAndGenre("7", "Драма");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByYearAndGenre\n");
        movies = movieService.getMovieWebServicePort().selectByYearAndGenre("2021", "Драма");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectByYearAndRating\n");
        movies = movieService.getMovieWebServicePort().selectByYearAndRating("2021", "7");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "createNewMovie\n");
        int id = movieService.getMovieWebServicePort().createNewMovie("new film", 1998, 8, "so sad", "Morgan Freeman");
        System.out.println("Created movie id is - "+id);
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "createNewMovie\n");
        int updateCode = movieService.getMovieWebServicePort().updateMovie(1,"new film UPDATED", 1998, 8, "so good", "Obama");
        System.out.println("Created movie id is - "+updateCode);
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "createNewMovie\n");
        int deleteCode = movieService.getMovieWebServicePort().deleteMovie(2);
        System.out.println("Created movie id is - "+updateCode);
        System.out.println("===============================");

        System.out.println("\n===============================\n" +
                "selectAll\n");
        movies = movieService.getMovieWebServicePort().selectAll();
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");

    /*
    MovieService_Service movieService = new MovieService_Service(url);
    System.out.println(movieService);
    MovieService movieService1 = movieService.getMovieServicePort();
    movieService1.selectAll();
*/
    }

}
