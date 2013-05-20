
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobRequiredSkillPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobRequiredSkillPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Job" minOccurs="0"/>
 *         &lt;element name="SkillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Skill" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Skill" minOccurs="0"/>
 *         &lt;element name="ProficiencyScaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyScale" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ProficiencyScale" minOccurs="0"/>
 *         &lt;element name="ProficiencyValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyValue" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ProficiencyValue" minOccurs="0"/>
 *         &lt;element name="PriorityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Priority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobRequiredSkillPropertyBase", propOrder = {
    "id",
    "jobId",
    "job",
    "skillId",
    "skill",
    "proficiencyScaleId",
    "proficiencyScale",
    "proficiencyValueId",
    "proficiencyValue",
    "priorityId",
    "priority"
})
@XmlSeeAlso({
    JobRequiredSkillCore.class
})
public abstract class JobRequiredSkillPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "JobId")
    protected String jobId;
    @XmlElement(name = "Job")
    protected Job job;
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
    @XmlElement(name = "PriorityId")
    protected String priorityId;
    @XmlElement(name = "Priority")
    protected Priority priority;

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
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
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
     * Gets the value of the priorityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityId() {
        return priorityId;
    }

    /**
     * Sets the value of the priorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityId(String value) {
        this.priorityId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

}
