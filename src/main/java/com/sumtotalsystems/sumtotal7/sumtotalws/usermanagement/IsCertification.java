
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inCertId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inUserId",
    "inCertId"
})
@XmlRootElement(name = "IsCertification")
public class IsCertification {

    protected String inUserId;
    protected String inCertId;

    /**
     * Gets the value of the inUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUserId() {
        return inUserId;
    }

    /**
     * Sets the value of the inUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUserId(String value) {
        this.inUserId = value;
    }

    /**
     * Gets the value of the inCertId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCertId() {
        return inCertId;
    }

    /**
     * Sets the value of the inCertId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCertId(String value) {
        this.inCertId = value;
    }

}
