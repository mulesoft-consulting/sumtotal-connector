
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobRequiredSkill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobRequiredSkill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobRequiredSkill" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}JobRequiredSkill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobRequiredSkill", propOrder = {
    "jobRequiredSkill"
})
public class ArrayOfJobRequiredSkill {

    @XmlElement(name = "JobRequiredSkill", nillable = true)
    protected List<JobRequiredSkill> jobRequiredSkill;

    /**
     * Gets the value of the jobRequiredSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobRequiredSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobRequiredSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobRequiredSkill }
     * 
     * 
     */
    public List<JobRequiredSkill> getJobRequiredSkill() {
        if (jobRequiredSkill == null) {
            jobRequiredSkill = new ArrayList<JobRequiredSkill>();
        }
        return this.jobRequiredSkill;
    }

}
