
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="toUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requiredActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prtyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "toUserId",
    "requiredActivityId",
    "prtyId",
    "grdId",
    "notes"
})
@XmlRootElement(name = "AddUpdateRequiredActivity", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class AddUpdateRequiredActivity {

    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String toUserId;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String requiredActivityId;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String prtyId;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String grdId;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String notes;

    /**
     * Gets the value of the toUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUserId() {
        return toUserId;
    }

    /**
     * Sets the value of the toUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUserId(String value) {
        this.toUserId = value;
    }

    /**
     * Gets the value of the requiredActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredActivityId() {
        return requiredActivityId;
    }

    /**
     * Sets the value of the requiredActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredActivityId(String value) {
        this.requiredActivityId = value;
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
     * Gets the value of the grdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrdId() {
        return grdId;
    }

    /**
     * Sets the value of the grdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrdId(String value) {
        this.grdId = value;
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
