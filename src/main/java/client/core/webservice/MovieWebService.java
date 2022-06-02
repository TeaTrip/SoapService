
package client.core.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieWebService", targetNamespace = "http://webservice.core/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieWebService {


    /**
     * 
     * @param id
     * @return
     *     returns client.core.webservice.Movie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectById", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectById")
    @ResponseWrapper(localName = "selectByIdResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByIdResponse")
    public Movie selectById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param rating
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByRating", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByRating")
    @ResponseWrapper(localName = "selectByRatingResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByRatingResponse")
    public List<Movie> selectByRating(
        @WebParam(name = "rating", targetNamespace = "")
        int rating);

    /**
     * 
     * @param director
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByDirector", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByDirector")
    @ResponseWrapper(localName = "selectByDirectorResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByDirectorResponse")
    public List<Movie> selectByDirector(
        @WebParam(name = "director", targetNamespace = "")
        String director);

    /**
     * 
     * @param genre
     * @param name
     * @param year
     * @param rating
     * @param director
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createNewMovie", targetNamespace = "http://webservice.core/", className = "client.core.webservice.CreateNewMovie")
    @ResponseWrapper(localName = "createNewMovieResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.CreateNewMovieResponse")
    public int createNewMovie(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "rating", targetNamespace = "")
        int rating,
        @WebParam(name = "genre", targetNamespace = "")
        String genre,
        @WebParam(name = "director", targetNamespace = "")
        String director);

    /**
     * 
     * @param genre
     * @param id
     * @param name
     * @param year
     * @param rating
     * @param director
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://webservice.core/", className = "client.core.webservice.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.UpdateMovieResponse")
    public int updateMovie(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "rating", targetNamespace = "")
        int rating,
        @WebParam(name = "genre", targetNamespace = "")
        String genre,
        @WebParam(name = "director", targetNamespace = "")
        String director);

    /**
     * 
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://webservice.core/", className = "client.core.webservice.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.DeleteMovieResponse")
    public int deleteMovie(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectAll", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectAll")
    @ResponseWrapper(localName = "selectAllResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectAllResponse")
    public List<Movie> selectAll();

    /**
     * 
     * @param year
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByYear", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYear")
    @ResponseWrapper(localName = "selectByYearResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYearResponse")
    public List<Movie> selectByYear(
        @WebParam(name = "year", targetNamespace = "")
        int year);

    /**
     * 
     * @param name
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByName", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByName")
    @ResponseWrapper(localName = "selectByNameResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByNameResponse")
    public List<Movie> selectByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param genre
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByGenre", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByGenre")
    @ResponseWrapper(localName = "selectByGenreResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByGenreResponse")
    public List<Movie> selectByGenre(
        @WebParam(name = "genre", targetNamespace = "")
        String genre);

    /**
     * 
     * @param genre
     * @param rating
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByRatingAndGenre", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByRatingAndGenre")
    @ResponseWrapper(localName = "selectByRatingAndGenreResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByRatingAndGenreResponse")
    public List<Movie> selectByRatingAndGenre(
        @WebParam(name = "rating", targetNamespace = "")
        String rating,
        @WebParam(name = "genre", targetNamespace = "")
        String genre);

    /**
     * 
     * @param year
     * @param rating
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByYearAndRating", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYearAndRating")
    @ResponseWrapper(localName = "selectByYearAndRatingResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYearAndRatingResponse")
    public List<Movie> selectByYearAndRating(
        @WebParam(name = "year", targetNamespace = "")
        String year,
        @WebParam(name = "rating", targetNamespace = "")
        String rating);

    /**
     * 
     * @param genre
     * @param year
     * @return
     *     returns java.util.List<client.core.webservice.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "selectByYearAndGenre", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYearAndGenre")
    @ResponseWrapper(localName = "selectByYearAndGenreResponse", targetNamespace = "http://webservice.core/", className = "client.core.webservice.SelectByYearAndGenreResponse")
    public List<Movie> selectByYearAndGenre(
        @WebParam(name = "year", targetNamespace = "")
        String year,
        @WebParam(name = "genre", targetNamespace = "")
        String genre);

}
