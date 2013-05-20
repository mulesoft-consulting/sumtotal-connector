
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityTrackPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityTrackPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApproverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approver" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="CostBase" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="CostWhenCancelledBeforeDeadline" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="CostWhenCancelledAfterDeadline" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="CostWhenNoShow" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Currency" minOccurs="0"/>
 *         &lt;element name="OwnerActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerActivity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="CostRule" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TrackCostingRule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityTrackPropertyBase", propOrder = {
    "id",
    "name",
    "description",
    "approverId",
    "approver",
    "type",
    "costBase",
    "costWhenCancelledBeforeDeadline",
    "costWhenCancelledAfterDeadline",
    "costWhenNoShow",
    "isActive",
    "currencyId",
    "currency",
    "ownerActivityId",
    "ownerActivity",
    "costRule"
})
@XmlSeeAlso({
    ActivityTrackCore.class
})
public abstract class ActivityTrackPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ApproverId")
    protected String approverId;
    @XmlElement(name = "Approver")
    protected User approver;
    @XmlElement(name = "Type", required = true)
    protected NullableInt32 type;
    @XmlElement(name = "CostBase", required = true)
    protected NullableDecimal costBase;
    @XmlElement(name = "CostWhenCancelledBeforeDeadline", required = true)
    protected NullableDecimal costWhenCancelledBeforeDeadline;
    @XmlElement(name = "CostWhenCancelledAfterDeadline", required = true)
    protected NullableDecimal costWhenCancelledAfterDeadline;
    @XmlElement(name = "CostWhenNoShow", required = true)
    protected NullableDecimal costWhenNoShow;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "CurrencyId")
    protected String currencyId;
    @XmlElement(name = "Currency")
    protected Currency currency;
    @XmlElement(name = "OwnerActivityId")
    protected String ownerActivityId;
    @XmlElement(name = "OwnerActivity")
    protected Activity ownerActivity;
    @XmlElement(name = "CostRule", required = true)
    protected TrackCostingRule costRule;

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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the approverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverId() {
        return approverId;
    }

    /**
     * Sets the value of the approverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverId(String value) {
        this.approverId = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setApprover(User value) {
        this.approver = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setType(NullableInt32 value) {
        this.type = value;
    }

    /**
     * Gets the value of the costBase property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getCostBase() {
        return costBase;
    }

    /**
     * Sets the value of the costBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setCostBase(NullableDecimal value) {
        this.costBase = value;
    }

    /**
     * Gets the value of the costWhenCancelledBeforeDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getCostWhenCancelledBeforeDeadline() {
        return costWhenCancelledBeforeDeadline;
    }

    /**
     * Sets the value of the costWhenCancelledBeforeDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setCostWhenCancelledBeforeDeadline(NullableDecimal value) {
        this.costWhenCancelledBeforeDeadline = value;
    }

    /**
     * Gets the value of the costWhenCancelledAfterDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getCostWhenCancelledAfterDeadline() {
        return costWhenCancelledAfterDeadline;
    }

    /**
     * Sets the value of the costWhenCancelledAfterDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setCostWhenCancelledAfterDeadline(NullableDecimal value) {
        this.costWhenCancelledAfterDeadline = value;
    }

    /**
     * Gets the value of the costWhenNoShow property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getCostWhenNoShow() {
        return costWhenNoShow;
    }

    /**
     * Sets the value of the costWhenNoShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setCostWhenNoShow(NullableDecimal value) {
        this.costWhenNoShow = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the ownerActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerActivityId() {
        return ownerActivityId;
    }

    /**
     * Sets the value of the ownerActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerActivityId(String value) {
        this.ownerActivityId = value;
    }

    /**
     * Gets the value of the ownerActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getOwnerActivity() {
        return ownerActivity;
    }

    /**
     * Sets the value of the ownerActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setOwnerActivity(Activity value) {
        this.ownerActivity = value;
    }

    /**
     * Gets the value of the costRule property.
     * 
     * @return
     *     possible object is
     *     {@link TrackCostingRule }
     *     
     */
    public TrackCostingRule getCostRule() {
        return costRule;
    }

    /**
     * Sets the value of the costRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackCostingRule }
     *     
     */
    public void setCostRule(TrackCostingRule value) {
        this.costRule = value;
    }

}
