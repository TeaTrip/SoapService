package core.methods.movie;

import core.models.Movie;

import java.util.List;

public interface MovieMethods {

    public List<Movie> selectAll();

    public Movie selectById(int id);

    public List<Movie> selectByYear(int year);

    public List<Movie> selectByRating(int rating);

    public List<Movie> selectByName(String name);

    public List<Movie> selectByGenre(String genre);

    public List<Movie> selectByDirector(String director);

    public List<Movie> selectByYearAndRating(String year, String rating);

    public List<Movie> selectByYearAndGenre(String year, String genre);

    public List<Movie> selectByRatingAndGenre(String rating, String genre);


}
