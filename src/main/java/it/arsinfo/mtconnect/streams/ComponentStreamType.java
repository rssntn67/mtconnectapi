//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

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
 *         The stream of data for a component
 *       
 * 
 * <p>Classe Java per ComponentStreamType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ComponentStreamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Samples" type="{urn:mtconnect.org:MTConnectStreams:1.3}SamplesType" minOccurs="0"/>
 *         &lt;element name="Events" type="{urn:mtconnect.org:MTConnectStreams:1.3}EventsType" minOccurs="0"/>
 *         &lt;element name="Condition" type="{urn:mtconnect.org:MTConnectStreams:1.3}ConditionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="componentId" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}ComponentIdType" />
 *       &lt;attribute name="name" type="{urn:mtconnect.org:MTConnectStreams:1.3}NameType" />
 *       &lt;attribute name="nativeName" type="{urn:mtconnect.org:MTConnectStreams:1.3}NameType" />
 *       &lt;attribute name="component" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}NameType" />
 *       &lt;attribute name="uuid" type="{urn:mtconnect.org:MTConnectStreams:1.3}UuidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentStreamType", propOrder = {
    "samples",
    "events",
    "condition"
})
public class ComponentStreamType {

    @XmlElement(name = "Samples")
    protected SamplesType samples;
    @XmlElement(name = "Events")
    protected EventsType events;
    @XmlElement(name = "Condition")
    protected ConditionListType condition;
    @XmlAttribute(name = "componentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String componentId;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "nativeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nativeName;
    @XmlAttribute(name = "component", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String component;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Recupera il valore della proprietà samples.
     * 
     * @return
     *     possible object is
     *     {@link SamplesType }
     *     
     */
    public SamplesType getSamples() {
        return samples;
    }

    /**
     * Imposta il valore della proprietà samples.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplesType }
     *     
     */
    public void setSamples(SamplesType value) {
        this.samples = value;
    }

    /**
     * Recupera il valore della proprietà events.
     * 
     * @return
     *     possible object is
     *     {@link EventsType }
     *     
     */
    public EventsType getEvents() {
        return events;
    }

    /**
     * Imposta il valore della proprietà events.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsType }
     *     
     */
    public void setEvents(EventsType value) {
        this.events = value;
    }

    /**
     * Recupera il valore della proprietà condition.
     * 
     * @return
     *     possible object is
     *     {@link ConditionListType }
     *     
     */
    public ConditionListType getCondition() {
        return condition;
    }

    /**
     * Imposta il valore della proprietà condition.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionListType }
     *     
     */
    public void setCondition(ConditionListType value) {
        this.condition = value;
    }

    /**
     * Recupera il valore della proprietà componentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Imposta il valore della proprietà componentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentId(String value) {
        this.componentId = value;
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
     * Recupera il valore della proprietà component.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponent() {
        return component;
    }

    /**
     * Imposta il valore della proprietà component.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponent(String value) {
        this.component = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
