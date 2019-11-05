//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.05 alle 07:44:47 PM CET 
//


package it.arsinfo.mtconnect.devices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.arsinfo.mtconnect.devices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoorInterface_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "DoorInterface");
    private final static QName _AbstractConfiguration_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "AbstractConfiguration");
    private final static QName _Actuator_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Actuator");
    private final static QName _Axis_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Axis");
    private final static QName _Component_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Component");
    private final static QName _Lubrication_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Lubrication");
    private final static QName _Axes_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Axes");
    private final static QName _Spindle_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Spindle");
    private final static QName _Hydraulic_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Hydraulic");
    private final static QName _CommonComponent_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "CommonComponent");
    private final static QName _System_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "System");
    private final static QName _SensorConfiguration_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "SensorConfiguration");
    private final static QName _Interfaces_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Interfaces");
    private final static QName _BarFeeder_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "BarFeeder");
    private final static QName _Sensor_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Sensor");
    private final static QName _Interface_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Interface");
    private final static QName _Power_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Power");
    private final static QName _Device_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Device");
    private final static QName _MaterialHandler_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "MaterialHandler");
    private final static QName _MTConnectDevices_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "MTConnectDevices");
    private final static QName _Coolant_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Coolant");
    private final static QName _Pneumatic_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Pneumatic");
    private final static QName _Path_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Path");
    private final static QName _ChuckInterface_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "ChuckInterface");
    private final static QName _Door_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Door");
    private final static QName _Linear_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Linear");
    private final static QName _Rotary_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Rotary");
    private final static QName _Systems_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Systems");
    private final static QName _Controller_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Controller");
    private final static QName _Electric_QNAME = new QName("urn:mtconnect.org:MTConnectDevices:1.3", "Electric");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.arsinfo.mtconnect.devices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HydraulicType }
     * 
     */
    public HydraulicType createHydraulicType() {
        return new HydraulicType();
    }

    /**
     * Create an instance of {@link SystemType }
     * 
     */
    public SystemType createSystemType() {
        return new SystemType();
    }

    /**
     * Create an instance of {@link CommonComponentType }
     * 
     */
    public CommonComponentType createCommonComponentType() {
        return new CommonComponentType();
    }

    /**
     * Create an instance of {@link SpindleType }
     * 
     */
    public SpindleType createSpindleType() {
        return new SpindleType();
    }

    /**
     * Create an instance of {@link DoorInterfaceType }
     * 
     */
    public DoorInterfaceType createDoorInterfaceType() {
        return new DoorInterfaceType();
    }

    /**
     * Create an instance of {@link AxesType }
     * 
     */
    public AxesType createAxesType() {
        return new AxesType();
    }

    /**
     * Create an instance of {@link LubricationType }
     * 
     */
    public LubricationType createLubricationType() {
        return new LubricationType();
    }

    /**
     * Create an instance of {@link ActuatorType }
     * 
     */
    public ActuatorType createActuatorType() {
        return new ActuatorType();
    }

    /**
     * Create an instance of {@link PathType }
     * 
     */
    public PathType createPathType() {
        return new PathType();
    }

    /**
     * Create an instance of {@link ChuckInterfaceType }
     * 
     */
    public ChuckInterfaceType createChuckInterfaceType() {
        return new ChuckInterfaceType();
    }

    /**
     * Create an instance of {@link PneumaticType }
     * 
     */
    public PneumaticType createPneumaticType() {
        return new PneumaticType();
    }

    /**
     * Create an instance of {@link MTConnectDevicesType }
     * 
     */
    public MTConnectDevicesType createMTConnectDevicesType() {
        return new MTConnectDevicesType();
    }

    /**
     * Create an instance of {@link CoolantType }
     * 
     */
    public CoolantType createCoolantType() {
        return new CoolantType();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link MaterialHandlerType }
     * 
     */
    public MaterialHandlerType createMaterialHandlerType() {
        return new MaterialHandlerType();
    }

    /**
     * Create an instance of {@link ElectricType }
     * 
     */
    public ElectricType createElectricType() {
        return new ElectricType();
    }

    /**
     * Create an instance of {@link ControllerType }
     * 
     */
    public ControllerType createControllerType() {
        return new ControllerType();
    }

    /**
     * Create an instance of {@link DoorType }
     * 
     */
    public DoorType createDoorType() {
        return new DoorType();
    }

    /**
     * Create an instance of {@link LinearType }
     * 
     */
    public LinearType createLinearType() {
        return new LinearType();
    }

    /**
     * Create an instance of {@link RotaryType }
     * 
     */
    public RotaryType createRotaryType() {
        return new RotaryType();
    }

    /**
     * Create an instance of {@link SystemsType }
     * 
     */
    public SystemsType createSystemsType() {
        return new SystemsType();
    }

    /**
     * Create an instance of {@link InterfacesType }
     * 
     */
    public InterfacesType createInterfacesType() {
        return new InterfacesType();
    }

    /**
     * Create an instance of {@link BarFeederType }
     * 
     */
    public BarFeederType createBarFeederType() {
        return new BarFeederType();
    }

    /**
     * Create an instance of {@link SensorConfigurationType }
     * 
     */
    public SensorConfigurationType createSensorConfigurationType() {
        return new SensorConfigurationType();
    }

    /**
     * Create an instance of {@link PowerType }
     * 
     */
    public PowerType createPowerType() {
        return new PowerType();
    }

    /**
     * Create an instance of {@link SensorType }
     * 
     */
    public SensorType createSensorType() {
        return new SensorType();
    }

    /**
     * Create an instance of {@link DataItemsType }
     * 
     */
    public DataItemsType createDataItemsType() {
        return new DataItemsType();
    }

    /**
     * Create an instance of {@link DataItemValueElementType }
     * 
     */
    public DataItemValueElementType createDataItemValueElementType() {
        return new DataItemValueElementType();
    }

    /**
     * Create an instance of {@link DataItemFilterType }
     * 
     */
    public DataItemFilterType createDataItemFilterType() {
        return new DataItemFilterType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link ReferencesType }
     * 
     */
    public ReferencesType createReferencesType() {
        return new ReferencesType();
    }

    /**
     * Create an instance of {@link DataItemConstraintsType }
     * 
     */
    public DataItemConstraintsType createDataItemConstraintsType() {
        return new DataItemConstraintsType();
    }

    /**
     * Create an instance of {@link ComponentConfigurationType }
     * 
     */
    public ComponentConfigurationType createComponentConfigurationType() {
        return new ComponentConfigurationType();
    }

    /**
     * Create an instance of {@link HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link ChannelsType }
     * 
     */
    public ChannelsType createChannelsType() {
        return new ChannelsType();
    }

    /**
     * Create an instance of {@link ComponentsType }
     * 
     */
    public ComponentsType createComponentsType() {
        return new ComponentsType();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link AssetCountType }
     * 
     */
    public AssetCountType createAssetCountType() {
        return new AssetCountType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link ComponentDescriptionType }
     * 
     */
    public ComponentDescriptionType createComponentDescriptionType() {
        return new ComponentDescriptionType();
    }

    /**
     * Create an instance of {@link AssetCountsType }
     * 
     */
    public AssetCountsType createAssetCountsType() {
        return new AssetCountsType();
    }

    /**
     * Create an instance of {@link DataItemType }
     * 
     */
    public DataItemType createDataItemType() {
        return new DataItemType();
    }

    /**
     * Create an instance of {@link DevicesType }
     * 
     */
    public DevicesType createDevicesType() {
        return new DevicesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "DoorInterface", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Interface")
    public JAXBElement<DoorInterfaceType> createDoorInterface(DoorInterfaceType value) {
        return new JAXBElement<DoorInterfaceType>(_DoorInterface_QNAME, DoorInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "AbstractConfiguration")
    public JAXBElement<AbstractConfigurationType> createAbstractConfiguration(AbstractConfigurationType value) {
        return new JAXBElement<AbstractConfigurationType>(_AbstractConfiguration_QNAME, AbstractConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActuatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Actuator", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<ActuatorType> createActuator(ActuatorType value) {
        return new JAXBElement<ActuatorType>(_Actuator_QNAME, ActuatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Axis", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<AxisType> createAxis(AxisType value) {
        return new JAXBElement<AxisType>(_Axis_QNAME, AxisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Component")
    public JAXBElement<ComponentType> createComponent(ComponentType value) {
        return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LubricationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Lubrication", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "System")
    public JAXBElement<LubricationType> createLubrication(LubricationType value) {
        return new JAXBElement<LubricationType>(_Lubrication_QNAME, LubricationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AxesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Axes", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<AxesType> createAxes(AxesType value) {
        return new JAXBElement<AxesType>(_Axes_QNAME, AxesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpindleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Spindle", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Axis")
    public JAXBElement<SpindleType> createSpindle(SpindleType value) {
        return new JAXBElement<SpindleType>(_Spindle_QNAME, SpindleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HydraulicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Hydraulic", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "System")
    public JAXBElement<HydraulicType> createHydraulic(HydraulicType value) {
        return new JAXBElement<HydraulicType>(_Hydraulic_QNAME, HydraulicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "CommonComponent", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Component")
    public JAXBElement<CommonComponentType> createCommonComponent(CommonComponentType value) {
        return new JAXBElement<CommonComponentType>(_CommonComponent_QNAME, CommonComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "System", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<SystemType> createSystem(SystemType value) {
        return new JAXBElement<SystemType>(_System_QNAME, SystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "SensorConfiguration", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "AbstractConfiguration")
    public JAXBElement<SensorConfigurationType> createSensorConfiguration(SensorConfigurationType value) {
        return new JAXBElement<SensorConfigurationType>(_SensorConfiguration_QNAME, SensorConfigurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfacesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Interfaces", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<InterfacesType> createInterfaces(InterfacesType value) {
        return new JAXBElement<InterfacesType>(_Interfaces_QNAME, InterfacesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BarFeederType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "BarFeeder", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Interface")
    public JAXBElement<BarFeederType> createBarFeeder(BarFeederType value) {
        return new JAXBElement<BarFeederType>(_BarFeeder_QNAME, BarFeederType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Sensor", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<SensorType> createSensor(SensorType value) {
        return new JAXBElement<SensorType>(_Sensor_QNAME, SensorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Interface", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<InterfaceType> createInterface(InterfaceType value) {
        return new JAXBElement<InterfaceType>(_Interface_QNAME, InterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Power", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<PowerType> createPower(PowerType value) {
        return new JAXBElement<PowerType>(_Power_QNAME, PowerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Device", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Component")
    public JAXBElement<DeviceType> createDevice(DeviceType value) {
        return new JAXBElement<DeviceType>(_Device_QNAME, DeviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaterialHandlerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "MaterialHandler", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Interface")
    public JAXBElement<MaterialHandlerType> createMaterialHandler(MaterialHandlerType value) {
        return new JAXBElement<MaterialHandlerType>(_MaterialHandler_QNAME, MaterialHandlerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTConnectDevicesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "MTConnectDevices")
    public JAXBElement<MTConnectDevicesType> createMTConnectDevices(MTConnectDevicesType value) {
        return new JAXBElement<MTConnectDevicesType>(_MTConnectDevices_QNAME, MTConnectDevicesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoolantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Coolant", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "System")
    public JAXBElement<CoolantType> createCoolant(CoolantType value) {
        return new JAXBElement<CoolantType>(_Coolant_QNAME, CoolantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PneumaticType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Pneumatic", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "System")
    public JAXBElement<PneumaticType> createPneumatic(PneumaticType value) {
        return new JAXBElement<PneumaticType>(_Pneumatic_QNAME, PneumaticType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Path", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<PathType> createPath(PathType value) {
        return new JAXBElement<PathType>(_Path_QNAME, PathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChuckInterfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "ChuckInterface", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Interface")
    public JAXBElement<ChuckInterfaceType> createChuckInterface(ChuckInterfaceType value) {
        return new JAXBElement<ChuckInterfaceType>(_ChuckInterface_QNAME, ChuckInterfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Door", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<DoorType> createDoor(DoorType value) {
        return new JAXBElement<DoorType>(_Door_QNAME, DoorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Linear", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Axis")
    public JAXBElement<LinearType> createLinear(LinearType value) {
        return new JAXBElement<LinearType>(_Linear_QNAME, LinearType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RotaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Rotary", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "Axis")
    public JAXBElement<RotaryType> createRotary(RotaryType value) {
        return new JAXBElement<RotaryType>(_Rotary_QNAME, RotaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Systems", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<SystemsType> createSystems(SystemsType value) {
        return new JAXBElement<SystemsType>(_Systems_QNAME, SystemsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControllerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Controller", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "CommonComponent")
    public JAXBElement<ControllerType> createController(ControllerType value) {
        return new JAXBElement<ControllerType>(_Controller_QNAME, ControllerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:mtconnect.org:MTConnectDevices:1.3", name = "Electric", substitutionHeadNamespace = "urn:mtconnect.org:MTConnectDevices:1.3", substitutionHeadName = "System")
    public JAXBElement<ElectricType> createElectric(ElectricType value) {
        return new JAXBElement<ElectricType>(_Electric_QNAME, ElectricType.class, null, value);
    }

}
