
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="usrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usrName",
    "populationLevel"
})
@XmlRootElement(name = "GetUserByUserName", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class GetUserByUserName {

    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String inDomainId;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected String usrName;
    @XmlElement(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
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
     * Gets the value of the usrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * Sets the value of the usrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrName(String value) {
        this.usrName = value;
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
