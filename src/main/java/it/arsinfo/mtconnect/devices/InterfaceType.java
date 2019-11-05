//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A component representing all the interfaces in a device.
 *       
 * 
 * <p>Classe Java per InterfaceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InterfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mtconnect.org:MTConnectDevices:1.3}CommonComponentType">
 *       &lt;sequence>
 *         &lt;element name="References" type="{urn:mtconnect.org:MTConnectDevices:1.3}ReferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceType", propOrder = {
    "references"
})
@XmlSeeAlso({
    DoorInterfaceType.class,
    ChuckInterfaceType.class,
    MaterialHandlerType.class,
    BarFeederType.class
})
public abstract class InterfaceType
    extends CommonComponentType
{

    @XmlElement(name = "References")
    protected ReferencesType references;

    /**
     * Recupera il valore della proprietà references.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesType }
     *     
     */
    public ReferencesType getReferences() {
        return references;
    }

    /**
     * Imposta il valore della proprietà references.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesType }
     *     
     */
    public void setReferences(ReferencesType value) {
        this.references = value;
    }

}
