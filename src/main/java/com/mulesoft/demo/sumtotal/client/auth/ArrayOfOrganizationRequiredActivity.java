
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrganizationRequiredActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrganizationRequiredActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationRequiredActivity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}OrganizationRequiredActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrganizationRequiredActivity", propOrder = {
    "organizationRequiredActivity"
})
public class ArrayOfOrganizationRequiredActivity {

    @XmlElement(name = "OrganizationRequiredActivity", nillable = true)
    protected List<OrganizationRequiredActivity> organizationRequiredActivity;

    /**
     * Gets the value of the organizationRequiredActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRequiredActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationRequiredActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationRequiredActivity }
     * 
     * 
     */
    public List<OrganizationRequiredActivity> getOrganizationRequiredActivity() {
        if (organizationRequiredActivity == null) {
            organizationRequiredActivity = new ArrayList<OrganizationRequiredActivity>();
        }
        return this.organizationRequiredActivity;
    }

}
