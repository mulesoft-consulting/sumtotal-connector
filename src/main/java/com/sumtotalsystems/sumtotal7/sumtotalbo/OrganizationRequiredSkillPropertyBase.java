
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationRequiredSkillPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationRequiredSkillPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organization" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Organization" minOccurs="0"/>
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
@XmlType(name = "OrganizationRequiredSkillPropertyBase", propOrder = {
    "id",
    "organizationId",
    "organization",
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
    OrganizationRequiredSkillCore.class
})
public abstract class OrganizationRequiredSkillPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OrganizationId")
    protected String organizationId;
    @XmlElement(name = "Organization")
    protected Organization organization;
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
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
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
