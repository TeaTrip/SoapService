package core.webservice;

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
}
