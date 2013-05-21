
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompetencyRequiredSkill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompetencyRequiredSkill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompetencyRequiredSkill" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CompetencyRequiredSkill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompetencyRequiredSkill", propOrder = {
    "competencyRequiredSkill"
})
public class ArrayOfCompetencyRequiredSkill {

    @XmlElement(name = "CompetencyRequiredSkill", nillable = true)
    protected List<CompetencyRequiredSkill> competencyRequiredSkill;

    /**
     * Gets the value of the competencyRequiredSkill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competencyRequiredSkill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetencyRequiredSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetencyRequiredSkill }
     * 
     * 
     */
    public List<CompetencyRequiredSkill> getCompetencyRequiredSkill() {
        if (competencyRequiredSkill == null) {
            competencyRequiredSkill = new ArrayList<CompetencyRequiredSkill>();
        }
        return this.competencyRequiredSkill;
    }

}
