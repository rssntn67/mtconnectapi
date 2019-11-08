//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         A cutting tool
 *       
 * 
 * <p>Classe Java per CuttingToolType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CuttingToolType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mtconnect.org:MTConnectAssets:1.3}AssetType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{urn:mtconnect.org:MTConnectAssets:1.3}AssetDescriptionType" minOccurs="0"/>
 *         &lt;element name="CuttingToolArchetypeReference" type="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingToolArchetypeReferenceType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="CuttingToolDefinition" type="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingToolDefinitionType"/>
 *             &lt;element name="CuttingToolLifeCycle" type="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingToolLifeCycleType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="CuttingToolLifeCycle" type="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingToolLifeCycleType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="serialNumber" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}SerialNumberType" />
 *       &lt;attribute name="manufacturers" type="{urn:mtconnect.org:MTConnectAssets:1.3}ManufacturersType" />
 *       &lt;attribute name="toolId" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.3}ToolIdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingToolType", propOrder = {
    "rest"
})
public class CuttingToolType
    extends AssetType
{

    @XmlElementRefs({
        @XmlElementRef(name = "CuttingToolArchetypeReference", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CuttingToolDefinition", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Description", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CuttingToolLifeCycle", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "serialNumber", required = true)
    protected String serialNumber;
    @XmlAttribute(name = "manufacturers")
    protected String manufacturers;
    @XmlAttribute(name = "toolId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String toolId;

    /**
     * Recupera il resto del modello di contenuto. 
     * 
     * <p>
     * Questa proprietà "catch-all" viene recuperata per il seguente motivo: 
     * Il nome di campo "CuttingToolLifeCycle" è usato da due diverse parti di uno schema. Vedere: 
     * riga 1016 di file:/Users/antonio/Rcs/Sixtema/mtconnectapi/src/main/resources/xsds/MTConnectAssets_1.3.xsd
     * riga 1008 di file:/Users/antonio/Rcs/Sixtema/mtconnectapi/src/main/resources/xsds/MTConnectAssets_1.3.xsd
     * <p>
     * Per eliminare questa proprietà, applicare una personalizzazione della proprietà a una 
     * delle seguenti due dichiarazioni per modificarne il nome: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CuttingToolArchetypeReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssetDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingToolLifeCycleType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    /**
     * Recupera il valore della proprietà serialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Imposta il valore della proprietà serialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
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

    /**
     * Recupera il valore della proprietà toolId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolId() {
        return toolId;
    }

    /**
     * Imposta il valore della proprietà toolId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolId(String value) {
        this.toolId = value;
    }

}
