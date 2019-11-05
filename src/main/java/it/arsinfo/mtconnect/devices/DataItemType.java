//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         A abstract measurement
 *       
 * 
 * <p>Classe Java per DataItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{urn:mtconnect.org:MTConnectDevices:1.3}SourceType" minOccurs="0"/>
 *         &lt;element name="Constraints" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemConstraintsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.3}NameType" />
 *       &lt;attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}IDType" />
 *       &lt;attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemEnumType" />
 *       &lt;attribute name="subType" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemSubEnumType" />
 *       &lt;attribute name="statistic" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemStatisticsType" />
 *       &lt;attribute name="units" type="{urn:mtconnect.org:MTConnectDevices:1.3}UnitsType" />
 *       &lt;attribute name="nativeUnits" type="{urn:mtconnect.org:MTConnectDevices:1.3}NativeUnitsType" />
 *       &lt;attribute name="nativeScale" type="{urn:mtconnect.org:MTConnectDevices:1.3}NativeScaleType" />
 *       &lt;attribute name="category" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}CategoryType" />
 *       &lt;attribute name="coordinateSystem" type="{urn:mtconnect.org:MTConnectDevices:1.3}CoordinateSystemType" />
 *       &lt;attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectDevices:1.3}SampleRateType" />
 *       &lt;attribute name="representation" type="{urn:mtconnect.org:MTConnectDevices:1.3}RepresentationType" default="VALUE" />
 *       &lt;attribute name="significantDigits" type="{urn:mtconnect.org:MTConnectDevices:1.3}SignificantDigitsValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataItemType", propOrder = {
    "source",
    "constraints"
})
public class DataItemType {

    @XmlElement(name = "Source")
    protected SourceType source;
    @XmlElement(name = "Constraints")
    protected DataItemConstraintsType constraints;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "subType")
    protected String subType;
    @XmlAttribute(name = "statistic")
    protected String statistic;
    @XmlAttribute(name = "units")
    protected String units;
    @XmlAttribute(name = "nativeUnits")
    protected String nativeUnits;
    @XmlAttribute(name = "nativeScale")
    protected Float nativeScale;
    @XmlAttribute(name = "category", required = true)
    protected CategoryType category;
    @XmlAttribute(name = "coordinateSystem")
    protected CoordinateSystemType coordinateSystem;
    @XmlAttribute(name = "sampleRate")
    protected Float sampleRate;
    @XmlAttribute(name = "representation")
    protected RepresentationType representation;
    @XmlAttribute(name = "significantDigits")
    protected BigInteger significantDigits;

    /**
     * Recupera il valore della proprietà source.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Imposta il valore della proprietà source.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Recupera il valore della proprietà constraints.
     * 
     * @return
     *     possible object is
     *     {@link DataItemConstraintsType }
     *     
     */
    public DataItemConstraintsType getConstraints() {
        return constraints;
    }

    /**
     * Imposta il valore della proprietà constraints.
     * 
     * @param value
     *     allowed object is
     *     {@link DataItemConstraintsType }
     *     
     */
    public void setConstraints(DataItemConstraintsType value) {
        this.constraints = value;
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
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Recupera il valore della proprietà nativeScale.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNativeScale() {
        return nativeScale;
    }

    /**
     * Imposta il valore della proprietà nativeScale.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNativeScale(Float value) {
        this.nativeScale = value;
    }

    /**
     * Recupera il valore della proprietà category.
     * 
     * @return
     *     possible object is
     *     {@link CategoryType }
     *     
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * Imposta il valore della proprietà category.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *     
     */
    public void setCategory(CategoryType value) {
        this.category = value;
    }

    /**
     * Recupera il valore della proprietà coordinateSystem.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemType }
     *     
     */
    public CoordinateSystemType getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * Imposta il valore della proprietà coordinateSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemType }
     *     
     */
    public void setCoordinateSystem(CoordinateSystemType value) {
        this.coordinateSystem = value;
    }

    /**
     * Recupera il valore della proprietà sampleRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleRate() {
        return sampleRate;
    }

    /**
     * Imposta il valore della proprietà sampleRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleRate(Float value) {
        this.sampleRate = value;
    }

    /**
     * Recupera il valore della proprietà representation.
     * 
     * @return
     *     possible object is
     *     {@link RepresentationType }
     *     
     */
    public RepresentationType getRepresentation() {
        if (representation == null) {
            return RepresentationType.VALUE;
        } else {
            return representation;
        }
    }

    /**
     * Imposta il valore della proprietà representation.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentationType }
     *     
     */
    public void setRepresentation(RepresentationType value) {
        this.representation = value;
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

}
