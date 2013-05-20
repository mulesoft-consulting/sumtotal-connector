
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
 *         &lt;element name="removedUserRequiredActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "removedUserRequiredActivityId"
})
@XmlRootElement(name = "RemoveRequiredActivity", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class RemoveRequiredActivity {

    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String removedUserRequiredActivityId;

    /**
     * Gets the value of the removedUserRequiredActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovedUserRequiredActivityId() {
        return removedUserRequiredActivityId;
    }

    /**
     * Sets the value of the removedUserRequiredActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovedUserRequiredActivityId(String value) {
        this.removedUserRequiredActivityId = value;
    }

}
