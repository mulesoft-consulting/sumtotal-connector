
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobUser" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}JobUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobUser", propOrder = {
    "jobUser"
})
public class ArrayOfJobUser {

    @XmlElement(name = "JobUser", nillable = true)
    protected List<JobUser> jobUser;

    /**
     * Gets the value of the jobUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobUser }
     * 
     * 
     */
    public List<JobUser> getJobUser() {
        if (jobUser == null) {
            jobUser = new ArrayList<JobUser>();
        }
        return this.jobUser;
    }

}
