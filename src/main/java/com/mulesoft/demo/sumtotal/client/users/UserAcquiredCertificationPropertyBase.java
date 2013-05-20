
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAcquiredCertificationPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAcquiredCertificationPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="CertificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certification" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAcquiredCertificationPropertyBase", propOrder = {
    "id",
    "userId",
    "user",
    "certificationId",
    "certification"
})
@XmlSeeAlso({
    UserAcquiredCertificationCore.class
})
public abstract class UserAcquiredCertificationPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "User")
    protected User user;
    @XmlElement(name = "CertificationId")
    protected String certificationId;
    @XmlElement(name = "Certification")
    protected Activity certification;

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
     * Gets the value of the certificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationId() {
        return certificationId;
    }

    /**
     * Sets the value of the certificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationId(String value) {
        this.certificationId = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getCertification() {
        return certification;
    }

    /**
     * Sets the value of the certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setCertification(Activity value) {
        this.certification = value;
    }

}
