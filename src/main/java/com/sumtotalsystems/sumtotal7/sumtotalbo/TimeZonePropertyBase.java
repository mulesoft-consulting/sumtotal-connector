
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZonePropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZonePropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardTimeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingTimeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StandardTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DaylightSavingTimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObservesDaylightSavingTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZonePropertyBase", propOrder = {
    "id",
    "countryCodeId",
    "standardTimeName",
    "daylightSavingTimeName",
    "standardTimeCode",
    "daylightSavingTimeCode",
    "observesDaylightSavingTime"
})
@XmlSeeAlso({
    TimeZoneCore.class
})
public abstract class TimeZonePropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CountryCodeId")
    protected String countryCodeId;
    @XmlElement(name = "StandardTimeName")
    protected String standardTimeName;
    @XmlElement(name = "DaylightSavingTimeName")
    protected String daylightSavingTimeName;
    @XmlElement(name = "StandardTimeCode")
    protected String standardTimeCode;
    @XmlElement(name = "DaylightSavingTimeCode")
    protected String daylightSavingTimeCode;
    @XmlElement(name = "ObservesDaylightSavingTime")
    protected boolean observesDaylightSavingTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the countryCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeId() {
        return countryCodeId;
    }

    /**
     * Sets the value of the countryCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeId(String value) {
        this.countryCodeId = value;
    }

    /**
     * Gets the value of the standardTimeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardTimeName() {
        return standardTimeName;
    }

    /**
     * Sets the value of the standardTimeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardTimeName(String value) {
        this.standardTimeName = value;
    }

    /**
     * Gets the value of the daylightSavingTimeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavingTimeName() {
        return daylightSavingTimeName;
    }

    /**
     * Sets the value of the daylightSavingTimeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavingTimeName(String value) {
        this.daylightSavingTimeName = value;
    }

    /**
     * Gets the value of the standardTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardTimeCode() {
        return standardTimeCode;
    }

    /**
     * Sets the value of the standardTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardTimeCode(String value) {
        this.standardTimeCode = value;
    }

    /**
     * Gets the value of the daylightSavingTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavingTimeCode() {
        return daylightSavingTimeCode;
    }

    /**
     * Sets the value of the daylightSavingTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavingTimeCode(String value) {
        this.daylightSavingTimeCode = value;
    }

    /**
     * Gets the value of the observesDaylightSavingTime property.
     * 
     */
    public boolean isObservesDaylightSavingTime() {
        return observesDaylightSavingTime;
    }

    /**
     * Sets the value of the observesDaylightSavingTime property.
     * 
     */
    public void setObservesDaylightSavingTime(boolean value) {
        this.observesDaylightSavingTime = value;
    }

}
