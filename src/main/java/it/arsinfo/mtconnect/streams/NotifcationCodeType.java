//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per NotifcationCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NotifcationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FAILURE"/>
 *     &lt;enumeration value="FAULT"/>
 *     &lt;enumeration value="CRASH"/>
 *     &lt;enumeration value="JAM"/>
 *     &lt;enumeration value="OVERLOAD"/>
 *     &lt;enumeration value="ESTOP"/>
 *     &lt;enumeration value="MATERIAL"/>
 *     &lt;enumeration value="MESSAGE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotifcationCodeType")
@XmlEnum
public enum NotifcationCodeType {

    FAILURE,
    FAULT,
    CRASH,
    JAM,
    OVERLOAD,
    ESTOP,
    MATERIAL,
    MESSAGE,
    OTHER;

    public String value() {
        return name();
    }

    public static NotifcationCodeType fromValue(String v) {
        return valueOf(v);
    }

}
