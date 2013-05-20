
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainUserPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainUserPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="SecurityRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityRole" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}SecurityRole" minOccurs="0"/>
 *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainUserPropertyBase", propOrder = {
    "id",
    "domainId",
    "domain",
    "userId",
    "user",
    "securityRoleId",
    "securityRole",
    "isPrimary"
})
@XmlSeeAlso({
    DomainUserCore.class
})
public abstract class DomainUserPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "SecurityRoleId")
    protected String securityRoleId;
    @XmlElement(name = "SecurityRole")
    protected SecurityRole securityRole;
    @XmlElement(name = "IsPrimary")
    protected boolean isPrimary;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link Domain }
     *     
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain }
     *     
     */
    public void setDomain(Domain value) {
        this.domain = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the securityRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRoleId() {
        return securityRoleId;
    }

    /**
     * Sets the value of the securityRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRoleId(String value) {
        this.securityRoleId = value;
    }

    /**
     * Gets the value of the securityRole property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRole }
     *     
     */
    public SecurityRole getSecurityRole() {
        return securityRole;
    }

    /**
     * Sets the value of the securityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRole }
     *     
     */
    public void setSecurityRole(SecurityRole value) {
        this.securityRole = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     */
    public boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     */
    public void setIsPrimary(boolean value) {
        this.isPrimary = value;
    }

}
