//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:05:49 PM CET 
//


package it.arsinfo.mtconnect.model.devices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CompositionEnumTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositionEnumTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTUATOR"/>
 *     &lt;enumeration value="AMPLIFIER"/>
 *     &lt;enumeration value="BALLSCREW"/>
 *     &lt;enumeration value="BATTERY"/>
 *     &lt;enumeration value="BELT"/>
 *     &lt;enumeration value="BRAKE"/>
 *     &lt;enumeration value="CIRCUIT_BREAKER"/>
 *     &lt;enumeration value="CHAIN"/>
 *     &lt;enumeration value="CHOPPER"/>
 *     &lt;enumeration value="CHUCK"/>
 *     &lt;enumeration value="CHUTE"/>
 *     &lt;enumeration value="CLAMP"/>
 *     &lt;enumeration value="COMPRESSON"/>
 *     &lt;enumeration value="DOOR"/>
 *     &lt;enumeration value="DRAIN"/>
 *     &lt;enumeration value="ENCODER"/>
 *     &lt;enumeration value="FAN"/>
 *     &lt;enumeration value="FILTER"/>
 *     &lt;enumeration value="GRIPPER"/>
 *     &lt;enumeration value="HOPPER"/>
 *     &lt;enumeration value="LINEAR_POSITION_FEEDBACK"/>
 *     &lt;enumeration value="MOTOR"/>
 *     &lt;enumeration value="OIL"/>
 *     &lt;enumeration value="PUMP"/>
 *     &lt;enumeration value="POWER_SUPPLY"/>
 *     &lt;enumeration value="PULLY"/>
 *     &lt;enumeration value="SENSING_ELEMENT"/>
 *     &lt;enumeration value="STORAGE_BATTERY"/>
 *     &lt;enumeration value="SWITCH"/>
 *     &lt;enumeration value="TANK"/>
 *     &lt;enumeration value="TENSIONER"/>
 *     &lt;enumeration value="TRANSFORMER"/>
 *     &lt;enumeration value="VALVE"/>
 *     &lt;enumeration value="WATER"/>
 *     &lt;enumeration value="WIRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompositionEnumTypeEnum")
@XmlEnum
public enum CompositionEnumTypeEnum {

    ACTUATOR,
    AMPLIFIER,
    BALLSCREW,
    BATTERY,
    BELT,
    BRAKE,
    CIRCUIT_BREAKER,
    CHAIN,
    CHOPPER,
    CHUCK,
    CHUTE,
    CLAMP,
    COMPRESSON,
    DOOR,
    DRAIN,
    ENCODER,
    FAN,
    FILTER,
    GRIPPER,
    HOPPER,
    LINEAR_POSITION_FEEDBACK,
    MOTOR,
    OIL,
    PUMP,
    POWER_SUPPLY,
    PULLY,
    SENSING_ELEMENT,
    STORAGE_BATTERY,
    SWITCH,
    TANK,
    TENSIONER,
    TRANSFORMER,
    VALVE,
    WATER,
    WIRE;

    public String value() {
        return name();
    }

    public static CompositionEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
