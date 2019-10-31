//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An abstract time series with the restriction value
 *       
 * 
 * <p>Classe Java per TimeSeriesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TimeSeriesType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:mtconnect.org:MTConnectStreams:1.4>AbsTimeSeriesType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesType")
@XmlSeeAlso({
    AccelerationTimeSeriesType.class,
    PathFeedrateTimeSeriesType.class,
    AngularVelocityTimeSeriesType.class,
    PathPositionTimeSeriesType.class,
    FlowTimeSeriesType.class,
    FrequencyTimeSeriesType.class,
    ResistanceTimeSeriesType.class,
    TorqueTimeSeriesType.class,
    ProcessTimerTimeSeriesType.class,
    SpindleSpeedTimeSeriesType.class,
    TiltTimeSeriesType.class,
    AxisFeedrateTimeSeriesType.class,
    ClockTimeTimeSeriesType.class,
    AccumulatedTimeTimeSeriesType.class,
    PositionTimeSeriesType.class,
    ElectricalEnergyTimeSeriesType.class,
    EquipmentTimerTimeSeriesType.class,
    PhTimeSeriesType.class,
    AmperageTimeSeriesType.class,
    LinearForceTimeSeriesType.class,
    VoltageTimeSeriesType.class,
    PressureTimeSeriesType.class,
    StrainTimeSeriesType.class,
    VelocityTimeSeriesType.class,
    VoltAmpereTimeSeriesType.class,
    AngleTimeSeriesType.class,
    TemperatureTimeSeriesType.class,
    FillLevelTimeSeriesType.class,
    RotaryVelocityTimeSeriesType.class,
    AbsTimeSeriesTimeSeriesType.class,
    WattageTimeSeriesType.class,
    LengthTimeSeriesType.class,
    AngularAccelerationTimeSeriesType.class,
    LoadTimeSeriesType.class,
    ConcentrationTimeSeriesType.class,
    ViscosityTimeSeriesType.class,
    VoltAmpereReactiveTimeSeriesType.class,
    MassTimeSeriesType.class,
    ConductivityTimeSeriesType.class,
    TensionTimeSeriesType.class,
    PowerFactorTimeSeriesType.class,
    DisplacementTimeSeriesType.class
})
public abstract class TimeSeriesType
    extends AbsTimeSeriesType
{


}
