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
 * <p>Classe Java per PathModeValueType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PathModeValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYNCHRONOUS"/>
 *     &lt;enumeration value="MIRROR"/>
 *     &lt;enumeration value="INDEPENDENT"/>
 *     &lt;enumeration value="MASTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PathModeValueType")
@XmlEnum
public enum PathModeValueType {

    SYNCHRONOUS,
    MIRROR,
    INDEPENDENT,
    MASTER;

    public String value() {
        return name();
    }

    public static PathModeValueType fromValue(String v) {
        return valueOf(v);
    }

}
