//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The spindle speed properties of this tool
 *       
 * 
 * <p>Classe Java per ProcessSpindleSpeedType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessSpindleSpeedType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.4>SpeedType">
 *       &lt;attribute name="maximum" type="{urn:mtconnect.org:MTConnectAssets:1.4}MaximumType" />
 *       &lt;attribute name="minimum" type="{urn:mtconnect.org:MTConnectAssets:1.4}MinimumType" />
 *       &lt;attribute name="nominal" type="{urn:mtconnect.org:MTConnectAssets:1.4}NominalType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessSpindleSpeedType", propOrder = {
    "value"
})
public class ProcessSpindleSpeedType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "maximum")
    protected Float maximum;
    @XmlAttribute(name = "minimum")
    protected Float minimum;
    @XmlAttribute(name = "nominal")
    protected Float nominal;

    /**
     * 
     *         A speed in RPM or mm/s
     *       
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà maximum.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximum() {
        return maximum;
    }

    /**
     * Imposta il valore della proprietà maximum.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximum(Float value) {
        this.maximum = value;
    }

    /**
     * Recupera il valore della proprietà minimum.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimum() {
        return minimum;
    }

    /**
     * Imposta il valore della proprietà minimum.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimum(Float value) {
        this.minimum = value;
    }

    /**
     * Recupera il valore della proprietà nominal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominal() {
        return nominal;
    }

    /**
     * Imposta il valore della proprietà nominal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominal(Float value) {
        this.nominal = value;
    }

}
