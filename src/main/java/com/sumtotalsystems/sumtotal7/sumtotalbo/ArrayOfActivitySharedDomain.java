
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivitySharedDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivitySharedDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivitySharedDomain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivitySharedDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivitySharedDomain", propOrder = {
    "activitySharedDomain"
})
public class ArrayOfActivitySharedDomain {

    @XmlElement(name = "ActivitySharedDomain", nillable = true)
    protected List<ActivitySharedDomain> activitySharedDomain;

    /**
     * Gets the value of the activitySharedDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activitySharedDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivitySharedDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivitySharedDomain }
     * 
     * 
     */
    public List<ActivitySharedDomain> getActivitySharedDomain() {
        if (activitySharedDomain == null) {
            activitySharedDomain = new ArrayList<ActivitySharedDomain>();
        }
        return this.activitySharedDomain;
    }

}
