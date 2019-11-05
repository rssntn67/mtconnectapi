//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The root node for MTConnect
 *       
 * 
 * <p>Classe Java per MTConnectDevicesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MTConnectDevicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:mtconnect.org:MTConnectDevices:1.3}HeaderType"/>
 *         &lt;element name="Devices" type="{urn:mtconnect.org:MTConnectDevices:1.3}DevicesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTConnectDevicesType", propOrder = {
    "header",
    "devices"
})
public class MTConnectDevicesType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Devices", required = true)
    protected DevicesType devices;

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
     * Recupera il valore della proprietà devices.
     * 
     * @return
     *     possible object is
     *     {@link DevicesType }
     *     
     */
    public DevicesType getDevices() {
        return devices;
    }

    /**
     * Imposta il valore della proprietà devices.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicesType }
     *     
     */
    public void setDevices(DevicesType value) {
        this.devices = value;
    }

}
