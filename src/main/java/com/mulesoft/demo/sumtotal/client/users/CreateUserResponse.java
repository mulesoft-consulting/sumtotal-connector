
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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CreateUserResult"/>
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
    "createUserResult"
})
@XmlRootElement(name = "CreateUserResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class CreateUserResponse {

    @XmlElement(name = "CreateUserResult", required = true, nillable = true)
    protected User createUserResult;

    /**
     * Gets the value of the createUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreateUserResult() {
        return createUserResult;
    }

    /**
     * Sets the value of the createUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreateUserResult(User value) {
        this.createUserResult = value;
    }

}
