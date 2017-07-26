
package com.interctec.java.webpage.ws.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.interctec.java.webpage.ws.services package. 
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

    private final static QName _AgregarUserNameRestricted_QNAME = new QName("http://services.webservices.java.interctec.com/", "agregarUserNameRestricted");
    private final static QName _ValidarUserName_QNAME = new QName("http://services.webservices.java.interctec.com/", "validarUserName");
    private final static QName _AgregarUserNameRestrictedResponse_QNAME = new QName("http://services.webservices.java.interctec.com/", "agregarUserNameRestrictedResponse");
    private final static QName _ValidarUserNameResponse_QNAME = new QName("http://services.webservices.java.interctec.com/", "validarUserNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.interctec.java.webpage.ws.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarUserNameRestrictedResponse }
     * 
     */
    public AgregarUserNameRestrictedResponse createAgregarUserNameRestrictedResponse() {
        return new AgregarUserNameRestrictedResponse();
    }

    /**
     * Create an instance of {@link ValidarUserNameResponse }
     * 
     */
    public ValidarUserNameResponse createValidarUserNameResponse() {
        return new ValidarUserNameResponse();
    }

    /**
     * Create an instance of {@link AgregarUserNameRestricted }
     * 
     */
    public AgregarUserNameRestricted createAgregarUserNameRestricted() {
        return new AgregarUserNameRestricted();
    }

    /**
     * Create an instance of {@link ValidarUserName }
     * 
     */
    public ValidarUserName createValidarUserName() {
        return new ValidarUserName();
    }

    /**
     * Create an instance of {@link RespuestaDTO }
     * 
     */
    public RespuestaDTO createRespuestaDTO() {
        return new RespuestaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUserNameRestricted }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.java.interctec.com/", name = "agregarUserNameRestricted")
    public JAXBElement<AgregarUserNameRestricted> createAgregarUserNameRestricted(AgregarUserNameRestricted value) {
        return new JAXBElement<AgregarUserNameRestricted>(_AgregarUserNameRestricted_QNAME, AgregarUserNameRestricted.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUserName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.java.interctec.com/", name = "validarUserName")
    public JAXBElement<ValidarUserName> createValidarUserName(ValidarUserName value) {
        return new JAXBElement<ValidarUserName>(_ValidarUserName_QNAME, ValidarUserName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUserNameRestrictedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.java.interctec.com/", name = "agregarUserNameRestrictedResponse")
    public JAXBElement<AgregarUserNameRestrictedResponse> createAgregarUserNameRestrictedResponse(AgregarUserNameRestrictedResponse value) {
        return new JAXBElement<AgregarUserNameRestrictedResponse>(_AgregarUserNameRestrictedResponse_QNAME, AgregarUserNameRestrictedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUserNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservices.java.interctec.com/", name = "validarUserNameResponse")
    public JAXBElement<ValidarUserNameResponse> createValidarUserNameResponse(ValidarUserNameResponse value) {
        return new JAXBElement<ValidarUserNameResponse>(_ValidarUserNameResponse_QNAME, ValidarUserNameResponse.class, null, value);
    }

}
