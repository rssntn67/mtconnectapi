//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         Abstract cutter life
 *       
 * 
 * <p>Classe Java per LifeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LifeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.3>ToolLifeValueType">
 *       &lt;attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolLifeType" />
 *       &lt;attribute name="countDirection" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolLifeDirectionType" />
 *       &lt;attribute name="warning" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolLifeValueType" />
 *       &lt;attribute name="limit" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolLifeValueType" />
 *       &lt;attribute name="initial" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolLifeValueType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeType", propOrder = {
    "value"
})
public class LifeType {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "type", required = true)
    protected ToolLifeType type;
    @XmlAttribute(name = "countDirection", required = true)
    protected ToolLifeDirectionType countDirection;
    @XmlAttribute(name = "warning")
    protected Float warning;
    @XmlAttribute(name = "limit", required = true)
    protected float limit;
    @XmlAttribute(name = "initial", required = true)
    protected float initial;

    /**
     * 
     *         The life of the tool in time, wear, or parts
     *       
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link ToolLifeType }
     *     
     */
    public ToolLifeType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolLifeType }
     *     
     */
    public void setType(ToolLifeType value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà countDirection.
     * 
     * @return
     *     possible object is
     *     {@link ToolLifeDirectionType }
     *     
     */
    public ToolLifeDirectionType getCountDirection() {
        return countDirection;
    }

    /**
     * Imposta il valore della proprietà countDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolLifeDirectionType }
     *     
     */
    public void setCountDirection(ToolLifeDirectionType value) {
        this.countDirection = value;
    }

    /**
     * Recupera il valore della proprietà warning.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWarning() {
        return warning;
    }

    /**
     * Imposta il valore della proprietà warning.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWarning(Float value) {
        this.warning = value;
    }

    /**
     * Recupera il valore della proprietà limit.
     * 
     */
    public float getLimit() {
        return limit;
    }

    /**
     * Imposta il valore della proprietà limit.
     * 
     */
    public void setLimit(float value) {
        this.limit = value;
    }

    /**
     * Recupera il valore della proprietà initial.
     * 
     */
    public float getInitial() {
        return initial;
    }

    /**
     * Imposta il valore della proprietà initial.
     * 
     */
    public void setInitial(float value) {
        this.initial = value;
    }

}
