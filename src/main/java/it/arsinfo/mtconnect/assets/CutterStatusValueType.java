//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CutterStatusValueType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CutterStatusValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *     &lt;enumeration value="ALLOCATED"/>
 *     &lt;enumeration value="UNALLOCATED"/>
 *     &lt;enumeration value="MEASURED"/>
 *     &lt;enumeration value="NOT_REGISTERED"/>
 *     &lt;enumeration value="RECONDITIONED"/>
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="TAGGED_OUT"/>
 *     &lt;enumeration value="BROKEN"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CutterStatusValueType")
@XmlEnum
public enum CutterStatusValueType {

    NEW,
    AVAILABLE,
    UNAVAILABLE,
    ALLOCATED,
    UNALLOCATED,
    MEASURED,
    NOT_REGISTERED,
    RECONDITIONED,
    USED,
    EXPIRED,
    TAGGED_OUT,
    BROKEN,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CutterStatusValueType fromValue(String v) {
        return valueOf(v);
    }

}
