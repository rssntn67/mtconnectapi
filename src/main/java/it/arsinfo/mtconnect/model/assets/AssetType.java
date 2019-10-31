//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         An abstract mobile asset
 *       
 * 
 * <p>Classe Java per AssetType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="assetId" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.4}AssetIdType" />
 *       &lt;attribute name="timestamp" use="required" type="{urn:mtconnect.org:MTConnectAssets:1.4}TimestampType" />
 *       &lt;attribute name="deviceUuid" type="{urn:mtconnect.org:MTConnectAssets:1.4}UuidType" />
 *       &lt;attribute name="removed" type="{urn:mtconnect.org:MTConnectAssets:1.4}RemovedType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetType")
@XmlSeeAlso({
    CuttingToolArchetypeType.class,
    CuttingToolType.class
})
public abstract class AssetType {

    @XmlAttribute(name = "assetId", required = true)
    protected String assetId;
    @XmlAttribute(name = "timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "deviceUuid")
    protected String deviceUuid;
    @XmlAttribute(name = "removed")
    protected Boolean removed;

    /**
     * Recupera il valore della proprietà assetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Imposta il valore della proprietà assetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
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
     * Recupera il valore della proprietà deviceUuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceUuid() {
        return deviceUuid;
    }

    /**
     * Imposta il valore della proprietà deviceUuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceUuid(String value) {
        this.deviceUuid = value;
    }

    /**
     * Recupera il valore della proprietà removed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoved() {
        return removed;
    }

    /**
     * Imposta il valore della proprietà removed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoved(Boolean value) {
        this.removed = value;
    }

}
