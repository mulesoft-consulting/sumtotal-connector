
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityAttemptPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityAttemptPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="RegistrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registration" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityRegistration" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="EndDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="IsWaived" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsComplete" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CompletionStatus"/>
 *         &lt;element name="Success" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}SuccessStatus"/>
 *         &lt;element name="Score" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Grade" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="ElapsedSeconds" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDouble"/>
 *         &lt;element name="MergedSkills" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="HasAttended" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="Source" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityAttemptPropertyBase", propOrder = {
    "id",
    "userId",
    "user",
    "activityId",
    "activity",
    "registrationId",
    "registration",
    "startDate",
    "endDate",
    "isWaived",
    "isComplete",
    "success",
    "score",
    "note",
    "grade",
    "elapsedSeconds",
    "mergedSkills",
    "hasAttended",
    "source"
})
@XmlSeeAlso({
    ActivityAttemptCore.class
})
public abstract class ActivityAttemptPropertyBase
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
    @XmlElement(name = "RegistrationId")
    protected String registrationId;
    @XmlElement(name = "Registration")
    protected ActivityRegistration registration;
    @XmlElement(name = "StartDate", required = true)
    protected NullableDateTime startDate;
    @XmlElement(name = "EndDate", required = true)
    protected NullableDateTime endDate;
    @XmlElement(name = "IsWaived")
    protected int isWaived;
    @XmlElement(name = "IsComplete", required = true)
    protected CompletionStatus isComplete;
    @XmlElement(name = "Success", required = true)
    protected SuccessStatus success;
    @XmlElement(name = "Score", required = true)
    protected NullableDecimal score;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Grade", required = true)
    protected NullableInt32 grade;
    @XmlElement(name = "ElapsedSeconds", required = true)
    protected NullableDouble elapsedSeconds;
    @XmlElement(name = "MergedSkills", required = true)
    protected NullableInt32 mergedSkills;
    @XmlElement(name = "HasAttended", required = true)
    protected NullableInt32 hasAttended;
    @XmlElement(name = "Source", required = true)
    protected NullableInt32 source;

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
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityRegistration }
     *     
     */
    public ActivityRegistration getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityRegistration }
     *     
     */
    public void setRegistration(ActivityRegistration value) {
        this.registration = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setStartDate(NullableDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setEndDate(NullableDateTime value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the isWaived property.
     * 
     */
    public int getIsWaived() {
        return isWaived;
    }

    /**
     * Sets the value of the isWaived property.
     * 
     */
    public void setIsWaived(int value) {
        this.isWaived = value;
    }

    /**
     * Gets the value of the isComplete property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionStatus }
     *     
     */
    public CompletionStatus getIsComplete() {
        return isComplete;
    }

    /**
     * Sets the value of the isComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionStatus }
     *     
     */
    public void setIsComplete(CompletionStatus value) {
        this.isComplete = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessStatus }
     *     
     */
    public SuccessStatus getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessStatus }
     *     
     */
    public void setSuccess(SuccessStatus value) {
        this.success = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setScore(NullableDecimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setGrade(NullableInt32 value) {
        this.grade = value;
    }

    /**
     * Gets the value of the elapsedSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDouble }
     *     
     */
    public NullableDouble getElapsedSeconds() {
        return elapsedSeconds;
    }

    /**
     * Sets the value of the elapsedSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDouble }
     *     
     */
    public void setElapsedSeconds(NullableDouble value) {
        this.elapsedSeconds = value;
    }

    /**
     * Gets the value of the mergedSkills property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getMergedSkills() {
        return mergedSkills;
    }

    /**
     * Sets the value of the mergedSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setMergedSkills(NullableInt32 value) {
        this.mergedSkills = value;
    }

    /**
     * Gets the value of the hasAttended property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getHasAttended() {
        return hasAttended;
    }

    /**
     * Sets the value of the hasAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setHasAttended(NullableInt32 value) {
        this.hasAttended = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setSource(NullableInt32 value) {
        this.source = value;
    }

}
