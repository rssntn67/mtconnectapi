//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A collection of assembly measurements
 *       
 * 
 * <p>Classe Java per AssemblyMeasurementsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AssemblyMeasurementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:mtconnect.org:MTConnectAssets:1.3}CommonMeasurement"/>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectAssets:1.3}AssemblyMeasurement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssemblyMeasurementsType", propOrder = {
    "commonMeasurementOrAssemblyMeasurement"
})
public class AssemblyMeasurementsType {

    @XmlElementRefs({
        @XmlElementRef(name = "AssemblyMeasurement", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CommonMeasurement", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends MeasurementType>> commonMeasurementOrAssemblyMeasurement;

    /**
     * Gets the value of the commonMeasurementOrAssemblyMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonMeasurementOrAssemblyMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonMeasurementOrAssemblyMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DepthOfCutMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link OverallToolLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link UsableLengthMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingDiameterMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link BodyDiameterMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlangeDiameterMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShankLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link WeightType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtrudingLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShankDiameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssemblyMeasurementType }{@code >}
     * {@link JAXBElement }{@code <}{@link BodyLengthMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonMeasurementType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShankHeightType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalLengthType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends MeasurementType>> getCommonMeasurementOrAssemblyMeasurement() {
        if (commonMeasurementOrAssemblyMeasurement == null) {
            commonMeasurementOrAssemblyMeasurement = new ArrayList<JAXBElement<? extends MeasurementType>>();
        }
        return this.commonMeasurementOrAssemblyMeasurement;
    }

}
