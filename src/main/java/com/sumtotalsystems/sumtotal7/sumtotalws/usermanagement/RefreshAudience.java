
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
 *         &lt;element name="audID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "audID"
})
@XmlRootElement(name = "RefreshAudience")
public class RefreshAudience {

    protected String audID;

    /**
     * Gets the value of the audID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudID() {
        return audID;
    }

    /**
     * Sets the value of the audID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudID(String value) {
        this.audID = value;
    }

}
