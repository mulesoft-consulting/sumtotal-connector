
package com.mulesoft.demo.sumtotal.client.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompetencySharedDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompetencySharedDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompetencySharedDomain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CompetencySharedDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompetencySharedDomain", propOrder = {
    "competencySharedDomain"
})
public class ArrayOfCompetencySharedDomain {

    @XmlElement(name = "CompetencySharedDomain", nillable = true)
    protected List<CompetencySharedDomain> competencySharedDomain;

    /**
     * Gets the value of the competencySharedDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencySharedDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencySharedDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencySharedDomain }
     * 
     * 
     */
    public List<CompetencySharedDomain> getCompetencySharedDomain() {
        if (competencySharedDomain == null) {
            competencySharedDomain = new ArrayList<CompetencySharedDomain>();
        }
        return this.competencySharedDomain;
    }

}
