//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.4>ResultType">
 *       &lt;attribute name="resetTriggered" type="{urn:mtconnect.org:MTConnectStreams:1.4}DataItemResetValueType" />
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
    LineLabelType.class,
    ProgramEditType.class,
    PathFeedrateOverrideType.class,
    ProgramHeaderType.class,
    HardnessType.class,
    CodeType.class,
    AxesCouplingType.class,
    ChuckStateType.class,
    AxisStateType.class,
    LineType.class,
    ControllerModeOverrideType.class,
    InterfaceStateType.class,
    ProgramCommentType.class,
    DirectionType.class,
    LineNumberType.class,
    ToolOffsetType.class,
    CoupledAxesType.class,
    BlockCountType.class,
    AssetRemovedType.class,
    RotaryModeType.class,
    WorkholdingIdType.class,
    ControllerModeType.class,
    EquipmentModeType.class,
    ToolAssetIdType.class,
    MessageType.class,
    CompositionStateType.class,
    WireType.class,
    BlockType.class,
    DoorStateType.class,
    ExecutionType.class,
    PowerStatusType.class,
    WorkOffsetType.class,
    PartIdType.class,
    AvailabilityType.class,
    ProgramType.class,
    ToolNumberType.class,
    FunctionalModeType.class,
    SerialNumberType.class,
    ActuatorStateType.class,
    UserType.class,
    InterfaceEventType.class,
    PartCountType.class,
    PowerStateType.class,
    SpindleInterlockType.class,
    PathModeType.class,
    EmergencyStopType.class,
    ToolIdType.class,
    AssetChangedType.class,
    MaterialType.class,
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

    @XmlAttribute(name = "resetTriggered")
    protected String resetTriggered;

    /**
     * Recupera il valore della proprietà resetTriggered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetTriggered() {
        return resetTriggered;
    }

    /**
     * Imposta il valore della proprietà resetTriggered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetTriggered(String value) {
        this.resetTriggered = value;
    }

}
