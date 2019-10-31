//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A archetypical cutting tool life cycle definition
 *       
 * 
 * <p>Classe Java per CuttingToolLifeCycleArchetypeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CuttingToolLifeCycleArchetypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReconditionCount" type="{urn:mtconnect.org:MTConnectAssets:1.4}ReconditionCountType" minOccurs="0"/>
 *         &lt;element name="CuttingToolLife" type="{urn:mtconnect.org:MTConnectAssets:1.4}LifeType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ProgramToolGroup" type="{urn:mtconnect.org:MTConnectAssets:1.4}ProgramToolGroupType" minOccurs="0"/>
 *         &lt;element name="ProgramToolNumber" type="{urn:mtconnect.org:MTConnectAssets:1.4}ProgramToolNumberType" minOccurs="0"/>
 *         &lt;element name="ProcessSpindleSpeed" type="{urn:mtconnect.org:MTConnectAssets:1.4}ProcessSpindleSpeedType" minOccurs="0"/>
 *         &lt;element name="ProcessFeedRate" type="{urn:mtconnect.org:MTConnectAssets:1.4}ProcessFeedRateType" minOccurs="0"/>
 *         &lt;element name="ConnectionCodeMachineSide" type="{urn:mtconnect.org:MTConnectAssets:1.4}ConnectionCodeMachineSideType" minOccurs="0"/>
 *         &lt;element name="Measurements" type="{urn:mtconnect.org:MTConnectAssets:1.4}AssemblyMeasurementsType" minOccurs="0"/>
 *         &lt;element name="CuttingItems" type="{urn:mtconnect.org:MTConnectAssets:1.4}CuttingItemsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingToolLifeCycleArchetypeType", propOrder = {
    "reconditionCount",
    "cuttingToolLife",
    "programToolGroup",
    "programToolNumber",
    "processSpindleSpeed",
    "processFeedRate",
    "connectionCodeMachineSide",
    "measurements",
    "cuttingItems"
})
public class CuttingToolLifeCycleArchetypeType {

    @XmlElement(name = "ReconditionCount")
    protected ReconditionCountType reconditionCount;
    @XmlElement(name = "CuttingToolLife")
    protected List<LifeType> cuttingToolLife;
    @XmlElement(name = "ProgramToolGroup")
    protected String programToolGroup;
    @XmlElement(name = "ProgramToolNumber")
    protected BigInteger programToolNumber;
    @XmlElement(name = "ProcessSpindleSpeed")
    protected ProcessSpindleSpeedType processSpindleSpeed;
    @XmlElement(name = "ProcessFeedRate")
    protected ProcessFeedRateType processFeedRate;
    @XmlElement(name = "ConnectionCodeMachineSide")
    protected String connectionCodeMachineSide;
    @XmlElement(name = "Measurements")
    protected AssemblyMeasurementsType measurements;
    @XmlElement(name = "CuttingItems")
    protected CuttingItemsType cuttingItems;

    /**
     * Recupera il valore della proprietà reconditionCount.
     * 
     * @return
     *     possible object is
     *     {@link ReconditionCountType }
     *     
     */
    public ReconditionCountType getReconditionCount() {
        return reconditionCount;
    }

    /**
     * Imposta il valore della proprietà reconditionCount.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconditionCountType }
     *     
     */
    public void setReconditionCount(ReconditionCountType value) {
        this.reconditionCount = value;
    }

    /**
     * Gets the value of the cuttingToolLife property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuttingToolLife property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuttingToolLife().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeType }
     * 
     * 
     */
    public List<LifeType> getCuttingToolLife() {
        if (cuttingToolLife == null) {
            cuttingToolLife = new ArrayList<LifeType>();
        }
        return this.cuttingToolLife;
    }

    /**
     * Recupera il valore della proprietà programToolGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramToolGroup() {
        return programToolGroup;
    }

    /**
     * Imposta il valore della proprietà programToolGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramToolGroup(String value) {
        this.programToolGroup = value;
    }

    /**
     * Recupera il valore della proprietà programToolNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgramToolNumber() {
        return programToolNumber;
    }

    /**
     * Imposta il valore della proprietà programToolNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgramToolNumber(BigInteger value) {
        this.programToolNumber = value;
    }

    /**
     * Recupera il valore della proprietà processSpindleSpeed.
     * 
     * @return
     *     possible object is
     *     {@link ProcessSpindleSpeedType }
     *     
     */
    public ProcessSpindleSpeedType getProcessSpindleSpeed() {
        return processSpindleSpeed;
    }

    /**
     * Imposta il valore della proprietà processSpindleSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessSpindleSpeedType }
     *     
     */
    public void setProcessSpindleSpeed(ProcessSpindleSpeedType value) {
        this.processSpindleSpeed = value;
    }

    /**
     * Recupera il valore della proprietà processFeedRate.
     * 
     * @return
     *     possible object is
     *     {@link ProcessFeedRateType }
     *     
     */
    public ProcessFeedRateType getProcessFeedRate() {
        return processFeedRate;
    }

    /**
     * Imposta il valore della proprietà processFeedRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessFeedRateType }
     *     
     */
    public void setProcessFeedRate(ProcessFeedRateType value) {
        this.processFeedRate = value;
    }

    /**
     * Recupera il valore della proprietà connectionCodeMachineSide.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCodeMachineSide() {
        return connectionCodeMachineSide;
    }

    /**
     * Imposta il valore della proprietà connectionCodeMachineSide.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCodeMachineSide(String value) {
        this.connectionCodeMachineSide = value;
    }

    /**
     * Recupera il valore della proprietà measurements.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyMeasurementsType }
     *     
     */
    public AssemblyMeasurementsType getMeasurements() {
        return measurements;
    }

    /**
     * Imposta il valore della proprietà measurements.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyMeasurementsType }
     *     
     */
    public void setMeasurements(AssemblyMeasurementsType value) {
        this.measurements = value;
    }

    /**
     * Recupera il valore della proprietà cuttingItems.
     * 
     * @return
     *     possible object is
     *     {@link CuttingItemsType }
     *     
     */
    public CuttingItemsType getCuttingItems() {
        return cuttingItems;
    }

    /**
     * Imposta il valore della proprietà cuttingItems.
     * 
     * @param value
     *     allowed object is
     *     {@link CuttingItemsType }
     *     
     */
    public void setCuttingItems(CuttingItemsType value) {
        this.cuttingItems = value;
    }

}
