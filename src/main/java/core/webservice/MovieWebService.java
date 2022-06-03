package core.webservice;

import core.errors.IllegalParameterException;
import core.errors.MovieServiceFault;
import core.methods.movie.MovieMethodsImplement;
import core.models.Movie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "MovieService")
public class MovieWebService implements MovieWebServiceI {
    private final MovieMethodsImplement dbMovie = new MovieMethodsImplement();


    @WebMethod(operationName = "selectAll")
    @Override
    public List<Movie> selectAll() {
        return dbMovie.selectAll();
    }

    @WebMethod(operationName = "selectById")
    @Override
    public Movie selectById(@WebParam(name = "id") int id) {
        return dbMovie.selectById(id);
    }

    @WebMethod(operationName = "selectByYear")
    @Override
    public List<Movie> selectByYear(@WebParam(name = "year")int year) {
        return dbMovie.selectByYear(year);
    }

    @WebMethod(operationName = "selectByRating")
    @Override
    public List<Movie> selectByRating(@WebParam(name = "rating")int rating) {
        return dbMovie.selectByRating(rating);
    }

    @WebMethod(operationName = "selectByName")
    @Override
    public List<Movie> selectByName(@WebParam(name = "name")String name) {
        return dbMovie.selectByName(name);
    }

    @WebMethod(operationName = "selectByGenre")
    @Override
    public List<Movie> selectByGenre(@WebParam(name = "genre")String genre) {
        return dbMovie.selectByGenre(genre);
    }

    @WebMethod(operationName = "selectByDirector")
    @Override
    public List<Movie> selectByDirector(@WebParam(name = "director")String director) {
        return dbMovie.selectByDirector(director);
    }

    @WebMethod(operationName = "selectByYearAndRating")
    @Override
    public List<Movie> selectByYearAndRating(@WebParam(name = "year")String year,
                                             @WebParam(name = "rating")String rating) {
        return dbMovie.selectByYearAndRating(year, rating);
    }

    @WebMethod(operationName = "selectByYearAndGenre")
    @Override
    public List<Movie> selectByYearAndGenre(@WebParam(name = "year")String year,
                                            @WebParam(name = "genre")String genre) {
        return dbMovie.selectByYearAndGenre(year, genre);
    }

    @WebMethod(operationName = "selectByRatingAndGenre")
    @Override
    public List<Movie> selectByRatingAndGenre(@WebParam(name = "rating")String rating,
                                              @WebParam(name = "genre")String genre) {
        return dbMovie.selectByRatingAndGenre(rating, genre);
    }

    @WebMethod(operationName = "createNewMovie")
    @Override
    public int createNewMovie(@WebParam(name = "name") String name,
                              @WebParam(name = "year") int year,
                              @WebParam(name = "rating") int rating,
                              @WebParam(name = "genre") String genre,
                              @WebParam(name = "director") String director)
                              throws IllegalParameterException {
        if(name == null || name.trim().isEmpty()){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("name is not specified", fault);
        }
        if(year < 0){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("year cannot be negative", fault);
        }
        if(rating < 1 && rating > 10){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("rating should be in 1 to 10 range", fault);
        }
        if(genre == null || genre.trim().isEmpty()){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("genre is not specified", fault);
        }
        if(director == null || director.trim().isEmpty()){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("director is not specified", fault);
        }
        Movie movie = new Movie(0, year, rating, name, genre, director);
        return dbMovie.createNewMovie(movie);
    }

    @WebMethod(operationName = "updateMovie")
    @Override
    public int updateMovie(@WebParam(name = "id") int id,
                           @WebParam(name = "name") String name,
                           @WebParam(name = "year") int year,
                           @WebParam(name = "rating") int rating,
                           @WebParam(name = "genre") String genre,
                           @WebParam(name = "director") String director)
                           throws IllegalParameterException {

        System.out.println(selectById(id).getId());
        if(selectById(id).getId() == 0){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("Row with this id not found", fault);
        }

        if(year < 0){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("year cannot be negative", fault);
        }
        if(rating < 1 && rating > 10){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("rating should be in 1 to 10 range", fault);
        }
        if(genre == null || genre.trim().isEmpty()){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("genre is not specified", fault);
        }
        if(director == null || director.trim().isEmpty()){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("director is not specified", fault);
        }
        Movie movie = new Movie(id, year, rating, name, genre, director);
        return dbMovie.updateMovie(movie);
    }

    @WebMethod(operationName = "deleteMovie")
    @Override
    public int deleteMovie(@WebParam(name = "id") int id) throws IllegalParameterException{
        if(selectById(id).getId() == 0){
            MovieServiceFault fault = MovieServiceFault.defaultInstance();
            throw new IllegalParameterException("Row with this id not found", fault);
        }
        return dbMovie.deleteMovie(id);
    }
}
