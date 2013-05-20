
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivityInstructor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivityInstructor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityInstructor" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityInstructor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivityInstructor", propOrder = {
    "activityInstructor"
})
public class ArrayOfActivityInstructor {

    @XmlElement(name = "ActivityInstructor", nillable = true)
    protected List<ActivityInstructor> activityInstructor;

    /**
     * Gets the value of the activityInstructor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityInstructor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityInstructor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityInstructor }
     * 
     * 
     */
    public List<ActivityInstructor> getActivityInstructor() {
        if (activityInstructor == null) {
            activityInstructor = new ArrayList<ActivityInstructor>();
        }
        return this.activityInstructor;
    }

}
