//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         An abstract type for edge measurements
 *       
 * 
 * <p>Classe Java per MeasurementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.3>MeasurementValueType">
 *       &lt;attribute name="significantDigits" type="{urn:mtconnect.org:MTConnectAssets:1.3}SignificantDigitsValueType" />
 *       &lt;attribute name="units" type="{urn:mtconnect.org:MTConnectAssets:1.3}UnitsType" />
 *       &lt;attribute name="nativeUnits" type="{urn:mtconnect.org:MTConnectAssets:1.3}NativeUnitsType" />
 *       &lt;attribute name="code" type="{urn:mtconnect.org:MTConnectAssets:1.3}CodeType" />
 *       &lt;attribute name="maximum" type="{urn:mtconnect.org:MTConnectAssets:1.3}MeasurementAttrType" />
 *       &lt;attribute name="minimum" type="{urn:mtconnect.org:MTConnectAssets:1.3}MeasurementAttrType" />
 *       &lt;attribute name="nominal" type="{urn:mtconnect.org:MTConnectAssets:1.3}MeasurementAttrType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AssemblyMeasurementType.class,
    CommonMeasurementType.class,
    CuttingItemMeasurementType.class
})
public abstract class MeasurementType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "significantDigits")
    protected BigInteger significantDigits;
    @XmlAttribute(name = "units")
    protected String units;
    @XmlAttribute(name = "nativeUnits")
    protected String nativeUnits;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "maximum")
    protected Float maximum;
    @XmlAttribute(name = "minimum")
    protected Float minimum;
    @XmlAttribute(name = "nominal")
    protected Float nominal;

    /**
     * 
     *         A measurement value
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
     * Recupera il valore della proprietà significantDigits.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificantDigits() {
        return significantDigits;
    }

    /**
     * Imposta il valore della proprietà significantDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificantDigits(BigInteger value) {
        this.significantDigits = value;
    }

    /**
     * Recupera il valore della proprietà units.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Imposta il valore della proprietà units.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Recupera il valore della proprietà nativeUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeUnits() {
        return nativeUnits;
    }

    /**
     * Imposta il valore della proprietà nativeUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeUnits(String value) {
        this.nativeUnits = value;
    }

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
