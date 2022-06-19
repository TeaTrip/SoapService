package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.function.Supplier;



import client.core.webservice.IllegalParameterException;
import client.core.webservice.Movie;
import client.core.webservice.MovieService;
import client.core.webservice.MovieWebService;
import client.core.webservice.ThrottlingException;
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
        //MovieService movieService = new MovieService(url);

        Supplier<MovieWebService> movieSupplier = () -> { return new MovieService(url).getMovieWebServicePort();};

        ServiceObjectPool<MovieWebService> servicePool = new ServiceObjectPool<>(movieSupplier);
        MovieWebService movieService = servicePool.getProxy(MovieWebService.class);

        List<Movie> movies;


        try{
            System.out.println("\n===============================\n" +
                    "selectAll\n");
            movies = movieService.selectAll();
            for (Movie movie : movies) {
                System.out.println(movie.toString());
            }
            System.out.println("===============================");
        }
        catch (ThrottlingException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n===============================\n" +
                "selectByName\n");
        movies = movieService.selectByName("Не смотрите наверх");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByDirector\n");
        movies = movieService.selectByDirector("Рейнальдо Маркус Грин");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByGenre\n");
        movies = movieService.selectByGenre("Комедия");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByRating\n");
        movies = movieService.selectByRating(6);
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByYear\n");
        movies = movieService.selectByYear(2009);
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByRatingAndGenre\n");
        movies = movieService.selectByRatingAndGenre("7", "Драма");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByYearAndGenre\n");
        movies = movieService.selectByYearAndGenre("2021", "Драма");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "selectByYearAndRating\n");
        movies = movieService.selectByYearAndRating("2021", "7");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "createNewMovie\n");
        try {
            int id = movieService.createNewMovie("", 1998, 8, "so sad", "Morgan Freeman");
            System.out.println("Created movie id is - "+id);
        }
        catch (IllegalParameterException e){
            System.out.println(e.getMessage());
        }
        System.out.println("===============================");



        System.out.println("\n===============================\n" +
                "updateMovie\n");
        try {
            int updateCode = 0;
            updateCode = movieService.updateMovie(100,"new film UPDATED", 1998, 8, "so good", "Obama");
            System.out.println("Updated movie id is - "+updateCode);
        } catch (IllegalParameterException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================");




        System.out.println("\n===============================\n" +
                "deleteMovie\n");
        try {
            int deleteCode = movieService.deleteMovie(2000);
            System.out.println("Deleted movie id is - "+deleteCode);
        } catch (IllegalParameterException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("===============================");




        try{
            System.out.println("\n===============================\n" +
                    "selectAll\n");
            movies = movieService.selectAll();
            for (Movie movie : movies) {
                System.out.println(movie.toString());
            }
            System.out.println("===============================");
        }catch (ThrottlingException e){
            System.out.println(e.getMessage());
        }


    /*
    MovieService_Service movieService = new MovieService_Service(url);
    System.out.println(movieService);
    MovieService movieService1 = movieService.getMovieServicePort();
    movieService1.selectAll();
*/
    }

}
