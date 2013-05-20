
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityRegistrationPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityRegistrationPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}RegistrationStatus"/>
 *         &lt;element name="AllocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Allocation" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityAllocation" minOccurs="0"/>
 *         &lt;element name="ReminderNoteDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="ConfirmationNoteDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="CancelledNoteDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="CertificationNoteDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityRegistrationPropertyBase", propOrder = {
    "id",
    "userId",
    "user",
    "activityId",
    "activity",
    "registrationStatus",
    "allocationId",
    "allocation",
    "reminderNoteDate",
    "confirmationNoteDate",
    "cancelledNoteDate",
    "certificationNoteDate"
})
@XmlSeeAlso({
    ActivityRegistrationCore.class
})
public abstract class ActivityRegistrationPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "Activity")
    protected Activity activity;
    @XmlElement(name = "RegistrationStatus", required = true)
    protected RegistrationStatus registrationStatus;
    @XmlElement(name = "AllocationId")
    protected String allocationId;
    @XmlElement(name = "Allocation")
    protected ActivityAllocation allocation;
    @XmlElement(name = "ReminderNoteDate", required = true)
    protected NullableDateTime reminderNoteDate;
    @XmlElement(name = "ConfirmationNoteDate", required = true)
    protected NullableDateTime confirmationNoteDate;
    @XmlElement(name = "CancelledNoteDate", required = true)
    protected NullableDateTime cancelledNoteDate;
    @XmlElement(name = "CertificationNoteDate", required = true)
    protected NullableDateTime certificationNoteDate;

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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setRegistrationStatus(RegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the allocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationId() {
        return allocationId;
    }

    /**
     * Sets the value of the allocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationId(String value) {
        this.allocationId = value;
    }

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAllocation }
     *     
     */
    public ActivityAllocation getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAllocation }
     *     
     */
    public void setAllocation(ActivityAllocation value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the reminderNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getReminderNoteDate() {
        return reminderNoteDate;
    }

    /**
     * Sets the value of the reminderNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setReminderNoteDate(NullableDateTime value) {
        this.reminderNoteDate = value;
    }

    /**
     * Gets the value of the confirmationNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getConfirmationNoteDate() {
        return confirmationNoteDate;
    }

    /**
     * Sets the value of the confirmationNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setConfirmationNoteDate(NullableDateTime value) {
        this.confirmationNoteDate = value;
    }

    /**
     * Gets the value of the cancelledNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getCancelledNoteDate() {
        return cancelledNoteDate;
    }

    /**
     * Sets the value of the cancelledNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setCancelledNoteDate(NullableDateTime value) {
        this.cancelledNoteDate = value;
    }

    /**
     * Gets the value of the certificationNoteDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getCertificationNoteDate() {
        return certificationNoteDate;
    }

    /**
     * Sets the value of the certificationNoteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setCertificationNoteDate(NullableDateTime value) {
        this.certificationNoteDate = value;
    }

}
