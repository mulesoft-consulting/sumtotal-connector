
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityDurationPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityDurationPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstCreditHours" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDouble"/>
 *         &lt;element name="EstDuration_Days" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="EstDuration_Hours" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="EstDuration_Minutes" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="EstDuration_Seconds" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityDurationPropertyBase", propOrder = {
    "id",
    "estCreditHours",
    "estDurationDays",
    "estDurationHours",
    "estDurationMinutes",
    "estDurationSeconds"
})
@XmlSeeAlso({
    ActivityDurationCore.class
})
public abstract class ActivityDurationPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "EstCreditHours", required = true)
    protected NullableDouble estCreditHours;
    @XmlElement(name = "EstDuration_Days", required = true)
    protected NullableInt32 estDurationDays;
    @XmlElement(name = "EstDuration_Hours", required = true)
    protected NullableInt32 estDurationHours;
    @XmlElement(name = "EstDuration_Minutes", required = true)
    protected NullableInt32 estDurationMinutes;
    @XmlElement(name = "EstDuration_Seconds", required = true)
    protected NullableInt32 estDurationSeconds;

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
     * Gets the value of the estCreditHours property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDouble }
     *     
     */
    public NullableDouble getEstCreditHours() {
        return estCreditHours;
    }

    /**
     * Sets the value of the estCreditHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDouble }
     *     
     */
    public void setEstCreditHours(NullableDouble value) {
        this.estCreditHours = value;
    }

    /**
     * Gets the value of the estDurationDays property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getEstDurationDays() {
        return estDurationDays;
    }

    /**
     * Sets the value of the estDurationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setEstDurationDays(NullableInt32 value) {
        this.estDurationDays = value;
    }

    /**
     * Gets the value of the estDurationHours property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getEstDurationHours() {
        return estDurationHours;
    }

    /**
     * Sets the value of the estDurationHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setEstDurationHours(NullableInt32 value) {
        this.estDurationHours = value;
    }

    /**
     * Gets the value of the estDurationMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getEstDurationMinutes() {
        return estDurationMinutes;
    }

    /**
     * Sets the value of the estDurationMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setEstDurationMinutes(NullableInt32 value) {
        this.estDurationMinutes = value;
    }

    /**
     * Gets the value of the estDurationSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getEstDurationSeconds() {
        return estDurationSeconds;
    }

    /**
     * Sets the value of the estDurationSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setEstDurationSeconds(NullableInt32 value) {
        this.estDurationSeconds = value;
    }

}
