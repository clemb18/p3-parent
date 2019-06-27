
package org.occ.p3.serviceweb.borrow;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.occ.p3.serviceweb.borrow package. 
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

    private final static QName _InitResponse_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "initResponse");
    private final static QName _TerminateBorrow_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "terminateBorrow");
    private final static QName _TerminateBorrowResponse_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "terminateBorrowResponse");
    private final static QName _ExtendBorrowResponse_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "extendBorrowResponse");
    private final static QName _BorrowBook_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "borrowBook");
    private final static QName _Init_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "init");
    private final static QName _ExtendBorrow_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "extendBorrow");
    private final static QName _BorrowBookResponse_QNAME = new QName("http://borrow.serviceWeb.p3.occ.org/", "borrowBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.occ.p3.serviceweb.borrow
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link BorrowBook }
     * 
     */
    public BorrowBook createBorrowBook() {
        return new BorrowBook();
    }

    /**
     * Create an instance of {@link ExtendBorrowResponse }
     * 
     */
    public ExtendBorrowResponse createExtendBorrowResponse() {
        return new ExtendBorrowResponse();
    }

    /**
     * Create an instance of {@link TerminateBorrow }
     * 
     */
    public TerminateBorrow createTerminateBorrow() {
        return new TerminateBorrow();
    }

    /**
     * Create an instance of {@link TerminateBorrowResponse }
     * 
     */
    public TerminateBorrowResponse createTerminateBorrowResponse() {
        return new TerminateBorrowResponse();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link BorrowBookResponse }
     * 
     */
    public BorrowBookResponse createBorrowBookResponse() {
        return new BorrowBookResponse();
    }

    /**
     * Create an instance of {@link ExtendBorrow }
     * 
     */
    public ExtendBorrow createExtendBorrow() {
        return new ExtendBorrow();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "terminateBorrow")
    public JAXBElement<TerminateBorrow> createTerminateBorrow(TerminateBorrow value) {
        return new JAXBElement<TerminateBorrow>(_TerminateBorrow_QNAME, TerminateBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminateBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "terminateBorrowResponse")
    public JAXBElement<TerminateBorrowResponse> createTerminateBorrowResponse(TerminateBorrowResponse value) {
        return new JAXBElement<TerminateBorrowResponse>(_TerminateBorrowResponse_QNAME, TerminateBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendBorrowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "extendBorrowResponse")
    public JAXBElement<ExtendBorrowResponse> createExtendBorrowResponse(ExtendBorrowResponse value) {
        return new JAXBElement<ExtendBorrowResponse>(_ExtendBorrowResponse_QNAME, ExtendBorrowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "borrowBook")
    public JAXBElement<BorrowBook> createBorrowBook(BorrowBook value) {
        return new JAXBElement<BorrowBook>(_BorrowBook_QNAME, BorrowBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendBorrow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "extendBorrow")
    public JAXBElement<ExtendBorrow> createExtendBorrow(ExtendBorrow value) {
        return new JAXBElement<ExtendBorrow>(_ExtendBorrow_QNAME, ExtendBorrow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrowBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://borrow.serviceWeb.p3.occ.org/", name = "borrowBookResponse")
    public JAXBElement<BorrowBookResponse> createBorrowBookResponse(BorrowBookResponse value) {
        return new JAXBElement<BorrowBookResponse>(_BorrowBookResponse_QNAME, BorrowBookResponse.class, null, value);
    }

}
