//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

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
 *     &lt;enumeration value="ACCUMULATED_TIME"/>
 *     &lt;enumeration value="ANGULAR_ACCELERATION"/>
 *     &lt;enumeration value="ANGULAR_VELOCITY"/>
 *     &lt;enumeration value="AMPERAGE"/>
 *     &lt;enumeration value="ANGLE"/>
 *     &lt;enumeration value="AXIS_FEEDRATE"/>
 *     &lt;enumeration value="CLOCK_TIME"/>
 *     &lt;enumeration value="CONCENTRATION"/>
 *     &lt;enumeration value="CONDUCTIVITY"/>
 *     &lt;enumeration value="DISPLACEMENT"/>
 *     &lt;enumeration value="ELECTRICAL_ENERGY"/>
 *     &lt;enumeration value="EQUIPMENT_TIMER"/>
 *     &lt;enumeration value="FILL_LEVEL"/>
 *     &lt;enumeration value="FLOW"/>
 *     &lt;enumeration value="FREQUENCY"/>
 *     &lt;enumeration value="LENGTH"/>
 *     &lt;enumeration value="LINEAR_FORCE"/>
 *     &lt;enumeration value="LOAD"/>
 *     &lt;enumeration value="MASS"/>
 *     &lt;enumeration value="PATH_FEEDRATE"/>
 *     &lt;enumeration value="PATH_POSITION"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="POSITION"/>
 *     &lt;enumeration value="POWER_FACTOR"/>
 *     &lt;enumeration value="PRESSURE"/>
 *     &lt;enumeration value="PROCESS_TIMER"/>
 *     &lt;enumeration value="RESISTANCE"/>
 *     &lt;enumeration value="ROTARY_VELOCITY"/>
 *     &lt;enumeration value="SOUND_LEVEL"/>
 *     &lt;enumeration value="SPINDLE_SPEED"/>
 *     &lt;enumeration value="STRAIN"/>
 *     &lt;enumeration value="TEMPERATURE"/>
 *     &lt;enumeration value="TENSION"/>
 *     &lt;enumeration value="TILT"/>
 *     &lt;enumeration value="TORQUE"/>
 *     &lt;enumeration value="VELOCITY"/>
 *     &lt;enumeration value="VISCOSITY"/>
 *     &lt;enumeration value="VOLTAGE"/>
 *     &lt;enumeration value="VOLT_AMPERE"/>
 *     &lt;enumeration value="VOLT_AMPERE_REACTIVE"/>
 *     &lt;enumeration value="WATTAGE"/>
 *     &lt;enumeration value="ACTIVE_AXES"/>
 *     &lt;enumeration value="ACTUATOR_STATE"/>
 *     &lt;enumeration value="ALARM"/>
 *     &lt;enumeration value="AVAILABILITY"/>
 *     &lt;enumeration value="AXIS_COUPLING"/>
 *     &lt;enumeration value="AXIS_FEEDRATE_OVERRIDE"/>
 *     &lt;enumeration value="AXIS_INTERLOCK"/>
 *     &lt;enumeration value="AXIS_STATE"/>
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="BLOCK_COUNT"/>
 *     &lt;enumeration value="CHUCK_STATE"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="COMPOSITION_STATE"/>
 *     &lt;enumeration value="CONTROLLER_MODE"/>
 *     &lt;enumeration value="CONTROLLER_MODE_OVERRIDE"/>
 *     &lt;enumeration value="COUPLED_AXES"/>
 *     &lt;enumeration value="DIRECTION"/>
 *     &lt;enumeration value="DOOR_STATE"/>
 *     &lt;enumeration value="DRY_RUN"/>
 *     &lt;enumeration value="EMERGENCY_STOP"/>
 *     &lt;enumeration value="EQUIPMENT_MODE"/>
 *     &lt;enumeration value="EXECUTION"/>
 *     &lt;enumeration value="FUNCTIONAL_MODE"/>
 *     &lt;enumeration value="HARDNESS"/>
 *     &lt;enumeration value="LEVEL"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="LINE_LABEL"/>
 *     &lt;enumeration value="LINE_NUMBER"/>
 *     &lt;enumeration value="MATERIAL"/>
 *     &lt;enumeration value="MESSAGE"/>
 *     &lt;enumeration value="OPERATOR_ID"/>
 *     &lt;enumeration value="PALLET_ID"/>
 *     &lt;enumeration value="PART_ASSET_ID"/>
 *     &lt;enumeration value="PART_COUNT"/>
 *     &lt;enumeration value="PART_ID"/>
 *     &lt;enumeration value="PART_NUMBER"/>
 *     &lt;enumeration value="PATH_FEEDRATE_OVERRIDE"/>
 *     &lt;enumeration value="PATH_MODE"/>
 *     &lt;enumeration value="POWER_STATE"/>
 *     &lt;enumeration value="POWER_STATUS"/>
 *     &lt;enumeration value="PROGRAM"/>
 *     &lt;enumeration value="PROGRAM_COMMENT"/>
 *     &lt;enumeration value="PROGRAM_EDIT"/>
 *     &lt;enumeration value="PROGRAM_EDIT_NAME"/>
 *     &lt;enumeration value="PROGRAM_HEADER"/>
 *     &lt;enumeration value="ROTARY_MODE"/>
 *     &lt;enumeration value="ROTARY_VELOCITY_OVERRIDE"/>
 *     &lt;enumeration value="SERIAL_NUMBER"/>
 *     &lt;enumeration value="SPINDLE_INTERLOCK"/>
 *     &lt;enumeration value="TOOL_ASSET_ID"/>
 *     &lt;enumeration value="TOOL_ID"/>
 *     &lt;enumeration value="TOOL_NUMBER"/>
 *     &lt;enumeration value="TOOL_OFFSET"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="WIRE"/>
 *     &lt;enumeration value="WORKHOLDING_ID"/>
 *     &lt;enumeration value="WORK_OFFSET"/>
 *     &lt;enumeration value="ACTUATOR"/>
 *     &lt;enumeration value="CHUCK_INTERLOCK"/>
 *     &lt;enumeration value="COMMUNICATIONS"/>
 *     &lt;enumeration value="DATA_RANGE"/>
 *     &lt;enumeration value="END_OF_BAR"/>
 *     &lt;enumeration value="HARDWARE"/>
 *     &lt;enumeration value="INTERFACE_STATE"/>
 *     &lt;enumeration value="LOGIC_PROGRAM"/>
 *     &lt;enumeration value="MOTION_PROGRAM"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="ASSET_CHANGED"/>
 *     &lt;enumeration value="ASSET_REMOVED"/>
 *     &lt;enumeration value="AUXILIARY_END_OF_BAR"/>
 *     &lt;enumeration value="CLOSE_CHUCK"/>
 *     &lt;enumeration value="CLOSE_DOOR"/>
 *     &lt;enumeration value="INTERFACE_STATE"/>
 *     &lt;enumeration value="MACHINE_AXIS_LOCK"/>
 *     &lt;enumeration value="MANUAL_CHUCK_UNCLAMP_INTERLOCK"/>
 *     &lt;enumeration value="MATERIAL_CHANGE"/>
 *     &lt;enumeration value="MATERIAL_FEED"/>
 *     &lt;enumeration value="MATERIAL_LOAD"/>
 *     &lt;enumeration value="MATERIAL_RETRACT"/>
 *     &lt;enumeration value="MATERIAL_UNLOAD"/>
 *     &lt;enumeration value="OPEN_CHUCK"/>
 *     &lt;enumeration value="OPEN_DOOR"/>
 *     &lt;enumeration value="PART_CHANGE"/>
 *     &lt;enumeration value="RESET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemEnumTypeEnum")
@XmlEnum
public enum DataItemEnumTypeEnum {

    ACCELERATION,
    ACCUMULATED_TIME,
    ANGULAR_ACCELERATION,
    ANGULAR_VELOCITY,
    AMPERAGE,
    ANGLE,
    AXIS_FEEDRATE,
    CLOCK_TIME,
    CONCENTRATION,
    CONDUCTIVITY,
    DISPLACEMENT,
    ELECTRICAL_ENERGY,
    EQUIPMENT_TIMER,
    FILL_LEVEL,
    FLOW,
    FREQUENCY,
    LENGTH,
    LINEAR_FORCE,
    LOAD,
    MASS,
    PATH_FEEDRATE,
    PATH_POSITION,
    PH,
    POSITION,
    POWER_FACTOR,
    PRESSURE,
    PROCESS_TIMER,
    RESISTANCE,
    ROTARY_VELOCITY,
    SOUND_LEVEL,
    SPINDLE_SPEED,
    STRAIN,
    TEMPERATURE,
    TENSION,
    TILT,
    TORQUE,
    VELOCITY,
    VISCOSITY,
    VOLTAGE,
    VOLT_AMPERE,
    VOLT_AMPERE_REACTIVE,
    WATTAGE,
    ACTIVE_AXES,
    ACTUATOR_STATE,
    ALARM,
    AVAILABILITY,
    AXIS_COUPLING,
    AXIS_FEEDRATE_OVERRIDE,
    AXIS_INTERLOCK,
    AXIS_STATE,
    BLOCK,
    BLOCK_COUNT,
    CHUCK_STATE,
    CODE,
    COMPOSITION_STATE,
    CONTROLLER_MODE,
    CONTROLLER_MODE_OVERRIDE,
    COUPLED_AXES,
    DIRECTION,
    DOOR_STATE,
    DRY_RUN,
    EMERGENCY_STOP,
    EQUIPMENT_MODE,
    EXECUTION,
    FUNCTIONAL_MODE,
    HARDNESS,
    LEVEL,
    LINE,
    LINE_LABEL,
    LINE_NUMBER,
    MATERIAL,
    MESSAGE,
    OPERATOR_ID,
    PALLET_ID,
    PART_ASSET_ID,
    PART_COUNT,
    PART_ID,
    PART_NUMBER,
    PATH_FEEDRATE_OVERRIDE,
    PATH_MODE,
    POWER_STATE,
    POWER_STATUS,
    PROGRAM,
    PROGRAM_COMMENT,
    PROGRAM_EDIT,
    PROGRAM_EDIT_NAME,
    PROGRAM_HEADER,
    ROTARY_MODE,
    ROTARY_VELOCITY_OVERRIDE,
    SERIAL_NUMBER,
    SPINDLE_INTERLOCK,
    TOOL_ASSET_ID,
    TOOL_ID,
    TOOL_NUMBER,
    TOOL_OFFSET,
    USER,
    WIRE,
    WORKHOLDING_ID,
    WORK_OFFSET,
    ACTUATOR,
    CHUCK_INTERLOCK,
    COMMUNICATIONS,
    DATA_RANGE,
    END_OF_BAR,
    HARDWARE,
    INTERFACE_STATE,
    LOGIC_PROGRAM,
    MOTION_PROGRAM,
    SYSTEM,
    ASSET_CHANGED,
    ASSET_REMOVED,
    AUXILIARY_END_OF_BAR,
    CLOSE_CHUCK,
    CLOSE_DOOR,
    MACHINE_AXIS_LOCK,
    MANUAL_CHUCK_UNCLAMP_INTERLOCK,
    MATERIAL_CHANGE,
    MATERIAL_FEED,
    MATERIAL_LOAD,
    MATERIAL_RETRACT,
    MATERIAL_UNLOAD,
    OPEN_CHUCK,
    OPEN_DOOR,
    PART_CHANGE,
    RESET;

    public String value() {
        return name();
    }

    public static DataItemEnumTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
