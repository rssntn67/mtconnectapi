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
 * <p>Classe Java per DataItemSubEnumTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataItemSubEnumTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTUAL"/>
 *     &lt;enumeration value="COMMANDED"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *     &lt;enumeration value="PROBE"/>
 *     &lt;enumeration value="TARGET"/>
 *     &lt;enumeration value="GOOD"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="CONTROL"/>
 *     &lt;enumeration value="ALTERNATING"/>
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="WEIGHT"/>
 *     &lt;enumeration value="VOLUME"/>
 *     &lt;enumeration value="MOLE"/>
 *     &lt;enumeration value="KINETIC"/>
 *     &lt;enumeration value="DYNAMIC"/>
 *     &lt;enumeration value="NO_SCALE"/>
 *     &lt;enumeration value="A_SCALE"/>
 *     &lt;enumeration value="B_SCALE"/>
 *     &lt;enumeration value="C_SCALE"/>
 *     &lt;enumeration value="D_SCALE"/>
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="RESPONSE"/>
 *     &lt;enumeration value="REMAINING"/>
 *     &lt;enumeration value="JOG"/>
 *     &lt;enumeration value="RAPID"/>
 *     &lt;enumeration value="PROGRAMMED"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="AUXILIARY"/>
 *     &lt;enumeration value="MANUAL_UNCLAMP"/>
 *     &lt;enumeration value="ROTARY"/>
 *     &lt;enumeration value="LINEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemSubEnumTypeEnum")
@XmlEnum
public enum DataItemSubEnumTypeEnum {

    ACTUAL,
    COMMANDED,
    MAXIMUM,
    MINIMUM,
    OTHER,
    OVERRIDE,
    PROBE,
    TARGET,
    GOOD,
    BAD,
    ALL,
    LINE,
    CONTROL,
    ALTERNATING,
    DIRECT,
    WEIGHT,
    VOLUME,
    MOLE,
    KINETIC,
    DYNAMIC,
    NO_SCALE,
    A_SCALE,
    B_SCALE,
    C_SCALE,
    D_SCALE,
    REQUEST,
    RESPONSE,
    REMAINING,
    JOG,
    RAPID,
    PROGRAMMED,
    PRIMARY,
    AUXILIARY,
    MANUAL_UNCLAMP,
    ROTARY,
    LINEAR;

    public String value() {
        return name();
    }

    public static DataItemSubEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
