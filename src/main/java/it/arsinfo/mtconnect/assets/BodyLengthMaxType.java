//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         LBX: The distance measured along the X axis from that point of the item
 *         closest to the workpiece, including the cutting item for a tool item but
 *         excluding a protuding locking mechanism for an adaptive item, to either
 *         the front of the flange on a flanged body or the beginning of the
 *         connection interface feature on the machine side for cylindrical or
 *         prismatic shanks
 *       
 * 
 * <p>Classe Java per BodyLengthMaxType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BodyLengthMaxType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.3>AssemblyMeasurementType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyLengthMaxType")
public class BodyLengthMaxType
    extends AssemblyMeasurementType
{


}
