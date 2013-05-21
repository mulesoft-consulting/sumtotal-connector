
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="acquiredSkillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profValueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acqFirstDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="acqLastDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "acquiredSkillId",
    "profValueId",
    "acqFirstDt",
    "acqLastDt",
    "notes"
})
@XmlRootElement(name = "AddUpdateAcquiredSkill")
public class AddUpdateAcquiredSkill {

    protected String toUsrId;
    protected String acquiredSkillId;
    protected String profValueId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acqFirstDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acqLastDt;
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
     * Gets the value of the acquiredSkillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquiredSkillId() {
        return acquiredSkillId;
    }

    /**
     * Sets the value of the acquiredSkillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquiredSkillId(String value) {
        this.acquiredSkillId = value;
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
     * Gets the value of the acqFirstDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcqFirstDt() {
        return acqFirstDt;
    }

    /**
     * Sets the value of the acqFirstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcqFirstDt(XMLGregorianCalendar value) {
        this.acqFirstDt = value;
    }

    /**
     * Gets the value of the acqLastDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcqLastDt() {
        return acqLastDt;
    }

    /**
     * Sets the value of the acqLastDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcqLastDt(XMLGregorianCalendar value) {
        this.acqLastDt = value;
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
