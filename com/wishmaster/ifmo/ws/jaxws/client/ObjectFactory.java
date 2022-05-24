
package com.wishmaster.ifmo.ws.jaxws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wishmaster.ifmo.ws.jaxws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelectByYear_QNAME = new QName("http://webservice.core/", "selectByYear");
    private final static QName _SelectById_QNAME = new QName("http://webservice.core/", "selectById");
    private final static QName _SelectByGenre_QNAME = new QName("http://webservice.core/", "selectByGenre");
    private final static QName _SelectByDirector_QNAME = new QName("http://webservice.core/", "selectByDirector");
    private final static QName _SelectByName_QNAME = new QName("http://webservice.core/", "selectByName");
    private final static QName _SelectByYearAndRatingResponse_QNAME = new QName("http://webservice.core/", "selectByYearAndRatingResponse");
    private final static QName _SelectByIdResponse_QNAME = new QName("http://webservice.core/", "selectByIdResponse");
    private final static QName _SelectByRatingAndGenreResponse_QNAME = new QName("http://webservice.core/", "selectByRatingAndGenreResponse");
    private final static QName _SelectByDirectorResponse_QNAME = new QName("http://webservice.core/", "selectByDirectorResponse");
    private final static QName _SelectByYearAndRating_QNAME = new QName("http://webservice.core/", "selectByYearAndRating");
    private final static QName _SelectByYearResponse_QNAME = new QName("http://webservice.core/", "selectByYearResponse");
    private final static QName _SelectByGenreResponse_QNAME = new QName("http://webservice.core/", "selectByGenreResponse");
    private final static QName _SelectByNameResponse_QNAME = new QName("http://webservice.core/", "selectByNameResponse");
    private final static QName _SelectByRatingAndGenre_QNAME = new QName("http://webservice.core/", "selectByRatingAndGenre");
    private final static QName _SelectByYearAndGenre_QNAME = new QName("http://webservice.core/", "selectByYearAndGenre");
    private final static QName _SelectByYearAndGenreResponse_QNAME = new QName("http://webservice.core/", "selectByYearAndGenreResponse");
    private final static QName _SelectAll_QNAME = new QName("http://webservice.core/", "selectAll");
    private final static QName _SelectAllResponse_QNAME = new QName("http://webservice.core/", "selectAllResponse");
    private final static QName _SelectByRating_QNAME = new QName("http://webservice.core/", "selectByRating");
    private final static QName _SelectByRatingResponse_QNAME = new QName("http://webservice.core/", "selectByRatingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wishmaster.ifmo.ws.jaxws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectByYearAndRatingResponse }
     * 
     */
    public SelectByYearAndRatingResponse createSelectByYearAndRatingResponse() {
        return new SelectByYearAndRatingResponse();
    }

    /**
     * Create an instance of {@link SelectByYearAndGenre }
     * 
     */
    public SelectByYearAndGenre createSelectByYearAndGenre() {
        return new SelectByYearAndGenre();
    }

    /**
     * Create an instance of {@link SelectByGenre }
     * 
     */
    public SelectByGenre createSelectByGenre() {
        return new SelectByGenre();
    }

    /**
     * Create an instance of {@link SelectById }
     * 
     */
    public SelectById createSelectById() {
        return new SelectById();
    }

    /**
     * Create an instance of {@link SelectByYearAndGenreResponse }
     * 
     */
    public SelectByYearAndGenreResponse createSelectByYearAndGenreResponse() {
        return new SelectByYearAndGenreResponse();
    }

    /**
     * Create an instance of {@link SelectByName }
     * 
     */
    public SelectByName createSelectByName() {
        return new SelectByName();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link SelectByGenreResponse }
     * 
     */
    public SelectByGenreResponse createSelectByGenreResponse() {
        return new SelectByGenreResponse();
    }

    /**
     * Create an instance of {@link SelectByDirector }
     * 
     */
    public SelectByDirector createSelectByDirector() {
        return new SelectByDirector();
    }

    /**
     * Create an instance of {@link SelectByYearAndRating }
     * 
     */
    public SelectByYearAndRating createSelectByYearAndRating() {
        return new SelectByYearAndRating();
    }

    /**
     * Create an instance of {@link SelectByYearResponse }
     * 
     */
    public SelectByYearResponse createSelectByYearResponse() {
        return new SelectByYearResponse();
    }

    /**
     * Create an instance of {@link SelectByNameResponse }
     * 
     */
    public SelectByNameResponse createSelectByNameResponse() {
        return new SelectByNameResponse();
    }

    /**
     * Create an instance of {@link SelectByRatingAndGenre }
     * 
     */
    public SelectByRatingAndGenre createSelectByRatingAndGenre() {
        return new SelectByRatingAndGenre();
    }

    /**
     * Create an instance of {@link SelectByRating }
     * 
     */
    public SelectByRating createSelectByRating() {
        return new SelectByRating();
    }

    /**
     * Create an instance of {@link SelectByIdResponse }
     * 
     */
    public SelectByIdResponse createSelectByIdResponse() {
        return new SelectByIdResponse();
    }

    /**
     * Create an instance of {@link SelectAll }
     * 
     */
    public SelectAll createSelectAll() {
        return new SelectAll();
    }

    /**
     * Create an instance of {@link SelectByYear }
     * 
     */
    public SelectByYear createSelectByYear() {
        return new SelectByYear();
    }

    /**
     * Create an instance of {@link SelectByDirectorResponse }
     * 
     */
    public SelectByDirectorResponse createSelectByDirectorResponse() {
        return new SelectByDirectorResponse();
    }

    /**
     * Create an instance of {@link SelectAllResponse }
     * 
     */
    public SelectAllResponse createSelectAllResponse() {
        return new SelectAllResponse();
    }

    /**
     * Create an instance of {@link SelectByRatingAndGenreResponse }
     * 
     */
    public SelectByRatingAndGenreResponse createSelectByRatingAndGenreResponse() {
        return new SelectByRatingAndGenreResponse();
    }

    /**
     * Create an instance of {@link SelectByRatingResponse }
     * 
     */
    public SelectByRatingResponse createSelectByRatingResponse() {
        return new SelectByRatingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYear")
    public JAXBElement<SelectByYear> createSelectByYear(SelectByYear value) {
        return new JAXBElement<SelectByYear>(_SelectByYear_QNAME, SelectByYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectById")
    public JAXBElement<SelectById> createSelectById(SelectById value) {
        return new JAXBElement<SelectById>(_SelectById_QNAME, SelectById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByGenre")
    public JAXBElement<SelectByGenre> createSelectByGenre(SelectByGenre value) {
        return new JAXBElement<SelectByGenre>(_SelectByGenre_QNAME, SelectByGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByDirector")
    public JAXBElement<SelectByDirector> createSelectByDirector(SelectByDirector value) {
        return new JAXBElement<SelectByDirector>(_SelectByDirector_QNAME, SelectByDirector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByName")
    public JAXBElement<SelectByName> createSelectByName(SelectByName value) {
        return new JAXBElement<SelectByName>(_SelectByName_QNAME, SelectByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearAndRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYearAndRatingResponse")
    public JAXBElement<SelectByYearAndRatingResponse> createSelectByYearAndRatingResponse(SelectByYearAndRatingResponse value) {
        return new JAXBElement<SelectByYearAndRatingResponse>(_SelectByYearAndRatingResponse_QNAME, SelectByYearAndRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByIdResponse")
    public JAXBElement<SelectByIdResponse> createSelectByIdResponse(SelectByIdResponse value) {
        return new JAXBElement<SelectByIdResponse>(_SelectByIdResponse_QNAME, SelectByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByRatingAndGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByRatingAndGenreResponse")
    public JAXBElement<SelectByRatingAndGenreResponse> createSelectByRatingAndGenreResponse(SelectByRatingAndGenreResponse value) {
        return new JAXBElement<SelectByRatingAndGenreResponse>(_SelectByRatingAndGenreResponse_QNAME, SelectByRatingAndGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByDirectorResponse")
    public JAXBElement<SelectByDirectorResponse> createSelectByDirectorResponse(SelectByDirectorResponse value) {
        return new JAXBElement<SelectByDirectorResponse>(_SelectByDirectorResponse_QNAME, SelectByDirectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearAndRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYearAndRating")
    public JAXBElement<SelectByYearAndRating> createSelectByYearAndRating(SelectByYearAndRating value) {
        return new JAXBElement<SelectByYearAndRating>(_SelectByYearAndRating_QNAME, SelectByYearAndRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYearResponse")
    public JAXBElement<SelectByYearResponse> createSelectByYearResponse(SelectByYearResponse value) {
        return new JAXBElement<SelectByYearResponse>(_SelectByYearResponse_QNAME, SelectByYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByGenreResponse")
    public JAXBElement<SelectByGenreResponse> createSelectByGenreResponse(SelectByGenreResponse value) {
        return new JAXBElement<SelectByGenreResponse>(_SelectByGenreResponse_QNAME, SelectByGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByNameResponse")
    public JAXBElement<SelectByNameResponse> createSelectByNameResponse(SelectByNameResponse value) {
        return new JAXBElement<SelectByNameResponse>(_SelectByNameResponse_QNAME, SelectByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByRatingAndGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByRatingAndGenre")
    public JAXBElement<SelectByRatingAndGenre> createSelectByRatingAndGenre(SelectByRatingAndGenre value) {
        return new JAXBElement<SelectByRatingAndGenre>(_SelectByRatingAndGenre_QNAME, SelectByRatingAndGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearAndGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYearAndGenre")
    public JAXBElement<SelectByYearAndGenre> createSelectByYearAndGenre(SelectByYearAndGenre value) {
        return new JAXBElement<SelectByYearAndGenre>(_SelectByYearAndGenre_QNAME, SelectByYearAndGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByYearAndGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByYearAndGenreResponse")
    public JAXBElement<SelectByYearAndGenreResponse> createSelectByYearAndGenreResponse(SelectByYearAndGenreResponse value) {
        return new JAXBElement<SelectByYearAndGenreResponse>(_SelectByYearAndGenreResponse_QNAME, SelectByYearAndGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectAll")
    public JAXBElement<SelectAll> createSelectAll(SelectAll value) {
        return new JAXBElement<SelectAll>(_SelectAll_QNAME, SelectAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectAllResponse")
    public JAXBElement<SelectAllResponse> createSelectAllResponse(SelectAllResponse value) {
        return new JAXBElement<SelectAllResponse>(_SelectAllResponse_QNAME, SelectAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByRating")
    public JAXBElement<SelectByRating> createSelectByRating(SelectByRating value) {
        return new JAXBElement<SelectByRating>(_SelectByRating_QNAME, SelectByRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectByRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.core/", name = "selectByRatingResponse")
    public JAXBElement<SelectByRatingResponse> createSelectByRatingResponse(SelectByRatingResponse value) {
        return new JAXBElement<SelectByRatingResponse>(_SelectByRatingResponse_QNAME, SelectByRatingResponse.class, null, value);
    }

}
