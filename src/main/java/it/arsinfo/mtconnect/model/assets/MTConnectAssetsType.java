//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The root node for MTConnect
 *       
 * 
 * <p>Classe Java per MTConnectAssetsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MTConnectAssetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{urn:mtconnect.org:MTConnectAssets:1.4}HeaderType"/>
 *         &lt;element name="Assets" type="{urn:mtconnect.org:MTConnectAssets:1.4}AssetsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTConnectAssetsType", propOrder = {
    "header",
    "assets"
})
public class MTConnectAssetsType {

    @XmlElement(name = "Header", required = true)
    protected HeaderType header;
    @XmlElement(name = "Assets", required = true)
    protected AssetsType assets;

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
     * Recupera il valore della proprietà assets.
     * 
     * @return
     *     possible object is
     *     {@link AssetsType }
     *     
     */
    public AssetsType getAssets() {
        return assets;
    }

    /**
     * Imposta il valore della proprietà assets.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetsType }
     *     
     */
    public void setAssets(AssetsType value) {
        this.assets = value;
    }

}
