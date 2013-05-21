
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityAllocationPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityAllocationPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalSeats" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="OccupiedSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReservedSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AllocationExpirationDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityAllocationPropertyBase", propOrder = {
    "id",
    "activityId",
    "activity",
    "name",
    "description",
    "totalSeats",
    "occupiedSeats",
    "reservedSeats",
    "allocationExpirationDate"
})
@XmlSeeAlso({
    ActivityAllocationCore.class
})
public abstract class ActivityAllocationPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "Activity")
    protected Activity activity;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TotalSeats", required = true)
    protected NullableInt32 totalSeats;
    @XmlElement(name = "OccupiedSeats")
    protected int occupiedSeats;
    @XmlElement(name = "ReservedSeats")
    protected int reservedSeats;
    @XmlElement(name = "AllocationExpirationDate", required = true)
    protected NullableDateTime allocationExpirationDate;

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
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the totalSeats property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getTotalSeats() {
        return totalSeats;
    }

    /**
     * Sets the value of the totalSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setTotalSeats(NullableInt32 value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the occupiedSeats property.
     * 
     */
    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    /**
     * Sets the value of the occupiedSeats property.
     * 
     */
    public void setOccupiedSeats(int value) {
        this.occupiedSeats = value;
    }

    /**
     * Gets the value of the reservedSeats property.
     * 
     */
    public int getReservedSeats() {
        return reservedSeats;
    }

    /**
     * Sets the value of the reservedSeats property.
     * 
     */
    public void setReservedSeats(int value) {
        this.reservedSeats = value;
    }

    /**
     * Gets the value of the allocationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getAllocationExpirationDate() {
        return allocationExpirationDate;
    }

    /**
     * Sets the value of the allocationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setAllocationExpirationDate(NullableDateTime value) {
        this.allocationExpirationDate = value;
    }

}
