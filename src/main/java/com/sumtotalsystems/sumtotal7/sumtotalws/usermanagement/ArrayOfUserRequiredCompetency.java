
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sumtotalsystems.sumtotal7.sumtotalbo.UserRequiredCompetency;


/**
 * <p>Java class for ArrayOfUserRequiredCompetency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserRequiredCompetency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserRequiredCompetency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserRequiredCompetency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserRequiredCompetency", propOrder = {
    "userRequiredCompetency"
})
public class ArrayOfUserRequiredCompetency {

    @XmlElement(name = "UserRequiredCompetency", nillable = true)
    protected List<UserRequiredCompetency> userRequiredCompetency;

    /**
     * Gets the value of the userRequiredCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRequiredCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRequiredCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRequiredCompetency }
     * 
     * 
     */
    public List<UserRequiredCompetency> getUserRequiredCompetency() {
        if (userRequiredCompetency == null) {
            userRequiredCompetency = new ArrayList<UserRequiredCompetency>();
        }
        return this.userRequiredCompetency;
    }

}
