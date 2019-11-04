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
 * <p>Classe Java per DirectionValueType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLOCKWISE"/>
 *     &lt;enumeration value="COUNTER_CLOCKWISE"/>
 *     &lt;enumeration value="POSITIVE"/>
 *     &lt;enumeration value="NEGATIVE"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionValueType")
@XmlEnum
public enum DirectionValueType {

    CLOCKWISE,
    COUNTER_CLOCKWISE,
    POSITIVE,
    NEGATIVE,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static DirectionValueType fromValue(String v) {
        return valueOf(v);
    }

}
