
package org.occ.bibliot.client.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.occ.p3.client.endpoint package. 
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

    private final static QName _Init_QNAME = new QName("http://batch.serviceWeb.p3.occ.org/", "init");
    private final static QName _SendMailToLateBorrowMemberResponse_QNAME = new QName("http://batch.serviceWeb.p3.occ.org/", "sendMailToLateBorrowMemberResponse");
    private final static QName _InitResponse_QNAME = new QName("http://batch.serviceWeb.p3.occ.org/", "initResponse");
    private final static QName _SendMailToLateBorrowMember_QNAME = new QName("http://batch.serviceWeb.p3.occ.org/", "sendMailToLateBorrowMember");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.occ.p3.client.endpoint
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
     * Create an instance of {@link SendMailToLateBorrowMemberResponse }
     * 
     */
    public SendMailToLateBorrowMemberResponse createSendMailToLateBorrowMemberResponse() {
        return new SendMailToLateBorrowMemberResponse();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link SendMailToLateBorrowMember }
     * 
     */
    public SendMailToLateBorrowMember createSendMailToLateBorrowMember() {
        return new SendMailToLateBorrowMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://batch.serviceWeb.p3.occ.org/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailToLateBorrowMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://batch.serviceWeb.p3.occ.org/", name = "sendMailToLateBorrowMemberResponse")
    public JAXBElement<SendMailToLateBorrowMemberResponse> createSendMailToLateBorrowMemberResponse(SendMailToLateBorrowMemberResponse value) {
        return new JAXBElement<SendMailToLateBorrowMemberResponse>(_SendMailToLateBorrowMemberResponse_QNAME, SendMailToLateBorrowMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://batch.serviceWeb.p3.occ.org/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailToLateBorrowMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://batch.serviceWeb.p3.occ.org/", name = "sendMailToLateBorrowMember")
    public JAXBElement<SendMailToLateBorrowMember> createSendMailToLateBorrowMember(SendMailToLateBorrowMember value) {
        return new JAXBElement<SendMailToLateBorrowMember>(_SendMailToLateBorrowMember_QNAME, SendMailToLateBorrowMember.class, null, value);
    }

}
