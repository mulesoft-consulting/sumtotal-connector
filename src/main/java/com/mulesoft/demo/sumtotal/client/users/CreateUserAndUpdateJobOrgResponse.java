
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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CreateUserAndUpdateJobOrgResult"/>
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
    "createUserAndUpdateJobOrgResult"
})
@XmlRootElement(name = "CreateUserAndUpdateJobOrgResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class CreateUserAndUpdateJobOrgResponse {

    @XmlElement(name = "CreateUserAndUpdateJobOrgResult", required = true, nillable = true)
    protected User createUserAndUpdateJobOrgResult;

    /**
     * Gets the value of the createUserAndUpdateJobOrgResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreateUserAndUpdateJobOrgResult() {
        return createUserAndUpdateJobOrgResult;
    }

    /**
     * Sets the value of the createUserAndUpdateJobOrgResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreateUserAndUpdateJobOrgResult(User value) {
        this.createUserAndUpdateJobOrgResult = value;
    }

}
