
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
 *         &lt;element name="GetRequiredSkillsResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfUserRequiredSkill" minOccurs="0"/>
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
    "getRequiredSkillsResult"
})
@XmlRootElement(name = "GetRequiredSkillsResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class GetRequiredSkillsResponse {

    @XmlElement(name = "GetRequiredSkillsResult", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfUserRequiredSkill2 getRequiredSkillsResult;

    /**
     * Gets the value of the getRequiredSkillsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredSkill2 }
     *     
     */
    public ArrayOfUserRequiredSkill2 getGetRequiredSkillsResult() {
        return getRequiredSkillsResult;
    }

    /**
     * Sets the value of the getRequiredSkillsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredSkill2 }
     *     
     */
    public void setGetRequiredSkillsResult(ArrayOfUserRequiredSkill2 value) {
        this.getRequiredSkillsResult = value;
    }

}
