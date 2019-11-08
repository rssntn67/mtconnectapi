//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:22:43 PM CET 
//


package it.arsinfo.mtconnect.error;

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
 *     &lt;enumeration value="MINIMUM"/>
 *     &lt;enumeration value="MAXIMUM"/>
 *     &lt;enumeration value="AVERAGE"/>
 *     &lt;enumeration value="STANDARD_DEVIATION"/>
 *     &lt;enumeration value="ROOT_MEAN_SQUARE"/>
 *     &lt;enumeration value="MEAN"/>
 *     &lt;enumeration value="MODE"/>
 *     &lt;enumeration value="RANGE"/>
 *     &lt;enumeration value="KURTOSIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataItemStatisticsTypeEnum")
@XmlEnum
public enum DataItemStatisticsTypeEnum {

    MINIMUM,
    MAXIMUM,
    AVERAGE,
    STANDARD_DEVIATION,
    ROOT_MEAN_SQUARE,
    MEAN,
    MODE,
    RANGE,
    KURTOSIS;

    public String value() {
        return name();
    }

    public static DataItemStatisticsTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
