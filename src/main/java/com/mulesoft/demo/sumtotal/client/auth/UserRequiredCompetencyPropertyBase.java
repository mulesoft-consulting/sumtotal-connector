
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRequiredCompetencyPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRequiredCompetencyPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="CompetencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Competency" minOccurs="0"/>
 *         &lt;element name="PriorityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Priority" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRequiredCompetencyPropertyBase", propOrder = {
    "id",
    "userId",
    "user",
    "competencyId",
    "competency",
    "priorityId",
    "priority",
    "note"
})
@XmlSeeAlso({
    UserRequiredCompetencyCore.class
})
public abstract class UserRequiredCompetencyPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "CompetencyId")
    protected String competencyId;
    @XmlElement(name = "Competency")
    protected Competency competency;
    @XmlElement(name = "PriorityId")
    protected String priorityId;
    @XmlElement(name = "Priority")
    protected Priority priority;
    @XmlElement(name = "Note")
    protected String note;

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
     * Gets the value of the competencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyId() {
        return competencyId;
    }

    /**
     * Sets the value of the competencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyId(String value) {
        this.competencyId = value;
    }

    /**
     * Gets the value of the competency property.
     * 
     * @return
     *     possible object is
     *     {@link Competency }
     *     
     */
    public Competency getCompetency() {
        return competency;
    }

    /**
     * Sets the value of the competency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Competency }
     *     
     */
    public void setCompetency(Competency value) {
        this.competency = value;
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

}
