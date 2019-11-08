//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Measurements for both the assembly and the cutting item
 *       
 * 
 * <p>Classe Java per CommonMeasurementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommonMeasurementType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.3>MeasurementType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonMeasurementType")
@XmlSeeAlso({
    ProtrudingLengthType.class,
    WeightType.class,
    FunctionalLengthType.class
})
public abstract class CommonMeasurementType
    extends MeasurementType
{


}
