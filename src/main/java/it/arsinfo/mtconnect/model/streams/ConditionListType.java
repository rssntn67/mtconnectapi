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
 *         The condition of the device
 *       
 * 
 * <p>Classe Java per ConditionListType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectStreams:1.4}Condition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionListType", propOrder = {
    "condition"
})
public class ConditionListType {

    @XmlElementRef(name = "Condition", namespace = "urn:mtconnect.org:MTConnectStreams:1.4", type = JAXBElement.class)
    protected List<JAXBElement<? extends ConditionType>> condition;

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NormalType }{@code >}
     * {@link JAXBElement }{@code <}{@link WarningType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnavailableType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ConditionType>> getCondition() {
        if (condition == null) {
            condition = new ArrayList<JAXBElement<? extends ConditionType>>();
        }
        return this.condition;
    }

}
