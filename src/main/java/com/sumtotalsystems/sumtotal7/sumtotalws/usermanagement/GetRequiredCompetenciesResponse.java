
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

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
 *         &lt;element name="GetRequiredCompetenciesResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfUserRequiredCompetency" minOccurs="0"/>
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
    "getRequiredCompetenciesResult"
})
@XmlRootElement(name = "GetRequiredCompetenciesResponse")
public class GetRequiredCompetenciesResponse {

    @XmlElement(name = "GetRequiredCompetenciesResult")
    protected ArrayOfUserRequiredCompetency getRequiredCompetenciesResult;

    /**
     * Gets the value of the getRequiredCompetenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredCompetency }
     *     
     */
    public ArrayOfUserRequiredCompetency getGetRequiredCompetenciesResult() {
        return getRequiredCompetenciesResult;
    }

    /**
     * Sets the value of the getRequiredCompetenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredCompetency }
     *     
     */
    public void setGetRequiredCompetenciesResult(ArrayOfUserRequiredCompetency value) {
        this.getRequiredCompetenciesResult = value;
    }

}
