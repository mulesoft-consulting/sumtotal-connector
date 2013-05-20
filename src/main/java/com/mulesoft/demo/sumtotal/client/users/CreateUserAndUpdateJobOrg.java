
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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}usr"/>
 *         &lt;element name="isNew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jobs" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="orgs" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfString" minOccurs="0"/>
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
    "usr",
    "isNew",
    "jobs",
    "orgs"
})
@XmlRootElement(name = "CreateUserAndUpdateJobOrg", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class CreateUserAndUpdateJobOrg {

    @XmlElement(required = true, nillable = true)
    protected User usr;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected boolean isNew;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfString jobs;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfString orgs;

    /**
     * Gets the value of the usr property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUsr() {
        return usr;
    }

    /**
     * Sets the value of the usr property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUsr(User value) {
        this.usr = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     */
    public void setIsNew(boolean value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setJobs(ArrayOfString value) {
        this.jobs = value;
    }

    /**
     * Gets the value of the orgs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOrgs() {
        return orgs;
    }

    /**
     * Sets the value of the orgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOrgs(ArrayOfString value) {
        this.orgs = value;
    }

}
