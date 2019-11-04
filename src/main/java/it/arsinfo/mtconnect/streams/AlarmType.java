//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         DEPRECATED: An Notifcation event
 *       
 * 
 * <p>Classe Java per AlarmType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AlarmType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>EventType">
 *       &lt;attribute name="code" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}NotifcationCodeType" />
 *       &lt;attribute name="severity" type="{urn:mtconnect.org:MTConnectStreams:1.3}SeverityType" />
 *       &lt;attribute name="state" type="{urn:mtconnect.org:MTConnectStreams:1.3}AlarmStateType" />
 *       &lt;attribute name="nativeCode" use="required" type="{urn:mtconnect.org:MTConnectStreams:1.3}NativeNotifcationCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmType")
public class AlarmType
    extends EventType
{

    @XmlAttribute(name = "code", required = true)
    protected NotifcationCodeType code;
    @XmlAttribute(name = "severity")
    protected SeverityType severity;
    @XmlAttribute(name = "state")
    protected AlarmStateType state;
    @XmlAttribute(name = "nativeCode", required = true)
    protected String nativeCode;

    /**
     * Recupera il valore della proprietà code.
     * 
     * @return
     *     possible object is
     *     {@link NotifcationCodeType }
     *     
     */
    public NotifcationCodeType getCode() {
        return code;
    }

    /**
     * Imposta il valore della proprietà code.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifcationCodeType }
     *     
     */
    public void setCode(NotifcationCodeType value) {
        this.code = value;
    }

    /**
     * Recupera il valore della proprietà severity.
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Imposta il valore della proprietà severity.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     */
    public void setSeverity(SeverityType value) {
        this.severity = value;
    }

    /**
     * Recupera il valore della proprietà state.
     * 
     * @return
     *     possible object is
     *     {@link AlarmStateType }
     *     
     */
    public AlarmStateType getState() {
        return state;
    }

    /**
     * Imposta il valore della proprietà state.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmStateType }
     *     
     */
    public void setState(AlarmStateType value) {
        this.state = value;
    }

    /**
     * Recupera il valore della proprietà nativeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCode() {
        return nativeCode;
    }

    /**
     * Imposta il valore della proprietà nativeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeCode(String value) {
        this.nativeCode = value;
    }

}
