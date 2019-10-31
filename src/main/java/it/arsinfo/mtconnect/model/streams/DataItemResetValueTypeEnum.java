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
 * <p>Classe Java per DataItemResetValueTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataItemResetValueTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTION_COMPLETE"/>
 *     &lt;enumeration value="ANNUAL"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="LIFE"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="POWER_ON"/>
 *     &lt;enumeration value="SHIFT"/>
 *     &lt;enumeration value="WEEK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemResetValueTypeEnum")
@XmlEnum
public enum DataItemResetValueTypeEnum {

    ACTION_COMPLETE,
    ANNUAL,
    DAY,
    LIFE,
    MAINTENANCE,
    MANUAL,
    MONTH,
    POWER_ON,
    SHIFT,
    WEEK;

    public String value() {
        return name();
    }

    public static DataItemResetValueTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
