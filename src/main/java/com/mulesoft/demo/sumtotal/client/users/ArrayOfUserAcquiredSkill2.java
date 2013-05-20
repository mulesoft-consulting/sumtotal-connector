
package com.mulesoft.demo.sumtotal.client.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserAcquiredSkill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserAcquiredSkill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserAcquiredSkill" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserAcquiredSkill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserAcquiredSkill", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", propOrder = {
    "userAcquiredSkill"
})
public class ArrayOfUserAcquiredSkill2 {

    @XmlElement(name = "UserAcquiredSkill", nillable = true)
    protected List<UserAcquiredSkill> userAcquiredSkill;

    /**
     * Gets the value of the userAcquiredSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAcquiredSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAcquiredSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAcquiredSkill }
     * 
     * 
     */
    public List<UserAcquiredSkill> getUserAcquiredSkill() {
        if (userAcquiredSkill == null) {
            userAcquiredSkill = new ArrayList<UserAcquiredSkill>();
        }
        return this.userAcquiredSkill;
    }

}
