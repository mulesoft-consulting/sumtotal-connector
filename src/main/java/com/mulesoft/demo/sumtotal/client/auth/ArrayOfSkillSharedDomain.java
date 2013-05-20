
package com.mulesoft.demo.sumtotal.client.auth;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSkillSharedDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSkillSharedDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SkillSharedDomain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}SkillSharedDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSkillSharedDomain", propOrder = {
    "skillSharedDomain"
})
public class ArrayOfSkillSharedDomain {

    @XmlElement(name = "SkillSharedDomain", nillable = true)
    protected List<SkillSharedDomain> skillSharedDomain;

    /**
     * Gets the value of the skillSharedDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skillSharedDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkillSharedDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SkillSharedDomain }
     * 
     * 
     */
    public List<SkillSharedDomain> getSkillSharedDomain() {
        if (skillSharedDomain == null) {
            skillSharedDomain = new ArrayList<SkillSharedDomain>();
        }
        return this.skillSharedDomain;
    }

}
