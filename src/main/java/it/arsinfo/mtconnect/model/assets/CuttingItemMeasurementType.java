//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:04:22 PM CET 
//


package it.arsinfo.mtconnect.model.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Measurements for the cutting item
 *       
 * 
 * <p>Classe Java per CuttingItemMeasurementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CuttingItemMeasurementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.4>MeasurementType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuttingItemMeasurementType")
@XmlSeeAlso({
    ToolLeadAngleType.class,
    StepIncludedAngleType.class,
    ToolCuttingEdgeAngleType.class,
    CuttingReferencePointType.class,
    FlangeDiameterType.class,
    PointAngleType.class,
    CuttingHeightType.class,
    StepDiameterLengthType.class,
    FunctionalWidthType.class,
    CornerRadiusType.class,
    CuttingEdgeLengthType.class,
    IncribedCircleDiameterType.class,
    CuttingDiameterType.class,
    InclinationAngleType.class,
    WiperEdgeLengthType.class
})
public abstract class CuttingItemMeasurementType
    extends MeasurementType
{


}
