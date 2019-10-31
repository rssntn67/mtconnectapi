//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UnitsTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMPERE"/>
 *     &lt;enumeration value="CELSIUS"/>
 *     &lt;enumeration value="COUNT"/>
 *     &lt;enumeration value="DECIBEL"/>
 *     &lt;enumeration value="DEGREE"/>
 *     &lt;enumeration value="DEGREE/SECOND"/>
 *     &lt;enumeration value="DEGREE/SECOND^2"/>
 *     &lt;enumeration value="HERTZ"/>
 *     &lt;enumeration value="JOULE"/>
 *     &lt;enumeration value="KILOGRAM"/>
 *     &lt;enumeration value="LITER"/>
 *     &lt;enumeration value="LITER/SECOND"/>
 *     &lt;enumeration value="MICRO_RADIAN"/>
 *     &lt;enumeration value="MILLIMETER"/>
 *     &lt;enumeration value="MILLIMETER/SECOND"/>
 *     &lt;enumeration value="MILLIMETER/SECOND^2"/>
 *     &lt;enumeration value="MILLIMETER_3D"/>
 *     &lt;enumeration value="NEWTON"/>
 *     &lt;enumeration value="NEWTON_METER"/>
 *     &lt;enumeration value="OHM"/>
 *     &lt;enumeration value="PASCAL"/>
 *     &lt;enumeration value="PASCAL_SECOND"/>
 *     &lt;enumeration value="PERCENT"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="REVOLUTION/MINUTE"/>
 *     &lt;enumeration value="SECOND"/>
 *     &lt;enumeration value="SIEMENS/METER"/>
 *     &lt;enumeration value="SOUND_LEVEL"/>
 *     &lt;enumeration value="VOLT"/>
 *     &lt;enumeration value="VOLT_AMPERE"/>
 *     &lt;enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     &lt;enumeration value="WATT"/>
 *     &lt;enumeration value="WATT_SECOND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitsTypeEnum")
@XmlEnum
public enum UnitsTypeEnum {

    AMPERE("AMPERE"),
    CELSIUS("CELSIUS"),
    COUNT("COUNT"),
    DECIBEL("DECIBEL"),
    DEGREE("DEGREE"),
    @XmlEnumValue("DEGREE/SECOND")
    DEGREE_SECOND("DEGREE/SECOND"),
    @XmlEnumValue("DEGREE/SECOND^2")
    DEGREE_SECOND_2("DEGREE/SECOND^2"),
    HERTZ("HERTZ"),
    JOULE("JOULE"),
    KILOGRAM("KILOGRAM"),
    LITER("LITER"),
    @XmlEnumValue("LITER/SECOND")
    LITER_SECOND("LITER/SECOND"),
    MICRO_RADIAN("MICRO_RADIAN"),
    MILLIMETER("MILLIMETER"),
    @XmlEnumValue("MILLIMETER/SECOND")
    MILLIMETER_SECOND("MILLIMETER/SECOND"),
    @XmlEnumValue("MILLIMETER/SECOND^2")
    MILLIMETER_SECOND_2("MILLIMETER/SECOND^2"),
    @XmlEnumValue("MILLIMETER_3D")
    MILLIMETER_3_D("MILLIMETER_3D"),
    NEWTON("NEWTON"),
    NEWTON_METER("NEWTON_METER"),
    OHM("OHM"),
    PASCAL("PASCAL"),
    PASCAL_SECOND("PASCAL_SECOND"),
    PERCENT("PERCENT"),
    PH("PH"),
    @XmlEnumValue("REVOLUTION/MINUTE")
    REVOLUTION_MINUTE("REVOLUTION/MINUTE"),
    SECOND("SECOND"),
    @XmlEnumValue("SIEMENS/METER")
    SIEMENS_METER("SIEMENS/METER"),
    SOUND_LEVEL("SOUND_LEVEL"),
    VOLT("VOLT"),
    VOLT_AMPERE("VOLT_AMPERE"),
    VOLT_AMPERE_REACTIVE("VOLT_AMPERE_REACTIVE"),
    WATT("WATT"),
    WATT_SECOND("WATT_SECOND");
    private final String value;

    UnitsTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsTypeEnum fromValue(String v) {
        for (UnitsTypeEnum c: UnitsTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
