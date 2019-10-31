//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The location of the tool in the tool changer (pot) or the station of the
 *         tool
 *       
 * 
 * <p>Classe Java per LocationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.4>LocationValueType">
 *       &lt;attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.4}LocationsType" />
 *       &lt;attribute name="negativeOverlap" type="{urn:mtconnect.org:MTConnectAssets:1.4}OverlapType" />
 *       &lt;attribute name="positiveOverlap" type="{urn:mtconnect.org:MTConnectAssets:1.4}OverlapType" />
 *       &lt;attribute name="turret" type="{urn:mtconnect.org:MTConnectAssets:1.4}TurretLocationType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "value"
})
public class LocationType {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "type", required = true)
    protected LocationsType type;
    @XmlAttribute(name = "negativeOverlap")
    protected BigInteger negativeOverlap;
    @XmlAttribute(name = "positiveOverlap")
    protected BigInteger positiveOverlap;
    @XmlAttribute(name = "turret")
    protected String turret;

    /**
     * 
     *         The tool location
     *       
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link LocationsType }
     *     
     */
    public LocationsType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationsType }
     *     
     */
    public void setType(LocationsType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà negativeOverlap.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegativeOverlap() {
        return negativeOverlap;
    }

    /**
     * Imposta il valore della proprietà negativeOverlap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegativeOverlap(BigInteger value) {
        this.negativeOverlap = value;
    }

    /**
     * Recupera il valore della proprietà positiveOverlap.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositiveOverlap() {
        return positiveOverlap;
    }

    /**
     * Imposta il valore della proprietà positiveOverlap.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositiveOverlap(BigInteger value) {
        this.positiveOverlap = value;
    }

    /**
     * Recupera il valore della proprietà turret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurret() {
        return turret;
    }

    /**
     * Imposta il valore della proprietà turret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurret(String value) {
        this.turret = value;
    }

}
