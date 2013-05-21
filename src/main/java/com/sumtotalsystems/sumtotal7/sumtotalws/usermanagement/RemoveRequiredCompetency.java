
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
 *         &lt;element name="removedUserRequiredCompId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "removedUserRequiredCompId"
})
@XmlRootElement(name = "RemoveRequiredCompetency")
public class RemoveRequiredCompetency {

    protected String removedUserRequiredCompId;

    /**
     * Gets the value of the removedUserRequiredCompId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovedUserRequiredCompId() {
        return removedUserRequiredCompId;
    }

    /**
     * Sets the value of the removedUserRequiredCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovedUserRequiredCompId(String value) {
        this.removedUserRequiredCompId = value;
    }

}
