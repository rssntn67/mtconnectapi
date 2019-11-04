//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The root node for MTConnect
 *       
 * 
 * <p>Classe Java per MTConnectStreamsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MTConnectStreamsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:mtconnect.org:MTConnectStreams:1.3}HeaderType"/>
 *         &lt;element name="Streams" type="{urn:mtconnect.org:MTConnectStreams:1.3}StreamsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTConnectStreamsType", propOrder = {
    "header",
    "streams"
})
public class MTConnectStreamsType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Streams", required = true)
    protected StreamsType streams;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HeaderType }
     *     
     */
    public HeaderType getHeader() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderType }
     *     
     */
    public void setHeader(HeaderType value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà streams.
     * 
     * @return
     *     possible object is
     *     {@link StreamsType }
     *     
     */
    public StreamsType getStreams() {
        return streams;
    }

    /**
     * Imposta il valore della proprietà streams.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamsType }
     *     
     */
    public void setStreams(StreamsType value) {
        this.streams = value;
    }

}
