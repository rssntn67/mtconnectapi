//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:05:49 PM CET 
//


package it.arsinfo.mtconnect.model.devices;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Message header for protocol information
 *       
 * 
 * <p>Classe Java per HeaderType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetCounts" type="{urn:mtconnect.org:MTConnectDevices:1.4}AssetCountsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}VersionType" />
 *       &lt;attribute name="creationTime" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}CreationTimeType" />
 *       &lt;attribute name="testIndicator" type="{urn:mtconnect.org:MTConnectDevices:1.4}TestIndicatorType" />
 *       &lt;attribute name="instanceId" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}InstanceIdType" />
 *       &lt;attribute name="sender" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}SenderType" />
 *       &lt;attribute name="bufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}BufferSizeType" />
 *       &lt;attribute name="assetBufferSize" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}AssetBufferSizeType" />
 *       &lt;attribute name="assetCount" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}AssetCountAttrType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderType", propOrder = {
    "assetCounts"
})
public class HeaderType {

    @XmlElement(name = "AssetCounts")
    protected AssetCountsType assetCounts;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "creationTime", required = true)
    protected XMLGregorianCalendar creationTime;
    @XmlAttribute(name = "testIndicator")
    protected Boolean testIndicator;
    @XmlAttribute(name = "instanceId", required = true)
    protected BigInteger instanceId;
    @XmlAttribute(name = "sender", required = true)
    protected String sender;
    @XmlAttribute(name = "bufferSize", required = true)
    protected long bufferSize;
    @XmlAttribute(name = "assetBufferSize", required = true)
    protected long assetBufferSize;
    @XmlAttribute(name = "assetCount", required = true)
    protected long assetCount;

    /**
     * Recupera il valore della proprietà assetCounts.
     * 
     * @return
     *     possible object is
     *     {@link AssetCountsType }
     *     
     */
    public AssetCountsType getAssetCounts() {
        return assetCounts;
    }

    /**
     * Imposta il valore della proprietà assetCounts.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetCountsType }
     *     
     */
    public void setAssetCounts(AssetCountsType value) {
        this.assetCounts = value;
    }

    /**
     * Recupera il valore della proprietà version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Imposta il valore della proprietà version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Recupera il valore della proprietà creationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Imposta il valore della proprietà creationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Recupera il valore della proprietà testIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestIndicator() {
        return testIndicator;
    }

    /**
     * Imposta il valore della proprietà testIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestIndicator(Boolean value) {
        this.testIndicator = value;
    }

    /**
     * Recupera il valore della proprietà instanceId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstanceId() {
        return instanceId;
    }

    /**
     * Imposta il valore della proprietà instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstanceId(BigInteger value) {
        this.instanceId = value;
    }

    /**
     * Recupera il valore della proprietà sender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Imposta il valore della proprietà sender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Recupera il valore della proprietà bufferSize.
     * 
     */
    public long getBufferSize() {
        return bufferSize;
    }

    /**
     * Imposta il valore della proprietà bufferSize.
     * 
     */
    public void setBufferSize(long value) {
        this.bufferSize = value;
    }

    /**
     * Recupera il valore della proprietà assetBufferSize.
     * 
     */
    public long getAssetBufferSize() {
        return assetBufferSize;
    }

    /**
     * Imposta il valore della proprietà assetBufferSize.
     * 
     */
    public void setAssetBufferSize(long value) {
        this.assetBufferSize = value;
    }

    /**
     * Recupera il valore della proprietà assetCount.
     * 
     */
    public long getAssetCount() {
        return assetCount;
    }

    /**
     * Imposta il valore della proprietà assetCount.
     * 
     */
    public void setAssetCount(long value) {
        this.assetCount = value;
    }

}
