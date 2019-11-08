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
 * <p>Classe Java per DataItemEnumTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataItemEnumTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCELERATION"/>
 *     &lt;enumeration value="ACTIVE_AXES"/>
 *     &lt;enumeration value="ALARM"/>
 *     &lt;enumeration value="AMPERAGE"/>
 *     &lt;enumeration value="ANGLE"/>
 *     &lt;enumeration value="ANGULAR_ACCELERATION"/>
 *     &lt;enumeration value="ANGULAR_VELOCITY"/>
 *     &lt;enumeration value="AVAILABILITY"/>
 *     &lt;enumeration value="AXIS_FEEDRATE"/>
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="DIRECTION"/>
 *     &lt;enumeration value="DOOR_STATE"/>
 *     &lt;enumeration value="EMERGENCY_STOP"/>
 *     &lt;enumeration value="EXECUTION"/>
 *     &lt;enumeration value="FREQUENCY"/>
 *     &lt;enumeration value="PART_COUNT"/>
 *     &lt;enumeration value="PART_ID"/>
 *     &lt;enumeration value="PATH_FEEDRATE"/>
 *     &lt;enumeration value="PATH_POSITION"/>
 *     &lt;enumeration value="PATH_MODE"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="CONTROLLER_MODE"/>
 *     &lt;enumeration value="LOAD"/>
 *     &lt;enumeration value="MESSAGE"/>
 *     &lt;enumeration value="POSITION"/>
 *     &lt;enumeration value="POWER_STATUS"/>
 *     &lt;enumeration value="POWER_STATE"/>
 *     &lt;enumeration value="PRESSURE"/>
 *     &lt;enumeration value="RESET"/>
 *     &lt;enumeration value="PROGRAM"/>
 *     &lt;enumeration value="PROGRAM_COMMENT"/>
 *     &lt;enumeration value="ROTARY_MODE"/>
 *     &lt;enumeration value="COUPLED_AXES"/>
 *     &lt;enumeration value="AXIS_COUPLING"/>
 *     &lt;enumeration value="SPINDLE_SPEED"/>
 *     &lt;enumeration value="TEMPERATURE"/>
 *     &lt;enumeration value="TORQUE"/>
 *     &lt;enumeration value="TOOL_ASSET_ID"/>
 *     &lt;enumeration value="TOOL_ID"/>
 *     &lt;enumeration value="TOOL_NUMBER"/>
 *     &lt;enumeration value="VELOCITY"/>
 *     &lt;enumeration value="VIBRATION"/>
 *     &lt;enumeration value="VOLTAGE"/>
 *     &lt;enumeration value="WATTAGE"/>
 *     &lt;enumeration value="ACCUMULATED_TIME"/>
 *     &lt;enumeration value="ACTUATOR_STATE"/>
 *     &lt;enumeration value="ASSET_CHANGED"/>
 *     &lt;enumeration value="CONCENTRATION"/>
 *     &lt;enumeration value="CONDUCTIVITY"/>
 *     &lt;enumeration value="DISPLACEMENT"/>
 *     &lt;enumeration value="ELECTRICAL_ENERGY"/>
 *     &lt;enumeration value="FILL_LEVEL"/>
 *     &lt;enumeration value="FLOW"/>
 *     &lt;enumeration value="LINEAR_FORCE"/>
 *     &lt;enumeration value="MASS"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="POWER_FACTOR"/>
 *     &lt;enumeration value="RESISTANCE"/>
 *     &lt;enumeration value="ROTARY_VELOCITY"/>
 *     &lt;enumeration value="SOUND_PRESSURE"/>
 *     &lt;enumeration value="STRAIN"/>
 *     &lt;enumeration value="TILT"/>
 *     &lt;enumeration value="VOLT_AMPERE"/>
 *     &lt;enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     &lt;enumeration value="WATT_SECOND"/>
 *     &lt;enumeration value="VISCOSITY"/>
 *     &lt;enumeration value="COMMUNICATIONS"/>
 *     &lt;enumeration value="LOGIC_PROGRAM"/>
 *     &lt;enumeration value="MOTION_PROGRAM"/>
 *     &lt;enumeration value="HARDWARE"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="LEVEL"/>
 *     &lt;enumeration value="ACTUATOR"/>
 *     &lt;enumeration value="ROTARY_VELOCITY_OVERRIDE"/>
 *     &lt;enumeration value="PATH_FEEDRATE_OVERRIDE"/>
 *     &lt;enumeration value="AXIS_FEEDRATE_OVERRIDE"/>
 *     &lt;enumeration value="PART_ASSET_ID"/>
 *     &lt;enumeration value="PROGRAM_EDIT"/>
 *     &lt;enumeration value="PROGRAM_EDIT_NAME"/>
 *     &lt;enumeration value="CLOCK_TIME"/>
 *     &lt;enumeration value="CHUCK_STATE"/>
 *     &lt;enumeration value="END_OF_BAR"/>
 *     &lt;enumeration value="AUXILIARY_END_OF_BAR"/>
 *     &lt;enumeration value="AXIS_INTERLOCK"/>
 *     &lt;enumeration value="MANUAL_CHUCK_UNCLAMP_INTERLOCK"/>
 *     &lt;enumeration value="LENGTH"/>
 *     &lt;enumeration value="AXIS_STATE"/>
 *     &lt;enumeration value="INTERFACE_STATE"/>
 *     &lt;enumeration value="FUNCTIONAL_MODE"/>
 *     &lt;enumeration value="WORKHOLDING_ID"/>
 *     &lt;enumeration value="PALLET_ID"/>
 *     &lt;enumeration value="OPERATOR_ID"/>
 *     &lt;enumeration value="ASSET_REMOVED"/>
 *     &lt;enumeration value="PROGRAM_HEADER"/>
 *     &lt;enumeration value="MATERIAL_FEED"/>
 *     &lt;enumeration value="MATERIAL_CHANGE"/>
 *     &lt;enumeration value="MATERIAL_RETRACT"/>
 *     &lt;enumeration value="PART_CHANGE"/>
 *     &lt;enumeration value="OPEN_DOOR"/>
 *     &lt;enumeration value="CLOSE_DOOR"/>
 *     &lt;enumeration value="OPEN_CHUCK"/>
 *     &lt;enumeration value="CLOSE_CHUCK"/>
 *     &lt;enumeration value="MATERIAL_LOAD"/>
 *     &lt;enumeration value="MATERIAL_UNLOAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemEnumTypeEnum")
@XmlEnum
public enum DataItemEnumTypeEnum {

    ACCELERATION,
    ACTIVE_AXES,
    ALARM,
    AMPERAGE,
    ANGLE,
    ANGULAR_ACCELERATION,
    ANGULAR_VELOCITY,
    AVAILABILITY,
    AXIS_FEEDRATE,
    BLOCK,
    CODE,
    DIRECTION,
    DOOR_STATE,
    EMERGENCY_STOP,
    EXECUTION,
    FREQUENCY,
    PART_COUNT,
    PART_ID,
    PATH_FEEDRATE,
    PATH_POSITION,
    PATH_MODE,
    LINE,
    CONTROLLER_MODE,
    LOAD,
    MESSAGE,
    POSITION,
    POWER_STATUS,
    POWER_STATE,
    PRESSURE,
    RESET,
    PROGRAM,
    PROGRAM_COMMENT,
    ROTARY_MODE,
    COUPLED_AXES,
    AXIS_COUPLING,
    SPINDLE_SPEED,
    TEMPERATURE,
    TORQUE,
    TOOL_ASSET_ID,
    TOOL_ID,
    TOOL_NUMBER,
    VELOCITY,
    VIBRATION,
    VOLTAGE,
    WATTAGE,
    ACCUMULATED_TIME,
    ACTUATOR_STATE,
    ASSET_CHANGED,
    CONCENTRATION,
    CONDUCTIVITY,
    DISPLACEMENT,
    ELECTRICAL_ENERGY,
    FILL_LEVEL,
    FLOW,
    LINEAR_FORCE,
    MASS,
    PH,
    POWER_FACTOR,
    RESISTANCE,
    ROTARY_VELOCITY,
    SOUND_PRESSURE,
    STRAIN,
    TILT,
    VOLT_AMPERE,
    VOLT_AMPERE_REACTIVE,
    WATT_SECOND,
    VISCOSITY,
    COMMUNICATIONS,
    LOGIC_PROGRAM,
    MOTION_PROGRAM,
    HARDWARE,
    SYSTEM,
    LEVEL,
    ACTUATOR,
    ROTARY_VELOCITY_OVERRIDE,
    PATH_FEEDRATE_OVERRIDE,
    AXIS_FEEDRATE_OVERRIDE,
    PART_ASSET_ID,
    PROGRAM_EDIT,
    PROGRAM_EDIT_NAME,
    CLOCK_TIME,
    CHUCK_STATE,
    END_OF_BAR,
    AUXILIARY_END_OF_BAR,
    AXIS_INTERLOCK,
    MANUAL_CHUCK_UNCLAMP_INTERLOCK,
    LENGTH,
    AXIS_STATE,
    INTERFACE_STATE,
    FUNCTIONAL_MODE,
    WORKHOLDING_ID,
    PALLET_ID,
    OPERATOR_ID,
    ASSET_REMOVED,
    PROGRAM_HEADER,
    MATERIAL_FEED,
    MATERIAL_CHANGE,
    MATERIAL_RETRACT,
    PART_CHANGE,
    OPEN_DOOR,
    CLOSE_DOOR,
    OPEN_CHUCK,
    CLOSE_CHUCK,
    MATERIAL_LOAD,
    MATERIAL_UNLOAD;

    public String value() {
        return name();
    }

    public static DataItemEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
