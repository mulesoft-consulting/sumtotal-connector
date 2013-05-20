
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivityLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivityLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityLocation" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityLocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivityLocation", propOrder = {
    "activityLocation"
})
public class ArrayOfActivityLocation {

    @XmlElement(name = "ActivityLocation", nillable = true)
    protected List<ActivityLocation> activityLocation;

    /**
     * Gets the value of the activityLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityLocation }
     * 
     * 
     */
    public List<ActivityLocation> getActivityLocation() {
        if (activityLocation == null) {
            activityLocation = new ArrayList<ActivityLocation>();
        }
        return this.activityLocation;
    }

}
