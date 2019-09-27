
package org.occ.p3.serviceweb.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.occ.p3.serviceweb.user package. 
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

    private final static QName _InitResponse_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "initResponse");
    private final static QName _FindBorrowListByMember_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "findBorrowListByMember");
    private final static QName _Init_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "init");
    private final static QName _FindBorrowListByMemberResponse_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "findBorrowListByMemberResponse");
    private final static QName _IsValidUser_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "isValidUser");
    private final static QName _IsValidUserResponse_QNAME = new QName("http://user.serviceWeb.p3.occ.org/", "isValidUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.occ.p3.serviceweb.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindBorrowListByMemberResponse }
     * 
     */
    public FindBorrowListByMemberResponse createFindBorrowListByMemberResponse() {
        return new FindBorrowListByMemberResponse();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link FindBorrowListByMember }
     * 
     */
    public FindBorrowListByMember createFindBorrowListByMember() {
        return new FindBorrowListByMember();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link IsValidUserResponse }
     * 
     */
    public IsValidUserResponse createIsValidUserResponse() {
        return new IsValidUserResponse();
    }

    /**
     * Create an instance of {@link IsValidUser }
     * 
     */
    public IsValidUser createIsValidUser() {
        return new IsValidUser();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Member }
     * 
     */
    public Member createMember() {
        return new Member();
    }

    /**
     * Create an instance of {@link Borrow }
     * 
     */
    public Borrow createBorrow() {
        return new Borrow();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorrowListByMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "findBorrowListByMember")
    public JAXBElement<FindBorrowListByMember> createFindBorrowListByMember(FindBorrowListByMember value) {
        return new JAXBElement<FindBorrowListByMember>(_FindBorrowListByMember_QNAME, FindBorrowListByMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBorrowListByMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "findBorrowListByMemberResponse")
    public JAXBElement<FindBorrowListByMemberResponse> createFindBorrowListByMemberResponse(FindBorrowListByMemberResponse value) {
        return new JAXBElement<FindBorrowListByMemberResponse>(_FindBorrowListByMemberResponse_QNAME, FindBorrowListByMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValidUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "isValidUser")
    public JAXBElement<IsValidUser> createIsValidUser(IsValidUser value) {
        return new JAXBElement<IsValidUser>(_IsValidUser_QNAME, IsValidUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValidUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://user.serviceWeb.p3.occ.org/", name = "isValidUserResponse")
    public JAXBElement<IsValidUserResponse> createIsValidUserResponse(IsValidUserResponse value) {
        return new JAXBElement<IsValidUserResponse>(_IsValidUserResponse_QNAME, IsValidUserResponse.class, null, value);
    }

}
