
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityRolePropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityRolePropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InheritPermissions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BaseRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseRole" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}SecurityRole" minOccurs="0"/>
 *         &lt;element name="Permissions" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Permission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRolePropertyBase", propOrder = {
    "id",
    "name",
    "description",
    "domainId",
    "domain",
    "isDefault",
    "inheritPermissions",
    "isActive",
    "baseRoleId",
    "baseRole",
    "permissions"
})
@XmlSeeAlso({
    SecurityRoleCore.class
})
public abstract class SecurityRolePropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "IsDefault")
    protected boolean isDefault;
    @XmlElement(name = "InheritPermissions")
    protected boolean inheritPermissions;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "BaseRoleId")
    protected String baseRoleId;
    @XmlElement(name = "BaseRole")
    protected SecurityRole baseRole;
    @XmlElement(name = "Permissions")
    protected List<Permission> permissions;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the isDefault property.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the inheritPermissions property.
     * 
     */
    public boolean isInheritPermissions() {
        return inheritPermissions;
    }

    /**
     * Sets the value of the inheritPermissions property.
     * 
     */
    public void setInheritPermissions(boolean value) {
        this.inheritPermissions = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the baseRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRoleId() {
        return baseRoleId;
    }

    /**
     * Sets the value of the baseRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRoleId(String value) {
        this.baseRoleId = value;
    }

    /**
     * Gets the value of the baseRole property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRole }
     *     
     */
    public SecurityRole getBaseRole() {
        return baseRole;
    }

    /**
     * Sets the value of the baseRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRole }
     *     
     */
    public void setBaseRole(SecurityRole value) {
        this.baseRole = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permission }
     * 
     * 
     */
    public List<Permission> getPermissions() {
        if (permissions == null) {
            permissions = new ArrayList<Permission>();
        }
        return this.permissions;
    }

}
