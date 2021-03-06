//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.10 at 03:27:02 PM EET 
//


package net.distributary.tahseen.awis.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Structure containing information related to the content of a site
 * 
 * <p>Java class for ContentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://awis.amazonaws.com/doc/2005-10-05}UrlServiceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteData" type="{http://awis.amazonaws.com/doc/2005-10-05}SiteDataType" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://awis.amazonaws.com/doc/2005-10-05}SpeedType" minOccurs="0"/&gt;
 *         &lt;element name="AdultContent" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://awis.amazonaws.com/doc/2005-10-05}LanguageType" minOccurs="0"/&gt;
 *         &lt;element name="AverageReview" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="LinksInCount" type="{http://awis.amazonaws.com/doc/2005-10-05}UnsignedIntegerType" minOccurs="0"/&gt;
 *         &lt;element name="Keywords" type="{http://awis.amazonaws.com/doc/2005-10-05}KeywordsType" minOccurs="0"/&gt;
 *         &lt;element name="OwnedDomains" type="{http://awis.amazonaws.com/doc/2005-10-05}OwnedDomainsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDataType", propOrder = {
    "siteData",
    "speed",
    "adultContent",
    "language",
    "averageReview",
    "linksInCount",
    "keywords",
    "ownedDomains"
})
public class ContentDataType
    extends UrlServiceType
{

    @XmlElement(name = "SiteData")
    protected SiteDataType siteData;
    @XmlElement(name = "Speed")
    protected SpeedType speed;
    @XmlElement(name = "AdultContent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String adultContent;
    @XmlElement(name = "Language")
    protected LanguageType language;
    @XmlElement(name = "AverageReview")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String averageReview;
    @XmlElement(name = "LinksInCount")
    protected BigInteger linksInCount;
    @XmlElement(name = "Keywords")
    protected KeywordsType keywords;
    @XmlElement(name = "OwnedDomains")
    protected OwnedDomainsType ownedDomains;

    /**
     * Gets the value of the siteData property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDataType }
     *     
     */
    public SiteDataType getSiteData() {
        return siteData;
    }

    /**
     * Sets the value of the siteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDataType }
     *     
     */
    public void setSiteData(SiteDataType value) {
        this.siteData = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setSpeed(SpeedType value) {
        this.speed = value;
    }

    /**
     * Gets the value of the adultContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultContent() {
        return adultContent;
    }

    /**
     * Sets the value of the adultContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultContent(String value) {
        this.adultContent = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the averageReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAverageReview() {
        return averageReview;
    }

    /**
     * Sets the value of the averageReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageReview(String value) {
        this.averageReview = value;
    }

    /**
     * Gets the value of the linksInCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinksInCount() {
        return linksInCount;
    }

    /**
     * Sets the value of the linksInCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinksInCount(BigInteger value) {
        this.linksInCount = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordsType }
     *     
     */
    public KeywordsType getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordsType }
     *     
     */
    public void setKeywords(KeywordsType value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the ownedDomains property.
     * 
     * @return
     *     possible object is
     *     {@link OwnedDomainsType }
     *     
     */
    public OwnedDomainsType getOwnedDomains() {
        return ownedDomains;
    }

    /**
     * Sets the value of the ownedDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnedDomainsType }
     *     
     */
    public void setOwnedDomains(OwnedDomainsType value) {
        this.ownedDomains = value;
    }

}
