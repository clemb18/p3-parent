
package org.occ.p3.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.occ.p3.serviceweb package. 
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

    private final static QName _GetBookById_QNAME = new QName("http://serviceWeb.p3.occ.org/", "getBookById");
    private final static QName _SaveNewBookResponse_QNAME = new QName("http://serviceWeb.p3.occ.org/", "saveNewBookResponse");
    private final static QName _InitResponse_QNAME = new QName("http://serviceWeb.p3.occ.org/", "initResponse");
    private final static QName _GetBookByIdResponse_QNAME = new QName("http://serviceWeb.p3.occ.org/", "getBookByIdResponse");
    private final static QName _Init_QNAME = new QName("http://serviceWeb.p3.occ.org/", "init");
    private final static QName _SaveNewBook_QNAME = new QName("http://serviceWeb.p3.occ.org/", "saveNewBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.occ.p3.serviceweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link SaveNewBook }
     * 
     */
    public SaveNewBook createSaveNewBook() {
        return new SaveNewBook();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link SaveNewBookResponse }
     * 
     */
    public SaveNewBookResponse createSaveNewBookResponse() {
        return new SaveNewBookResponse();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<GetBookById>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "saveNewBookResponse")
    public JAXBElement<SaveNewBookResponse> createSaveNewBookResponse(SaveNewBookResponse value) {
        return new JAXBElement<SaveNewBookResponse>(_SaveNewBookResponse_QNAME, SaveNewBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<GetBookByIdResponse>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceWeb.p3.occ.org/", name = "saveNewBook")
    public JAXBElement<SaveNewBook> createSaveNewBook(SaveNewBook value) {
        return new JAXBElement<SaveNewBook>(_SaveNewBook_QNAME, SaveNewBook.class, null, value);
    }

}
