
package com.mulesoft.demo.sumtotal.client.auth;

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
 *         &lt;element ref="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}GetLoggedInUserResult"/>
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
    "getLoggedInUserResult"
})
@XmlRootElement(name = "GetLoggedInUserResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
public class GetLoggedInUserResponse {

    @XmlElement(name = "GetLoggedInUserResult", required = true, nillable = true)
    protected User getLoggedInUserResult;

    /**
     * Gets the value of the getLoggedInUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getGetLoggedInUserResult() {
        return getLoggedInUserResult;
    }

    /**
     * Sets the value of the getLoggedInUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setGetLoggedInUserResult(User value) {
        this.getLoggedInUserResult = value;
    }

}
