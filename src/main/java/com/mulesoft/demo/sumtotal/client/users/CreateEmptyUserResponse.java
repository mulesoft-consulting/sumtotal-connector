
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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CreateEmptyUserResult"/>
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
    "createEmptyUserResult"
})
@XmlRootElement(name = "CreateEmptyUserResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class CreateEmptyUserResponse {

    @XmlElement(name = "CreateEmptyUserResult", required = true, nillable = true)
    protected User createEmptyUserResult;

    /**
     * Gets the value of the createEmptyUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreateEmptyUserResult() {
        return createEmptyUserResult;
    }

    /**
     * Sets the value of the createEmptyUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreateEmptyUserResult(User value) {
        this.createEmptyUserResult = value;
    }

}
