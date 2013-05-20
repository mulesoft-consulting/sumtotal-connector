
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for UserSecurityContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSecurityContext">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/}UserToken" minOccurs="0"/>
 *         &lt;element name="Identity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/}AspenContextIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSecurityContext", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", propOrder = {
    "token",
    "identity"
})
public class UserSecurityContext {

    @XmlElement(name = "Token")
    protected UserToken token;
    @XmlElement(name = "Identity")
    protected AspenContextIdentity identity;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link UserToken }
     *     
     */
    public UserToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserToken }
     *     
     */
    public void setToken(UserToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link AspenContextIdentity }
     *     
     */
    public AspenContextIdentity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspenContextIdentity }
     *     
     */
    public void setIdentity(AspenContextIdentity value) {
        this.identity = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
