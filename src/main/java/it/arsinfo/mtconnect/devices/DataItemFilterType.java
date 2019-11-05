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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The filter for the data item
 *       
 * 
 * <p>Classe Java per DataItemFilterType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataItemFilterType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectDevices:1.3>FilterValueType">
 *       &lt;attribute name="type" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.3}FilterType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataItemFilterType", propOrder = {
    "value"
})
public class DataItemFilterType {

    @XmlValue
    protected float value;
    @XmlAttribute(name = "type", required = true)
    protected FilterType type;

    /**
     * 
     *         The minimum limit on the change in a value
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
     *     {@link FilterType }
     *     
     */
    public FilterType getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setType(FilterType value) {
        this.type = value;
    }

}
