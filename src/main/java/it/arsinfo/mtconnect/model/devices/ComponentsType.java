//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:05:49 PM CET 
//


package it.arsinfo.mtconnect.model.devices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A list of generic components
 *       
 * 
 * <p>Classe Java per ComponentsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ComponentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mtconnect.org:MTConnectDevices:1.4}Component" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentsType", propOrder = {
    "component"
})
public class ComponentsType {

    @XmlElementRef(name = "Component", namespace = "urn:mtconnect.org:MTConnectDevices:1.4", type = JAXBElement.class)
    protected List<JAXBElement<? extends ComponentType>> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RotaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessPowerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PathType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpindleType }{@code >}
     * {@link JAXBElement }{@code <}{@link PneumaticType }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemsType }{@code >}
     * {@link JAXBElement }{@code <}{@link WasteDisposalType }{@code >}
     * {@link JAXBElement }{@code <}{@link DeviceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ToolingDeliveryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxesType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckInterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SensorType }{@code >}
     * {@link JAXBElement }{@code <}{@link AxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link BarFeederInterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ElectricType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialsType }{@code >}
     * {@link JAXBElement }{@code <}{@link HydraulicType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeederType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentalType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuxiliaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActuatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommonComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerType }{@code >}
     * {@link JAXBElement }{@code <}{@link StockType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfacesType }{@code >}
     * {@link JAXBElement }{@code <}{@link AuxiliariesType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnclosureType }{@code >}
     * {@link JAXBElement }{@code <}{@link LubricationType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProtectiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonnelType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChuckType }{@code >}
     * {@link JAXBElement }{@code <}{@link ControllerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DielectricType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorType }{@code >}
     * {@link JAXBElement }{@code <}{@link BarFeederType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoolantType }{@code >}
     * {@link JAXBElement }{@code <}{@link MaterialHandlerInterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoaderType }{@code >}
     * {@link JAXBElement }{@code <}{@link DoorInterfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourcesType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ComponentType>> getComponent() {
        if (component == null) {
            component = new ArrayList<JAXBElement<? extends ComponentType>>();
        }
        return this.component;
    }

}
