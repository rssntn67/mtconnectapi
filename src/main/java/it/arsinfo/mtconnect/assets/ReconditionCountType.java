//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.08 alle 05:21:21 PM CET 
//


package it.arsinfo.mtconnect.assets;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         The number of times this tool has been reconditioned
 *       
 * 
 * <p>Classe Java per ReconditionCountType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReconditionCountType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mtconnect.org:MTConnectAssets:1.3>ReconditionCountValueType">
 *       &lt;attribute name="maximumCount" type="{urn:mtconnect.org:MTConnectAssets:1.3}MaximumCountType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconditionCountType", propOrder = {
    "value"
})
public class ReconditionCountType {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "maximumCount")
    protected BigInteger maximumCount;

    /**
     * 
     *         The number of times the cutter has been reconditioned
     *       
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà maximumCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumCount() {
        return maximumCount;
    }

    /**
     * Imposta il valore della proprietà maximumCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumCount(BigInteger value) {
        this.maximumCount = value;
    }

}
