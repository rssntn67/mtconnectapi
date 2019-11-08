//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:22:43 PM CET 
//


package it.arsinfo.mtconnect.error;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.arsinfo.mtconnect.error package. 
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

    private final static QName _MTConnectError_QNAME = new QName("urn:mtconnect.org:MTConnectError:1.3", "MTConnectError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.arsinfo.mtconnect.error
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MTConnectErrorType }
     * 
     */
    public MTConnectErrorType createMTConnectErrorType() {
        return new MTConnectErrorType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTConnectErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectError:1.3", name = "MTConnectError")
    public JAXBElement<MTConnectErrorType> createMTConnectError(MTConnectErrorType value) {
        return new JAXBElement<MTConnectErrorType>(_MTConnectError_QNAME, MTConnectErrorType.class, null, value);
    }

}
