
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
 *         &lt;element name="GetRequiredActivitiesResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfUserRequiredActivity" minOccurs="0"/>
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
    "getRequiredActivitiesResult"
})
@XmlRootElement(name = "GetRequiredActivitiesResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class GetRequiredActivitiesResponse {

    @XmlElement(name = "GetRequiredActivitiesResult", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfUserRequiredActivity2 getRequiredActivitiesResult;

    /**
     * Gets the value of the getRequiredActivitiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredActivity2 }
     *     
     */
    public ArrayOfUserRequiredActivity2 getGetRequiredActivitiesResult() {
        return getRequiredActivitiesResult;
    }

    /**
     * Sets the value of the getRequiredActivitiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredActivity2 }
     *     
     */
    public void setGetRequiredActivitiesResult(ArrayOfUserRequiredActivity2 value) {
        this.getRequiredActivitiesResult = value;
    }

}
