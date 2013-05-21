
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sumtotalsystems.sumtotal7.sumtotalbo.User;


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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}DeleteUserResult"/>
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
    "deleteUserResult"
})
@XmlRootElement(name = "DeleteUserResponse")
public class DeleteUserResponse {

    @XmlElement(name = "DeleteUserResult", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", required = true, nillable = true)
    protected User deleteUserResult;

    /**
     * Gets the value of the deleteUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getDeleteUserResult() {
        return deleteUserResult;
    }

    /**
     * Sets the value of the deleteUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setDeleteUserResult(User value) {
        this.deleteUserResult = value;
    }

}
