//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.04 alle 07:33:29 AM CET 
//


package it.arsinfo.mtconnect.streams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An abstract sample
 *       
 * 
 * <p>Classe Java per SampleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>ResultType">
 *       &lt;attribute name="sampleRate" type="{urn:mtconnect.org:MTConnectStreams:1.3}SampleRateType" />
 *       &lt;attribute name="statistic" type="{urn:mtconnect.org:MTConnectStreams:1.3}DataItemStatisticsType" />
 *       &lt;attribute name="duration" type="{urn:mtconnect.org:MTConnectStreams:1.3}DurationTimeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType")
@XmlSeeAlso({
    AmperageType.class,
    LoadType.class,
    PathPositionType.class,
    PositionType.class,
    SoundPressureType.class,
    RotaryVelocityType.class,
    PathFeedrateType.class,
    ConductivityType.class,
    ConcentrationType.class,
    ClockTimeType.class,
    FlowType.class,
    GlobalPositionType.class,
    AngleType.class,
    LengthType.class,
    FrequencyType.class,
    AngularVelocityType.class,
    AccelerationType.class,
    FillLevelType.class,
    TorqueType.class,
    WattageType.class,
    VoltsType.class,
    AngularAccelerationType.class,
    PressureType.class,
    SpindleSpeedType.class,
    StrainType.class,
    ResistanceType.class,
    LinearForceType.class,
    ElectricalEnergyType.class,
    ViscosityType.class,
    TemperatureType.class,
    AccumulatedTimeType.class,
    WattType.class,
    VoltageType.class,
    PowerFactorType.class,
    VelocityType.class,
    DisplacementType.class,
    TiltType.class,
    AbsTimeSeriesType.class,
    AxisFeedrateType.class
})
public abstract class SampleType
    extends ResultType
{

    @XmlAttribute(name = "sampleRate")
    protected String sampleRate;
    @XmlAttribute(name = "statistic")
    protected String statistic;
    @XmlAttribute(name = "duration")
    protected Float duration;

    /**
     * Recupera il valore della proprietà sampleRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleRate() {
        return sampleRate;
    }

    /**
     * Imposta il valore della proprietà sampleRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleRate(String value) {
        this.sampleRate = value;
    }

    /**
     * Recupera il valore della proprietà statistic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistic() {
        return statistic;
    }

    /**
     * Imposta il valore della proprietà statistic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatistic(String value) {
        this.statistic = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

}
