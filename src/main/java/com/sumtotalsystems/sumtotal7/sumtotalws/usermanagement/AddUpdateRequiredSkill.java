
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredSkillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prtyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "toUsrId",
    "requiredSkillId",
    "prtyId",
    "profValueId",
    "notes"
})
@XmlRootElement(name = "AddUpdateRequiredSkill")
public class AddUpdateRequiredSkill {

    protected String toUsrId;
    protected String requiredSkillId;
    protected String prtyId;
    protected String profValueId;
    protected String notes;

    /**
     * Gets the value of the toUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUsrId() {
        return toUsrId;
    }

    /**
     * Sets the value of the toUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUsrId(String value) {
        this.toUsrId = value;
    }

    /**
     * Gets the value of the requiredSkillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredSkillId() {
        return requiredSkillId;
    }

    /**
     * Sets the value of the requiredSkillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredSkillId(String value) {
        this.requiredSkillId = value;
    }

    /**
     * Gets the value of the prtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtyId() {
        return prtyId;
    }

    /**
     * Sets the value of the prtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtyId(String value) {
        this.prtyId = value;
    }

    /**
     * Gets the value of the profValueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfValueId() {
        return profValueId;
    }

    /**
     * Sets the value of the profValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfValueId(String value) {
        this.profValueId = value;
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
