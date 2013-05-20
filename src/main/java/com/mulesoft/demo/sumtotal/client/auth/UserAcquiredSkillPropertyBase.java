
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserAcquiredSkillPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAcquiredSkillPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="SkillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Skill" minOccurs="0"/>
 *         &lt;element name="ProficiencyScaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyScale" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ProficiencyScale" minOccurs="0"/>
 *         &lt;element name="ProficiencyValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyValue" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ProficiencyValue" minOccurs="0"/>
 *         &lt;element name="FirstAcquisitionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MostRecentAcquisitionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CertificationNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "UserAcquiredSkillPropertyBase", propOrder = {
    "id",
    "userId",
    "user",
    "skillId",
    "skill",
    "proficiencyScaleId",
    "proficiencyScale",
    "proficiencyValueId",
    "proficiencyValue",
    "firstAcquisitionDate",
    "mostRecentAcquisitionDate",
    "certificationNote",
    "certificationNoteDate"
})
@XmlSeeAlso({
    UserAcquiredSkillCore.class
})
public abstract class UserAcquiredSkillPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "SkillId")
    protected String skillId;
    @XmlElement(name = "Skill")
    protected Skill skill;
    @XmlElement(name = "ProficiencyScaleId")
    protected String proficiencyScaleId;
    @XmlElement(name = "ProficiencyScale")
    protected ProficiencyScale proficiencyScale;
    @XmlElement(name = "ProficiencyValueId")
    protected String proficiencyValueId;
    @XmlElement(name = "ProficiencyValue")
    protected ProficiencyValue proficiencyValue;
    @XmlElement(name = "FirstAcquisitionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstAcquisitionDate;
    @XmlElement(name = "MostRecentAcquisitionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mostRecentAcquisitionDate;
    @XmlElement(name = "CertificationNote")
    protected String certificationNote;
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
     * Gets the value of the skillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * Sets the value of the skillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillId(String value) {
        this.skillId = value;
    }

    /**
     * Gets the value of the skill property.
     * 
     * @return
     *     possible object is
     *     {@link Skill }
     *     
     */
    public Skill getSkill() {
        return skill;
    }

    /**
     * Sets the value of the skill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Skill }
     *     
     */
    public void setSkill(Skill value) {
        this.skill = value;
    }

    /**
     * Gets the value of the proficiencyScaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProficiencyScaleId() {
        return proficiencyScaleId;
    }

    /**
     * Sets the value of the proficiencyScaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProficiencyScaleId(String value) {
        this.proficiencyScaleId = value;
    }

    /**
     * Gets the value of the proficiencyScale property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyScale }
     *     
     */
    public ProficiencyScale getProficiencyScale() {
        return proficiencyScale;
    }

    /**
     * Sets the value of the proficiencyScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyScale }
     *     
     */
    public void setProficiencyScale(ProficiencyScale value) {
        this.proficiencyScale = value;
    }

    /**
     * Gets the value of the proficiencyValueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProficiencyValueId() {
        return proficiencyValueId;
    }

    /**
     * Sets the value of the proficiencyValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProficiencyValueId(String value) {
        this.proficiencyValueId = value;
    }

    /**
     * Gets the value of the proficiencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyValue }
     *     
     */
    public ProficiencyValue getProficiencyValue() {
        return proficiencyValue;
    }

    /**
     * Sets the value of the proficiencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyValue }
     *     
     */
    public void setProficiencyValue(ProficiencyValue value) {
        this.proficiencyValue = value;
    }

    /**
     * Gets the value of the firstAcquisitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstAcquisitionDate() {
        return firstAcquisitionDate;
    }

    /**
     * Sets the value of the firstAcquisitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstAcquisitionDate(XMLGregorianCalendar value) {
        this.firstAcquisitionDate = value;
    }

    /**
     * Gets the value of the mostRecentAcquisitionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMostRecentAcquisitionDate() {
        return mostRecentAcquisitionDate;
    }

    /**
     * Sets the value of the mostRecentAcquisitionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMostRecentAcquisitionDate(XMLGregorianCalendar value) {
        this.mostRecentAcquisitionDate = value;
    }

    /**
     * Gets the value of the certificationNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNote() {
        return certificationNote;
    }

    /**
     * Sets the value of the certificationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationNote(String value) {
        this.certificationNote = value;
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
