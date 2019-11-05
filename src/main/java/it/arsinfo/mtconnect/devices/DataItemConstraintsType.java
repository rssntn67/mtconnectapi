//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A set of limits for a data item
 *       
 * 
 * <p>Classe Java per DataItemConstraintsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataItemConstraintsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Value" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemValueElementType" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Minimum" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemValueType"/>
 *             &lt;element name="Maximum" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemValueType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Filter" type="{urn:mtconnect.org:MTConnectDevices:1.3}DataItemFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataItemConstraintsType", propOrder = {
    "value",
    "minimum",
    "maximum",
    "filter"
})
public class DataItemConstraintsType {

    @XmlElement(name = "Value")
    protected List<DataItemValueElementType> value;
    @XmlElement(name = "Minimum")
    protected String minimum;
    @XmlElement(name = "Maximum")
    protected String maximum;
    @XmlElement(name = "Filter")
    protected DataItemFilterType filter;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataItemValueElementType }
     * 
     * 
     */
    public List<DataItemValueElementType> getValue() {
        if (value == null) {
            value = new ArrayList<DataItemValueElementType>();
        }
        return this.value;
    }

    /**
     * Recupera il valore della proprietà minimum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimum() {
        return minimum;
    }

    /**
     * Imposta il valore della proprietà minimum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimum(String value) {
        this.minimum = value;
    }

    /**
     * Recupera il valore della proprietà maximum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximum() {
        return maximum;
    }

    /**
     * Imposta il valore della proprietà maximum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximum(String value) {
        this.maximum = value;
    }

    /**
     * Recupera il valore della proprietà filter.
     * 
     * @return
     *     possible object is
     *     {@link DataItemFilterType }
     *     
     */
    public DataItemFilterType getFilter() {
        return filter;
    }

    /**
     * Imposta il valore della proprietà filter.
     * 
     * @param value
     *     allowed object is
     *     {@link DataItemFilterType }
     *     
     */
    public void setFilter(DataItemFilterType value) {
        this.filter = value;
    }

}
