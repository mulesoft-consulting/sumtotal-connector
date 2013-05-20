
package com.mulesoft.demo.sumtotal.client.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfJobRequiredActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfJobRequiredActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobRequiredActivity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}JobRequiredActivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfJobRequiredActivity", propOrder = {
    "jobRequiredActivity"
})
public class ArrayOfJobRequiredActivity {

    @XmlElement(name = "JobRequiredActivity", nillable = true)
    protected List<JobRequiredActivity> jobRequiredActivity;

    /**
     * Gets the value of the jobRequiredActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobRequiredActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobRequiredActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobRequiredActivity }
     * 
     * 
     */
    public List<JobRequiredActivity> getJobRequiredActivity() {
        if (jobRequiredActivity == null) {
            jobRequiredActivity = new ArrayList<JobRequiredActivity>();
        }
        return this.jobRequiredActivity;
    }

}
