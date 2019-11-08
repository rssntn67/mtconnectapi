//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         An edge into a tool assembly
 *       
 * 
 * <p>Classe Java per CuttingItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CuttingItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{urn:mtconnect.org:MTConnectAssets:1.3}AssetDescriptionType" minOccurs="0"/>
 *         &lt;element name="Locus" type="{urn:mtconnect.org:MTConnectAssets:1.3}LocusType" minOccurs="0"/>
 *         &lt;element name="ItemLife" type="{urn:mtconnect.org:MTConnectAssets:1.3}LifeType" maxOccurs="3" minOccurs="0"/>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Measurements" type="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingItemMeasurementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="indices" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}IndexRangeType" />
 *       &lt;attribute name="itemId" type="{urn:mtconnect.org:MTConnectAssets:1.3}ItemIdType" />
 *       &lt;attribute name="grade" type="{urn:mtconnect.org:MTConnectAssets:1.3}GradeType" />
 *       &lt;attribute name="manufacturers" type="{urn:mtconnect.org:MTConnectAssets:1.3}ManufacturersType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingItemType", propOrder = {
    "description",
    "locus",
    "itemLife",
    "any",
    "measurements"
})
public class CuttingItemType {

    @XmlElement(name = "Description")
    protected AssetDescriptionType description;
    @XmlElement(name = "Locus")
    protected String locus;
    @XmlElement(name = "ItemLife")
    protected List<LifeType> itemLife;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Measurements")
    protected CuttingItemMeasurementsType measurements;
    @XmlAttribute(name = "indices", required = true)
    protected String indices;
    @XmlAttribute(name = "itemId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemId;
    @XmlAttribute(name = "grade")
    protected String grade;
    @XmlAttribute(name = "manufacturers")
    protected String manufacturers;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link AssetDescriptionType }
     *     
     */
    public AssetDescriptionType getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetDescriptionType }
     *     
     */
    public void setDescription(AssetDescriptionType value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà locus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocus() {
        return locus;
    }

    /**
     * Imposta il valore della proprietà locus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocus(String value) {
        this.locus = value;
    }

    /**
     * Gets the value of the itemLife property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLife property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLife().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeType }
     * 
     * 
     */
    public List<LifeType> getItemLife() {
        if (itemLife == null) {
            itemLife = new ArrayList<LifeType>();
        }
        return this.itemLife;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Recupera il valore della proprietà measurements.
     * 
     * @return
     *     possible object is
     *     {@link CuttingItemMeasurementsType }
     *     
     */
    public CuttingItemMeasurementsType getMeasurements() {
        return measurements;
    }

    /**
     * Imposta il valore della proprietà measurements.
     * 
     * @param value
     *     allowed object is
     *     {@link CuttingItemMeasurementsType }
     *     
     */
    public void setMeasurements(CuttingItemMeasurementsType value) {
        this.measurements = value;
    }

    /**
     * Recupera il valore della proprietà indices.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndices() {
        return indices;
    }

    /**
     * Imposta il valore della proprietà indices.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndices(String value) {
        this.indices = value;
    }

    /**
     * Recupera il valore della proprietà itemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Imposta il valore della proprietà itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Recupera il valore della proprietà grade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Imposta il valore della proprietà grade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Recupera il valore della proprietà manufacturers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturers() {
        return manufacturers;
    }

    /**
     * Imposta il valore della proprietà manufacturers.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturers(String value) {
        this.manufacturers = value;
    }

}
