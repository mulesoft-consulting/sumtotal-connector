
package com.mulesoft.demo.sumtotal.client.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserAcquiredCertification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserAcquiredCertification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserAcquiredCertification" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserAcquiredCertification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserAcquiredCertification", propOrder = {
    "userAcquiredCertification"
})
public class ArrayOfUserAcquiredCertification {

    @XmlElement(name = "UserAcquiredCertification", nillable = true)
    protected List<UserAcquiredCertification> userAcquiredCertification;

    /**
     * Gets the value of the userAcquiredCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAcquiredCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAcquiredCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAcquiredCertification }
     * 
     * 
     */
    public List<UserAcquiredCertification> getUserAcquiredCertification() {
        if (userAcquiredCertification == null) {
            userAcquiredCertification = new ArrayList<UserAcquiredCertification>();
        }
        return this.userAcquiredCertification;
    }

}
