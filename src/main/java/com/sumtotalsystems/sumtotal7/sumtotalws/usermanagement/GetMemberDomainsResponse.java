
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
 *         &lt;element name="GetMemberDomainsResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfDomainUser" minOccurs="0"/>
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
    "getMemberDomainsResult"
})
@XmlRootElement(name = "GetMemberDomainsResponse")
public class GetMemberDomainsResponse {

    @XmlElement(name = "GetMemberDomainsResult")
    protected ArrayOfDomainUser getMemberDomainsResult;

    /**
     * Gets the value of the getMemberDomainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainUser }
     *     
     */
    public ArrayOfDomainUser getGetMemberDomainsResult() {
        return getMemberDomainsResult;
    }

    /**
     * Sets the value of the getMemberDomainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainUser }
     *     
     */
    public void setGetMemberDomainsResult(ArrayOfDomainUser value) {
        this.getMemberDomainsResult = value;
    }

}
