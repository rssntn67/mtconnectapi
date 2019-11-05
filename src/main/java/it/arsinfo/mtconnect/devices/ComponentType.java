//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         An abstract component type. This is a placeholder for all components
 *       
 * 
 * <p>Classe Java per ComponentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentDescriptionType" minOccurs="0"/>
 *         &lt;element name="Configuration" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentConfigurationType" minOccurs="0"/>
 *         &lt;element name="DataItems" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemsType" minOccurs="0"/>
 *         &lt;element name="Components" type="{urn:mtconnect.org:MTConnectDevices:1.3}ComponentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}IDType" />
 *       &lt;attribute name="nativeName" type="{urn:mtconnect.org:MTConnectDevices:1.3}NameType" />
 *       &lt;attribute name="sampleInterval" type="{urn:mtconnect.org:MTConnectDevices:1.3}SampleIntervalType" />
 *       &lt;attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectDevices:1.3}SampleRateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentType", propOrder = {
    "description",
    "configuration",
    "dataItems",
    "components"
})
@XmlSeeAlso({
    DeviceType.class,
    CommonComponentType.class
})
public abstract class ComponentType {

    @XmlElement(name = "Description")
    protected ComponentDescriptionType description;
    @XmlElement(name = "Configuration")
    protected ComponentConfigurationType configuration;
    @XmlElement(name = "DataItems")
    protected DataItemsType dataItems;
    @XmlElement(name = "Components")
    protected ComponentsType components;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "nativeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nativeName;
    @XmlAttribute(name = "sampleInterval")
    protected Float sampleInterval;
    @XmlAttribute(name = "sampleRate")
    protected Float sampleRate;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link ComponentDescriptionType }
     *     
     */
    public ComponentDescriptionType getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDescriptionType }
     *     
     */
    public void setDescription(ComponentDescriptionType value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà configuration.
     * 
     * @return
     *     possible object is
     *     {@link ComponentConfigurationType }
     *     
     */
    public ComponentConfigurationType getConfiguration() {
        return configuration;
    }

    /**
     * Imposta il valore della proprietà configuration.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentConfigurationType }
     *     
     */
    public void setConfiguration(ComponentConfigurationType value) {
        this.configuration = value;
    }

    /**
     * Recupera il valore della proprietà dataItems.
     * 
     * @return
     *     possible object is
     *     {@link DataItemsType }
     *     
     */
    public DataItemsType getDataItems() {
        return dataItems;
    }

    /**
     * Imposta il valore della proprietà dataItems.
     * 
     * @param value
     *     allowed object is
     *     {@link DataItemsType }
     *     
     */
    public void setDataItems(DataItemsType value) {
        this.dataItems = value;
    }

    /**
     * Recupera il valore della proprietà components.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsType }
     *     
     */
    public ComponentsType getComponents() {
        return components;
    }

    /**
     * Imposta il valore della proprietà components.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsType }
     *     
     */
    public void setComponents(ComponentsType value) {
        this.components = value;
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
     * Recupera il valore della proprietà nativeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeName() {
        return nativeName;
    }

    /**
     * Imposta il valore della proprietà nativeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeName(String value) {
        this.nativeName = value;
    }

    /**
     * Recupera il valore della proprietà sampleInterval.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleInterval() {
        return sampleInterval;
    }

    /**
     * Imposta il valore della proprietà sampleInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleInterval(Float value) {
        this.sampleInterval = value;
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

}
