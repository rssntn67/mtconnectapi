//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An abstract event
 *       
 * 
 * <p>Classe Java per EventType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>ResultType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType")
@XmlSeeAlso({
    EndOfBarType.class,
    PalletIdType.class,
    ProgramEditType.class,
    PathFeedrateOverrideType.class,
    ProgramHeaderType.class,
    CodeType.class,
    AxesCouplingType.class,
    ChuckStateType.class,
    LineType.class,
    AxisStateType.class,
    InterfaceStateType.class,
    ProgramCommentType.class,
    DirectionType.class,
    CoupledAxesType.class,
    RotaryModeType.class,
    AssetRemovedType.class,
    WorkholdingIdType.class,
    ControllerModeType.class,
    PowerStateType.class,
    ToolAssetIdType.class,
    MessageType.class,
    BlockType.class,
    DoorStateType.class,
    ExecutionType.class,
    PowerStatusType.class,
    PartAssetIdType.class,
    PartIdType.class,
    AvailabilityType.class,
    ProgramType.class,
    ToolNumberType.class,
    FunctionalModeType.class,
    ActuatorStateType.class,
    InterfaceEventType.class,
    PartCountType.class,
    PathModeType.class,
    EmergencyStopType.class,
    ToolIdType.class,
    AssetChangedType.class,
    RotaryVelocityOverrideType.class,
    ChuckInterlockType.class,
    OperatorIdType.class,
    AxisFeedrateOverrideType.class,
    ActiveAxesType.class,
    AlarmType.class,
    ProgramEditNameType.class,
    AxisInterlockType.class
})
public abstract class EventType
    extends ResultType
{


}
