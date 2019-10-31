//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A collection of samples for this component
 *       
 * 
 * <p>Classe Java per SamplesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SamplesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectStreams:1.4}Sample" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplesType", propOrder = {
    "sample"
})
public class SamplesType {

    @XmlElementRef(name = "Sample", namespace = "urn:mtconnect.org:MTConnectStreams:1.4", type = JAXBElement.class)
    protected List<JAXBElement<? extends SampleType>> sample;

    /**
     * Gets the value of the sample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowType }{@code >}
     * {@link JAXBElement }{@code <}{@link PhTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricalEnergyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlowTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConductivityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularAccelerationTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorType }{@code >}
     * {@link JAXBElement }{@code <}{@link TensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerFactorTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentTimerType }{@code >}
     * {@link JAXBElement }{@code <}{@link PressureType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link DisplacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngleTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TiltType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AngularVelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbsTimeSeriesTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link EquipmentTimerTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ViscosityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccumulatedTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathPositionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link PhType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClockTimeTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcentrationType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TensionTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link StrainType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessTimerTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClockTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmperageTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link RotaryVelocityType }{@code >}
     * {@link JAXBElement }{@code <}{@link SampleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisFeedrateTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TorqueTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemperatureTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadType }{@code >}
     * {@link JAXBElement }{@code <}{@link VoltAmpereReactiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleSpeedType }{@code >}
     * {@link JAXBElement }{@code <}{@link VelocityTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link FillLevelTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearForceTimeSeriesType }{@code >}
     * {@link JAXBElement }{@code <}{@link WattageType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends SampleType>> getSample() {
        if (sample == null) {
            sample = new ArrayList<JAXBElement<? extends SampleType>>();
        }
        return this.sample;
    }

}
