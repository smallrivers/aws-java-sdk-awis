//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.10 at 03:27:02 PM EET 
//


package net.distributary.tahseen.awis.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains Elements pertaining to the site's speed
 * 
 * <p>Java class for SpeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MedianLoadTime" type="{http://awis.amazonaws.com/doc/2005-10-05}GenericDataType"/&gt;
 *         &lt;element name="Percentile" type="{http://awis.amazonaws.com/doc/2005-10-05}GenericDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedType", propOrder = {
    "medianLoadTime",
    "percentile"
})
public class SpeedType {

    @XmlElement(name = "MedianLoadTime", required = true)
    protected GenericDataType medianLoadTime;
    @XmlElement(name = "Percentile", required = true)
    protected GenericDataType percentile;

    /**
     * Gets the value of the medianLoadTime property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDataType }
     *     
     */
    public GenericDataType getMedianLoadTime() {
        return medianLoadTime;
    }

    /**
     * Sets the value of the medianLoadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDataType }
     *     
     */
    public void setMedianLoadTime(GenericDataType value) {
        this.medianLoadTime = value;
    }

    /**
     * Gets the value of the percentile property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDataType }
     *     
     */
    public GenericDataType getPercentile() {
        return percentile;
    }

    /**
     * Sets the value of the percentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDataType }
     *     
     */
    public void setPercentile(GenericDataType value) {
        this.percentile = value;
    }

}
