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
 * <p>Classe Java per DataItemSubEnumTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataItemSubEnumTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE"/>
 *     &lt;enumeration value="ACTUAL"/>
 *     &lt;enumeration value="ACTION"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ALTERNATING"/>
 *     &lt;enumeration value="AUXILIARY"/>
 *     &lt;enumeration value="A_SCALE"/>
 *     &lt;enumeration value="BAD"/>
 *     &lt;enumeration value="BRINELL"/>
 *     &lt;enumeration value="B_SCALE"/>
 *     &lt;enumeration value="COMMANDED"/>
 *     &lt;enumeration value="CONTROL"/>
 *     &lt;enumeration value="C_SCALE"/>
 *     &lt;enumeration value="DELAY"/>
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="DRY_RUN"/>
 *     &lt;enumeration value="DYNAMIC"/>
 *     &lt;enumeration value="D_SCALE"/>
 *     &lt;enumeration value="FIXTURE"/>
 *     &lt;enumeration value="GOOD"/>
 *     &lt;enumeration value="JOG"/>
 *     &lt;enumeration value="INCREMENTAL"/>
 *     &lt;enumeration value="KINETIC"/>
 *     &lt;enumeration value="LATERAL"/>
 *     &lt;enumeration value="LEEB"/>
 *     &lt;enumeration value="LENGTH"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="LINEAR"/>
 *     &lt;enumeration value="LOADED"/>
 *     &lt;enumeration value="MACHINE_AXIS_LOCK"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="MANUAL_UNCLAMP"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="MOHS"/>
 *     &lt;enumeration value="MOLE"/>
 *     &lt;enumeration value="MOTION"/>
 *     &lt;enumeration value="NO_SCALE"/>
 *     &lt;enumeration value="OPERATOR"/>
 *     &lt;enumeration value="OPERATING"/>
 *     &lt;enumeration value="OPTIONAL_STOP"/>
 *     &lt;enumeration value="TOOL_CHANGE_STOP"/>
 *     &lt;enumeration value="OVERRIDE"/>
 *     &lt;enumeration value="PRIMARY"/>
 *     &lt;enumeration value="PROBE"/>
 *     &lt;enumeration value="PROGRAMMED"/>
 *     &lt;enumeration value="POWERED"/>
 *     &lt;enumeration value="PROCESS"/>
 *     &lt;enumeration value="RADIAL"/>
 *     &lt;enumeration value="RAPID"/>
 *     &lt;enumeration value="RELATIVE"/>
 *     &lt;enumeration value="REMAINING"/>
 *     &lt;enumeration value="REQUEST"/>
 *     &lt;enumeration value="RESPONSE"/>
 *     &lt;enumeration value="ROCKWELL"/>
 *     &lt;enumeration value="ROTARY"/>
 *     &lt;enumeration value="SET_UP"/>
 *     &lt;enumeration value="SHORE"/>
 *     &lt;enumeration value="SINGLE_BLOCK"/>
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="SWITCHED"/>
 *     &lt;enumeration value="TARGET"/>
 *     &lt;enumeration value="TOOL"/>
 *     &lt;enumeration value="USABLE"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="VICKERS"/>
 *     &lt;enumeration value="VOLUME"/>
 *     &lt;enumeration value="WORKING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemSubEnumTypeEnum")
@XmlEnum
public enum DataItemSubEnumTypeEnum {

    ABSOLUTE,
    ACTUAL,
    ACTION,
    ALL,
    ALTERNATING,
    AUXILIARY,
    A_SCALE,
    BAD,
    BRINELL,
    B_SCALE,
    COMMANDED,
    CONTROL,
    C_SCALE,
    DELAY,
    DIRECT,
    DRY_RUN,
    DYNAMIC,
    D_SCALE,
    FIXTURE,
    GOOD,
    JOG,
    INCREMENTAL,
    KINETIC,
    LATERAL,
    LEEB,
    LENGTH,
    LINE,
    LINEAR,
    LOADED,
    MACHINE_AXIS_LOCK,
    MAINTENANCE,
    MANUAL_UNCLAMP,
    MAXIMUM,
    MINIMUM,
    MOHS,
    MOLE,
    MOTION,
    NO_SCALE,
    OPERATOR,
    OPERATING,
    OPTIONAL_STOP,
    TOOL_CHANGE_STOP,
    OVERRIDE,
    PRIMARY,
    PROBE,
    PROGRAMMED,
    POWERED,
    PROCESS,
    RADIAL,
    RAPID,
    RELATIVE,
    REMAINING,
    REQUEST,
    RESPONSE,
    ROCKWELL,
    ROTARY,
    SET_UP,
    SHORE,
    SINGLE_BLOCK,
    STANDARD,
    SWITCHED,
    TARGET,
    TOOL,
    USABLE,
    VERTICAL,
    VICKERS,
    VOLUME,
    WORKING;

    public String value() {
        return name();
    }

    public static DataItemSubEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
