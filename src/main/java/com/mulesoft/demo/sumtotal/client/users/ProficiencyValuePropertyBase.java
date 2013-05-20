
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProficiencyValuePropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProficiencyValuePropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyScaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProficiencyScale" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ProficiencyScale" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProficiencyValuePropertyBase", propOrder = {
    "id",
    "proficiencyScaleId",
    "proficiencyScale",
    "value",
    "name"
})
@XmlSeeAlso({
    ProficiencyValueCore.class
})
public abstract class ProficiencyValuePropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ProficiencyScaleId")
    protected String proficiencyScaleId;
    @XmlElement(name = "ProficiencyScale")
    protected ProficiencyScale proficiencyScale;
    @XmlElement(name = "Value")
    protected int value;
    @XmlElement(name = "Name")
    protected String name;

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
     * Gets the value of the proficiencyScaleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProficiencyScaleId() {
        return proficiencyScaleId;
    }

    /**
     * Sets the value of the proficiencyScaleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProficiencyScaleId(String value) {
        this.proficiencyScaleId = value;
    }

    /**
     * Gets the value of the proficiencyScale property.
     * 
     * @return
     *     possible object is
     *     {@link ProficiencyScale }
     *     
     */
    public ProficiencyScale getProficiencyScale() {
        return proficiencyScale;
    }

    /**
     * Sets the value of the proficiencyScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProficiencyScale }
     *     
     */
    public void setProficiencyScale(ProficiencyScale value) {
        this.proficiencyScale = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
