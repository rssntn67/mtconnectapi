//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         An abstract indicator of the device's condition
 *       
 * 
 * <p>Classe Java per ConditionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>ConditionDescriptionType">
 *       &lt;attribute name="sequence" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}SequenceType" />
 *       &lt;attribute name="timestamp" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}TimestampType" />
 *       &lt;attribute name="name" type="{urn:mtconnect.org:MTConnectStreams:1.3}NameType" />
 *       &lt;attribute name="dataItemId" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}DataItemIdType" />
 *       &lt;attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}DataItemEnumType" />
 *       &lt;attribute name="nativeCode" type="{urn:mtconnect.org:MTConnectStreams:1.3}NativeCodeType" />
 *       &lt;attribute name="nativeSeverity" type="{urn:mtconnect.org:MTConnectStreams:1.3}NativeSeverityType" />
 *       &lt;attribute name="qualifier" type="{urn:mtconnect.org:MTConnectStreams:1.3}QualifierType" />
 *       &lt;attribute name="statistic" type="{urn:mtconnect.org:MTConnectStreams:1.3}DataItemStatisticsType" />
 *       &lt;attribute name="subType" type="{urn:mtconnect.org:MTConnectStreams:1.3}DataItemSubEnumType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "value"
})
@XmlSeeAlso({
    FaultType.class,
    WarningType.class,
    NormalType.class,
    UnavailableType.class
})
public abstract class ConditionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "sequence", required = true)
    protected BigInteger sequence;
    @XmlAttribute(name = "timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "dataItemId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataItemId;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "nativeCode")
    protected String nativeCode;
    @XmlAttribute(name = "nativeSeverity")
    protected String nativeSeverity;
    @XmlAttribute(name = "qualifier")
    protected QualifierType qualifier;
    @XmlAttribute(name = "statistic")
    protected String statistic;
    @XmlAttribute(name = "subType")
    protected String subType;

    /**
     * 
     *         The description of the Condition
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
     * Recupera il valore della proprietà sequence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Imposta il valore della proprietà sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà dataItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataItemId() {
        return dataItemId;
    }

    /**
     * Imposta il valore della proprietà dataItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataItemId(String value) {
        this.dataItemId = value;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà nativeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCode() {
        return nativeCode;
    }

    /**
     * Imposta il valore della proprietà nativeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeCode(String value) {
        this.nativeCode = value;
    }

    /**
     * Recupera il valore della proprietà nativeSeverity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeSeverity() {
        return nativeSeverity;
    }

    /**
     * Imposta il valore della proprietà nativeSeverity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeSeverity(String value) {
        this.nativeSeverity = value;
    }

    /**
     * Recupera il valore della proprietà qualifier.
     * 
     * @return
     *     possible object is
     *     {@link QualifierType }
     *     
     */
    public QualifierType getQualifier() {
        return qualifier;
    }

    /**
     * Imposta il valore della proprietà qualifier.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifierType }
     *     
     */
    public void setQualifier(QualifierType value) {
        this.qualifier = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatistic(String value) {
        this.statistic = value;
    }

    /**
     * Recupera il valore della proprietà subType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Imposta il valore della proprietà subType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

}
