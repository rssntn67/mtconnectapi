//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.10.31 alle 08:06:57 PM CET 
//


package it.arsinfo.mtconnect.model.streams;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DataItemStatisticsTypeEnum.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataItemStatisticsTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVERAGE"/>
 *     &lt;enumeration value="KURTOSIS"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *     &lt;enumeration value="MEDIAN"/>
 *     &lt;enumeration value="MODE"/>
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="RANGE"/>
 *     &lt;enumeration value="ROOT_MEAN_SQUARE"/>
 *     &lt;enumeration value="STANDARD_DEVIATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemStatisticsTypeEnum")
@XmlEnum
public enum DataItemStatisticsTypeEnum {

    AVERAGE,
    KURTOSIS,
    MAXIMUM,
    MEDIAN,
    MODE,
    MINIMUM,
    RANGE,
    ROOT_MEAN_SQUARE,
    STANDARD_DEVIATION;

    public String value() {
        return name();
    }

    public static DataItemStatisticsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
