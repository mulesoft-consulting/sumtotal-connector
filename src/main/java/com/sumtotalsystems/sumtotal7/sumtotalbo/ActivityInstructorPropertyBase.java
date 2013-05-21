
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInstructorPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInstructorPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="InstructorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructor" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsResponsible" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsQualified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsConfirmed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInstructorPropertyBase", propOrder = {
    "id",
    "activityId",
    "activity",
    "instructorId",
    "instructor",
    "isPrimary",
    "isResponsible",
    "isQualified",
    "isConfirmed",
    "notes"
})
@XmlSeeAlso({
    ActivityInstructorCore.class
})
public abstract class ActivityInstructorPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "Activity")
    protected Activity activity;
    @XmlElement(name = "InstructorId")
    protected String instructorId;
    @XmlElement(name = "Instructor")
    protected User instructor;
    @XmlElement(name = "IsPrimary")
    protected int isPrimary;
    @XmlElement(name = "IsResponsible")
    protected int isResponsible;
    @XmlElement(name = "IsQualified")
    protected int isQualified;
    @XmlElement(name = "IsConfirmed")
    protected int isConfirmed;
    @XmlElement(name = "Notes")
    protected String notes;

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
     * Gets the value of the instructorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorId() {
        return instructorId;
    }

    /**
     * Sets the value of the instructorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorId(String value) {
        this.instructorId = value;
    }

    /**
     * Gets the value of the instructor property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getInstructor() {
        return instructor;
    }

    /**
     * Sets the value of the instructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setInstructor(User value) {
        this.instructor = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     */
    public int getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     */
    public void setIsPrimary(int value) {
        this.isPrimary = value;
    }

    /**
     * Gets the value of the isResponsible property.
     * 
     */
    public int getIsResponsible() {
        return isResponsible;
    }

    /**
     * Sets the value of the isResponsible property.
     * 
     */
    public void setIsResponsible(int value) {
        this.isResponsible = value;
    }

    /**
     * Gets the value of the isQualified property.
     * 
     */
    public int getIsQualified() {
        return isQualified;
    }

    /**
     * Sets the value of the isQualified property.
     * 
     */
    public void setIsQualified(int value) {
        this.isQualified = value;
    }

    /**
     * Gets the value of the isConfirmed property.
     * 
     */
    public int getIsConfirmed() {
        return isConfirmed;
    }

    /**
     * Sets the value of the isConfirmed property.
     * 
     */
    public void setIsConfirmed(int value) {
        this.isConfirmed = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
