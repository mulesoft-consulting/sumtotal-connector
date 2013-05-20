
package com.mulesoft.demo.sumtotal.client.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobSharedDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobSharedDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobSharedDomain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}JobSharedDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobSharedDomain", propOrder = {
    "jobSharedDomain"
})
public class ArrayOfJobSharedDomain {

    @XmlElement(name = "JobSharedDomain", nillable = true)
    protected List<JobSharedDomain> jobSharedDomain;

    /**
     * Gets the value of the jobSharedDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobSharedDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobSharedDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobSharedDomain }
     * 
     * 
     */
    public List<JobSharedDomain> getJobSharedDomain() {
        if (jobSharedDomain == null) {
            jobSharedDomain = new ArrayList<JobSharedDomain>();
        }
        return this.jobSharedDomain;
    }

}
