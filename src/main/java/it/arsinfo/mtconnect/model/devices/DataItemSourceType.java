//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:05:49 PM CET 
//


package it.arsinfo.mtconnect.model.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         A native data source
 *       
 * 
 * <p>Classe Java per DataItemSourceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataItemSourceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectDevices:1.4>ItemSourceType">
 *       &lt;attribute name="dataItemId" type="{urn:mtconnect.org:MTConnectDevices:1.4}SourceDataItemIdType" />
 *       &lt;attribute name="componentId" type="{urn:mtconnect.org:MTConnectDevices:1.4}SourceComponentIdType" />
 *       &lt;attribute name="compositionId" type="{urn:mtconnect.org:MTConnectDevices:1.4}CompositionIdType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataItemSourceType", propOrder = {
    "value"
})
public class DataItemSourceType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "dataItemId")
    @XmlIDREF
    protected Object dataItemId;
    @XmlAttribute(name = "componentId")
    @XmlIDREF
    protected Object componentId;
    @XmlAttribute(name = "compositionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String compositionId;

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
     * Recupera il valore della proprietà compositionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositionId() {
        return compositionId;
    }

    /**
     * Imposta il valore della proprietà compositionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositionId(String value) {
        this.compositionId = value;
    }

}
