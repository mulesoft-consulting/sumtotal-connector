
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inDomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="populationLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inDomainId",
    "searchFilter",
    "populationLevel"
})
@XmlRootElement(name = "GetUsers")
public class GetUsers {

    protected String inDomainId;
    protected String searchFilter;
    protected int populationLevel;

    /**
     * Gets the value of the inDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDomainId() {
        return inDomainId;
    }

    /**
     * Sets the value of the inDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDomainId(String value) {
        this.inDomainId = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchFilter(String value) {
        this.searchFilter = value;
    }

    /**
     * Gets the value of the populationLevel property.
     * 
     */
    public int getPopulationLevel() {
        return populationLevel;
    }

    /**
     * Sets the value of the populationLevel property.
     * 
     */
    public void setPopulationLevel(int value) {
        this.populationLevel = value;
    }

}
