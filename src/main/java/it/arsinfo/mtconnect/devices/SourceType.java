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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         A native data source
 *       
 * 
 * <p>Classe Java per SourceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SourceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectDevices:1.3>ItemSourceType">
 *       &lt;attribute name="componentId" type="{urn:mtconnect.org:MTConnectDevices:1.3}SourceComponentIdType" />
 *       &lt;attribute name="dataItemId" type="{urn:mtconnect.org:MTConnectDevices:1.3}SourceDataItemIdType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceType", propOrder = {
    "value"
})
public class SourceType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "componentId")
    @XmlIDREF
    protected Object componentId;
    @XmlAttribute(name = "dataItemId")
    @XmlIDREF
    protected Object dataItemId;

    /**
     * 
     *         The measurement source
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
     * Recupera il valore della proprietà componentId.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentId() {
        return componentId;
    }

    /**
     * Imposta il valore della proprietà componentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentId(Object value) {
        this.componentId = value;
    }

    /**
     * Recupera il valore della proprietà dataItemId.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataItemId() {
        return dataItemId;
    }

    /**
     * Imposta il valore della proprietà dataItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataItemId(Object value) {
        this.dataItemId = value;
    }

}
