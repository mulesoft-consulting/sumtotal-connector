
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
 *         &lt;element name="removedUserRequiredSkillId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "removedUserRequiredSkillId"
})
@XmlRootElement(name = "RemoveRequiredSkill")
public class RemoveRequiredSkill {

    protected String removedUserRequiredSkillId;

    /**
     * Gets the value of the removedUserRequiredSkillId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovedUserRequiredSkillId() {
        return removedUserRequiredSkillId;
    }

    /**
     * Sets the value of the removedUserRequiredSkillId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovedUserRequiredSkillId(String value) {
        this.removedUserRequiredSkillId = value;
    }

}
