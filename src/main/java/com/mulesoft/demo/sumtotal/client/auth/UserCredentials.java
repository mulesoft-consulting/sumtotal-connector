
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationType" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/}UserAuthenticationType"/>
 *         &lt;element name="AccountType" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/}UserType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCredentials", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", propOrder = {
    "username",
    "passcode",
    "authenticationType",
    "accountType"
})
public class UserCredentials {

    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Passcode")
    protected String passcode;
    @XmlElement(name = "AuthenticationType", required = true)
    protected UserAuthenticationType authenticationType;
    @XmlElement(name = "AccountType", required = true)
    protected UserType accountType;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the passcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasscode() {
        return passcode;
    }

    /**
     * Sets the value of the passcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasscode(String value) {
        this.passcode = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthenticationType }
     *     
     */
    public UserAuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthenticationType }
     *     
     */
    public void setAuthenticationType(UserAuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setAccountType(UserType value) {
        this.accountType = value;
    }

}
