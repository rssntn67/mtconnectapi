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
 *         An abstract interface event
 *       
 * 
 * <p>Classe Java per InterfaceEventType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceEventType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:mtconnect.org:MTConnectStreams:1.3>EventType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceEventType")
@XmlSeeAlso({
    CloseDoorType.class,
    PartChangeType.class,
    MaterialFeedType.class,
    CloseChuckType.class,
    MaterialChangeType.class,
    MaterialLoadType.class,
    OpenDoorType.class,
    MaterialRetractType.class,
    MaterialUnloadType.class,
    OpenChuckType.class
})
public abstract class InterfaceEventType
    extends EventType
{


}
