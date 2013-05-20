
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityOfferingPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityOfferingPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanBeOffered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OfferingOfActivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityOfferingPropertyBase", propOrder = {
    "id",
    "canBeOffered",
    "offeringOfActivity"
})
@XmlSeeAlso({
    ActivityOfferingCore.class
})
public abstract class ActivityOfferingPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CanBeOffered")
    protected boolean canBeOffered;
    @XmlElement(name = "OfferingOfActivity")
    protected int offeringOfActivity;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the canBeOffered property.
     * 
     */
    public boolean isCanBeOffered() {
        return canBeOffered;
    }

    /**
     * Sets the value of the canBeOffered property.
     * 
     */
    public void setCanBeOffered(boolean value) {
        this.canBeOffered = value;
    }

    /**
     * Gets the value of the offeringOfActivity property.
     * 
     */
    public int getOfferingOfActivity() {
        return offeringOfActivity;
    }

    /**
     * Sets the value of the offeringOfActivity property.
     * 
     */
    public void setOfferingOfActivity(int value) {
        this.offeringOfActivity = value;
    }

}
