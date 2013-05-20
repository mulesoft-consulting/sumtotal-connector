
package com.mulesoft.demo.sumtotal.client.auth;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NullableDecimal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullableDecimal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullableDecimal", propOrder = {
    "isNull",
    "value"
})
public class NullableDecimal {

    @XmlElement(name = "IsNull")
    protected boolean isNull;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the isNull property.
     * 
     */
    public boolean isIsNull() {
        return isNull;
    }

    /**
     * Sets the value of the isNull property.
     * 
     */
    public void setIsNull(boolean value) {
        this.isNull = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
