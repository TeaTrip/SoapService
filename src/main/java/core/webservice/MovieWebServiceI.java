package core.webservice;

import core.errors.IllegalParameterException;
import core.errors.ThrottlingException;
import core.models.Movie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

public interface MovieWebServiceI {
    public List<Movie> selectAll() throws ThrottlingException;

    public Movie selectById(int id);

    public List<Movie> selectByYear(int year);

    public List<Movie> selectByRating(int rating);

    public List<Movie> selectByName(String name);

    public List<Movie> selectByGenre(String genre);

    public List<Movie> selectByDirector(String director);

    public List<Movie> selectByYearAndRating(String year, String rating);

    public List<Movie> selectByYearAndGenre(String year, String genre);

    public List<Movie> selectByRatingAndGenre(String rating, String genre);

    public int createNewMovie(String name, int year, int rating, String genre, String director) throws IllegalParameterException;

    public int updateMovie(int id, String name, int year, int rating, String genre, String director) throws IllegalParameterException;

    public int deleteMovie(int id) throws IllegalParameterException;
}
