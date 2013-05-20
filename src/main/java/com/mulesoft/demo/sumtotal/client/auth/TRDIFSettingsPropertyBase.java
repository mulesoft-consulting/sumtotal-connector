
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRDIFSettingsPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRDIFSettingsPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDIF" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreReq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicConcern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Objectives" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Methods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalDurationDays" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="LegalDurationHours" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="LegalDurationMinutes" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="TROrgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TROrg" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TotalRegulationOrg" minOccurs="0"/>
 *         &lt;element name="TRCategoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRCategory" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TotalRegulationCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRDIFSettingsPropertyBase", propOrder = {
    "id",
    "isDIF",
    "preReq",
    "publicConcern",
    "objectives",
    "methods",
    "legalDurationDays",
    "legalDurationHours",
    "legalDurationMinutes",
    "trOrgId",
    "trOrg",
    "trCategoryId",
    "trCategory"
})
@XmlSeeAlso({
    TRDIFSettingsCore.class
})
public abstract class TRDIFSettingsPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IsDIF")
    protected boolean isDIF;
    @XmlElement(name = "PreReq")
    protected String preReq;
    @XmlElement(name = "PublicConcern")
    protected String publicConcern;
    @XmlElement(name = "Objectives")
    protected String objectives;
    @XmlElement(name = "Methods")
    protected String methods;
    @XmlElement(name = "LegalDurationDays", required = true)
    protected NullableInt32 legalDurationDays;
    @XmlElement(name = "LegalDurationHours", required = true)
    protected NullableInt32 legalDurationHours;
    @XmlElement(name = "LegalDurationMinutes", required = true)
    protected NullableInt32 legalDurationMinutes;
    @XmlElement(name = "TROrgId")
    protected String trOrgId;
    @XmlElement(name = "TROrg")
    protected TotalRegulationOrg trOrg;
    @XmlElement(name = "TRCategoryId")
    protected String trCategoryId;
    @XmlElement(name = "TRCategory")
    protected TotalRegulationCategory trCategory;

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
     * Gets the value of the isDIF property.
     * 
     */
    public boolean isIsDIF() {
        return isDIF;
    }

    /**
     * Sets the value of the isDIF property.
     * 
     */
    public void setIsDIF(boolean value) {
        this.isDIF = value;
    }

    /**
     * Gets the value of the preReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreReq() {
        return preReq;
    }

    /**
     * Sets the value of the preReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreReq(String value) {
        this.preReq = value;
    }

    /**
     * Gets the value of the publicConcern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicConcern() {
        return publicConcern;
    }

    /**
     * Sets the value of the publicConcern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicConcern(String value) {
        this.publicConcern = value;
    }

    /**
     * Gets the value of the objectives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectives() {
        return objectives;
    }

    /**
     * Sets the value of the objectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectives(String value) {
        this.objectives = value;
    }

    /**
     * Gets the value of the methods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethods(String value) {
        this.methods = value;
    }

    /**
     * Gets the value of the legalDurationDays property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getLegalDurationDays() {
        return legalDurationDays;
    }

    /**
     * Sets the value of the legalDurationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setLegalDurationDays(NullableInt32 value) {
        this.legalDurationDays = value;
    }

    /**
     * Gets the value of the legalDurationHours property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getLegalDurationHours() {
        return legalDurationHours;
    }

    /**
     * Sets the value of the legalDurationHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setLegalDurationHours(NullableInt32 value) {
        this.legalDurationHours = value;
    }

    /**
     * Gets the value of the legalDurationMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getLegalDurationMinutes() {
        return legalDurationMinutes;
    }

    /**
     * Sets the value of the legalDurationMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setLegalDurationMinutes(NullableInt32 value) {
        this.legalDurationMinutes = value;
    }

    /**
     * Gets the value of the trOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTROrgId() {
        return trOrgId;
    }

    /**
     * Sets the value of the trOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTROrgId(String value) {
        this.trOrgId = value;
    }

    /**
     * Gets the value of the trOrg property.
     * 
     * @return
     *     possible object is
     *     {@link TotalRegulationOrg }
     *     
     */
    public TotalRegulationOrg getTROrg() {
        return trOrg;
    }

    /**
     * Sets the value of the trOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalRegulationOrg }
     *     
     */
    public void setTROrg(TotalRegulationOrg value) {
        this.trOrg = value;
    }

    /**
     * Gets the value of the trCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRCategoryId() {
        return trCategoryId;
    }

    /**
     * Sets the value of the trCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRCategoryId(String value) {
        this.trCategoryId = value;
    }

    /**
     * Gets the value of the trCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TotalRegulationCategory }
     *     
     */
    public TotalRegulationCategory getTRCategory() {
        return trCategory;
    }

    /**
     * Sets the value of the trCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalRegulationCategory }
     *     
     */
    public void setTRCategory(TotalRegulationCategory value) {
        this.trCategory = value;
    }

}
