//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:22:43 PM CET 
//


package it.arsinfo.mtconnect.error;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ErrorCodeType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNAUTHORIZED"/>
 *     &lt;enumeration value="NO_DEVICE"/>
 *     &lt;enumeration value="OUT_OF_RANGE"/>
 *     &lt;enumeration value="TOO_MANY"/>
 *     &lt;enumeration value="INVALID_URI"/>
 *     &lt;enumeration value="INVALID_REQUEST"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="INVALID_PATH"/>
 *     &lt;enumeration value="UNSUPPORTED"/>
 *     &lt;enumeration value="ASSET_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCodeType")
@XmlEnum
public enum ErrorCodeType {

    UNAUTHORIZED,
    NO_DEVICE,
    OUT_OF_RANGE,
    TOO_MANY,
    INVALID_URI,
    INVALID_REQUEST,
    INTERNAL_ERROR,
    INVALID_PATH,
    UNSUPPORTED,
    ASSET_NOT_FOUND;

    public String value() {
        return name();
    }

    public static ErrorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
