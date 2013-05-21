
package com.sumtotalsystems.sumtotal7.sumtotalws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AspenContextIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AspenContextIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VcUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsrPk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpPk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LangPk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DomainPk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AspenContextIdentity", propOrder = {
    "username",
    "vcUserId",
    "usrPk",
    "empPk",
    "langPk",
    "domainPk",
    "mustChangePassword"
})
public class AspenContextIdentity {

    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "VcUserId")
    protected String vcUserId;
    @XmlElement(name = "UsrPk")
    protected int usrPk;
    @XmlElement(name = "EmpPk")
    protected int empPk;
    @XmlElement(name = "LangPk")
    protected int langPk;
    @XmlElement(name = "DomainPk")
    protected int domainPk;
    @XmlElement(name = "MustChangePassword")
    protected int mustChangePassword;

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
     * Gets the value of the vcUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcUserId() {
        return vcUserId;
    }

    /**
     * Sets the value of the vcUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcUserId(String value) {
        this.vcUserId = value;
    }

    /**
     * Gets the value of the usrPk property.
     * 
     */
    public int getUsrPk() {
        return usrPk;
    }

    /**
     * Sets the value of the usrPk property.
     * 
     */
    public void setUsrPk(int value) {
        this.usrPk = value;
    }

    /**
     * Gets the value of the empPk property.
     * 
     */
    public int getEmpPk() {
        return empPk;
    }

    /**
     * Sets the value of the empPk property.
     * 
     */
    public void setEmpPk(int value) {
        this.empPk = value;
    }

    /**
     * Gets the value of the langPk property.
     * 
     */
    public int getLangPk() {
        return langPk;
    }

    /**
     * Sets the value of the langPk property.
     * 
     */
    public void setLangPk(int value) {
        this.langPk = value;
    }

    /**
     * Gets the value of the domainPk property.
     * 
     */
    public int getDomainPk() {
        return domainPk;
    }

    /**
     * Sets the value of the domainPk property.
     * 
     */
    public void setDomainPk(int value) {
        this.domainPk = value;
    }

    /**
     * Gets the value of the mustChangePassword property.
     * 
     */
    public int getMustChangePassword() {
        return mustChangePassword;
    }

    /**
     * Sets the value of the mustChangePassword property.
     * 
     */
    public void setMustChangePassword(int value) {
        this.mustChangePassword = value;
    }

}
