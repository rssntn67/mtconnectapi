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
 * <p>Classe Java per CuttingItemMeasurementsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CuttingItemMeasurementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:mtconnect.org:MTConnectAssets:1.3}CommonMeasurement"/>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectAssets:1.3}CuttingItemMeasurement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingItemMeasurementsType", propOrder = {
    "commonMeasurementOrCuttingItemMeasurement"
})
public class CuttingItemMeasurementsType {

    @XmlElementRefs({
        @XmlElementRef(name = "CuttingItemMeasurement", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CommonMeasurement", namespace = "urn:mtconnect.org:MTConnectAssets:1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends MeasurementType>> commonMeasurementOrCuttingItemMeasurement;

    /**
     * Gets the value of the commonMeasurementOrCuttingItemMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonMeasurementOrCuttingItemMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonMeasurementOrCuttingItemMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CuttingItemMeasurementType }{@code >}
     * {@link JAXBElement }{@code <}{@link StepDiameterLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingDiameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolCuttingEdgeAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingHeightType }{@code >}
     * {@link JAXBElement }{@code <}{@link WiperEdgeLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncribedCircleDiameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link CornerRadiusType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingReferencePointType }{@code >}
     * {@link JAXBElement }{@code <}{@link WeightType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolLeadAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtrudingLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link StepIncludedAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link FlangeDiameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalWidthType }{@code >}
     * {@link JAXBElement }{@code <}{@link CuttingEdgeLengthType }{@code >}
     * {@link JAXBElement }{@code <}{@link InclinationAngleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonMeasurementType }{@code >}
     * {@link JAXBElement }{@code <}{@link FunctionalLengthType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends MeasurementType>> getCommonMeasurementOrCuttingItemMeasurement() {
        if (commonMeasurementOrCuttingItemMeasurement == null) {
            commonMeasurementOrCuttingItemMeasurement = new ArrayList<JAXBElement<? extends MeasurementType>>();
        }
        return this.commonMeasurementOrCuttingItemMeasurement;
    }

}
