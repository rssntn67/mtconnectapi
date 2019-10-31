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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         The calibration channel
 *       
 * 
 * <p>Classe Java per ChannelType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChannelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{urn:mtconnect.org:MTConnectDevices:1.4}DescriptionTextType" minOccurs="0"/>
 *         &lt;element name="CalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.4}CalibrationDateType" minOccurs="0"/>
 *         &lt;element name="NextCalibrationDate" type="{urn:mtconnect.org:MTConnectDevices:1.4}NextCalibrationDateType" minOccurs="0"/>
 *         &lt;element name="CalibrationInitials" type="{urn:mtconnect.org:MTConnectDevices:1.4}CalibrationInitialsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" use="required" type="{urn:mtconnect.org:MTConnectDevices:1.4}ChannelNumberType" />
 *       &lt;attribute name="name" type="{urn:mtconnect.org:MTConnectDevices:1.4}NameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelType", propOrder = {
    "description",
    "calibrationDate",
    "nextCalibrationDate",
    "calibrationInitials"
})
public class ChannelType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calibrationDate;
    @XmlElement(name = "NextCalibrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextCalibrationDate;
    @XmlElement(name = "CalibrationInitials")
    protected String calibrationInitials;
    @XmlAttribute(name = "number", required = true)
    protected BigInteger number;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Recupera il valore della proprietà number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
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

}
