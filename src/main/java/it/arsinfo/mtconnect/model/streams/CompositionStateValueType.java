//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompositionStateValueType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositionStateValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="RIGHT"/>
 *     &lt;enumeration value="LEFT"/>
 *     &lt;enumeration value="TRANSITIONING"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="UNLATCHED"/>
 *     &lt;enumeration value="ON"/>
 *     &lt;enumeration value="OFF"/>
 *     &lt;enumeration value="UP"/>
 *     &lt;enumeration value="DOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompositionStateValueType")
@XmlEnum
public enum CompositionStateValueType {

    ACTIVE,
    INACTIVE,
    RIGHT,
    LEFT,
    TRANSITIONING,
    OPEN,
    CLOSED,
    UNLATCHED,
    ON,
    OFF,
    UP,
    DOWN;

    public String value() {
        return name();
    }

    public static CompositionStateValueType fromValue(String v) {
        return valueOf(v);
    }

}
