//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:05:49 PM CET 
//


package it.arsinfo.mtconnect.model.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Calibration data for a sensor
 *       
 * 
 * <p>Classe Java per SensorConfigurationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SensorConfigurationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mtconnect.org:MTConnectDevices:1.4}AbstractConfigurationType">
 *       &lt;sequence>
 *         &lt;element name="FirmwareVersion" type="{urn:mtconnect.org:MTConnectDevices:1.4}FirmwareVersionType"/>
 *         &lt;element name="CalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.4}CalibrationDateType" minOccurs="0"/>
 *         &lt;element name="NextCalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.4}NextCalibrationDateType" minOccurs="0"/>
 *         &lt;element name="CalibrationInitials" type="{urn:mtconnect.org:MTConnectDevices:1.4}CalibrationInitialsType" minOccurs="0"/>
 *         &lt;element name="Channels" type="{urn:mtconnect.org:MTConnectDevices:1.4}ChannelsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorConfigurationType", propOrder = {
    "firmwareVersion",
    "calibrationDate",
    "nextCalibrationDate",
    "calibrationInitials",
    "channels"
})
public class SensorConfigurationType
    extends AbstractConfigurationType
{

    @XmlElement(name = "FirmwareVersion", required = true)
    protected String firmwareVersion;
    @XmlElement(name = "CalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calibrationDate;
    @XmlElement(name = "NextCalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCalibrationDate;
    @XmlElement(name = "CalibrationInitials")
    protected String calibrationInitials;
    @XmlElement(name = "Channels")
    protected ChannelsType channels;

    /**
     * Recupera il valore della proprietà firmwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Imposta il valore della proprietà firmwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
    }

    /**
     * Recupera il valore della proprietà calibrationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalibrationDate() {
        return calibrationDate;
    }

    /**
     * Imposta il valore della proprietà calibrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalibrationDate(XMLGregorianCalendar value) {
        this.calibrationDate = value;
    }

    /**
     * Recupera il valore della proprietà nextCalibrationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextCalibrationDate() {
        return nextCalibrationDate;
    }

    /**
     * Imposta il valore della proprietà nextCalibrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextCalibrationDate(XMLGregorianCalendar value) {
        this.nextCalibrationDate = value;
    }

    /**
     * Recupera il valore della proprietà calibrationInitials.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationInitials() {
        return calibrationInitials;
    }

    /**
     * Imposta il valore della proprietà calibrationInitials.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationInitials(String value) {
        this.calibrationInitials = value;
    }

    /**
     * Recupera il valore della proprietà channels.
     * 
     * @return
     *     possible object is
     *     {@link ChannelsType }
     *     
     */
    public ChannelsType getChannels() {
        return channels;
    }

    /**
     * Imposta il valore della proprietà channels.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelsType }
     *     
     */
    public void setChannels(ChannelsType value) {
        this.channels = value;
    }

}
