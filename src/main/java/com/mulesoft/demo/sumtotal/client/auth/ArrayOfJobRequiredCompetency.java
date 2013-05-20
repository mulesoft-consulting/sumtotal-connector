
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobRequiredCompetency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobRequiredCompetency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobRequiredCompetency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}JobRequiredCompetency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobRequiredCompetency", propOrder = {
    "jobRequiredCompetency"
})
public class ArrayOfJobRequiredCompetency {

    @XmlElement(name = "JobRequiredCompetency", nillable = true)
    protected List<JobRequiredCompetency> jobRequiredCompetency;

    /**
     * Gets the value of the jobRequiredCompetency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobRequiredCompetency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobRequiredCompetency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobRequiredCompetency }
     * 
     * 
     */
    public List<JobRequiredCompetency> getJobRequiredCompetency() {
        if (jobRequiredCompetency == null) {
            jobRequiredCompetency = new ArrayList<JobRequiredCompetency>();
        }
        return this.jobRequiredCompetency;
    }

}
