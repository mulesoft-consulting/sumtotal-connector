
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Directions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonnelEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsInternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequiresApproval" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="ApproverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approver" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="TimeZonePreferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZonePreference" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TimeZone" minOccurs="0"/>
 *         &lt;element name="OptText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptMemo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptDate1" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptDate2" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OptMoney" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="OptInteger" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="OptFloat" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDouble"/>
 *         &lt;element name="OptCurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptCurrency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityPropertyBase", propOrder = {
    "id",
    "name",
    "contactPersonFirstName",
    "contactPersonLastName",
    "directions",
    "personnelEMail",
    "notes",
    "isInternal",
    "requiresApproval",
    "url",
    "addressCity",
    "addressCountry",
    "addressFax",
    "addressPhone1",
    "addressPhone2",
    "addressState",
    "addressStreet1",
    "addressStreet2",
    "addressPostalCode",
    "addressEmail",
    "domainId",
    "domain",
    "approverId",
    "approver",
    "timeZonePreferenceId",
    "timeZonePreference",
    "optText1",
    "optText2",
    "optText3",
    "optText4",
    "optMemo1",
    "optDate1",
    "optDate2",
    "optYesNo",
    "optMoney",
    "optInteger",
    "optFloat",
    "optCurrencyId",
    "optCurrency"
})
@XmlSeeAlso({
    FacilityCore.class
})
public abstract class FacilityPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ContactPersonFirstName")
    protected String contactPersonFirstName;
    @XmlElement(name = "ContactPersonLastName")
    protected String contactPersonLastName;
    @XmlElement(name = "Directions")
    protected String directions;
    @XmlElement(name = "PersonnelEMail")
    protected String personnelEMail;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "IsInternal")
    protected boolean isInternal;
    @XmlElement(name = "RequiresApproval", required = true)
    protected NullableInt32 requiresApproval;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "AddressCity")
    protected String addressCity;
    @XmlElement(name = "AddressCountry")
    protected String addressCountry;
    @XmlElement(name = "AddressFax")
    protected String addressFax;
    @XmlElement(name = "AddressPhone1")
    protected String addressPhone1;
    @XmlElement(name = "AddressPhone2")
    protected String addressPhone2;
    @XmlElement(name = "AddressState")
    protected String addressState;
    @XmlElement(name = "AddressStreet1")
    protected String addressStreet1;
    @XmlElement(name = "AddressStreet2")
    protected String addressStreet2;
    @XmlElement(name = "AddressPostalCode")
    protected String addressPostalCode;
    @XmlElement(name = "AddressEmail")
    protected String addressEmail;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "ApproverId")
    protected String approverId;
    @XmlElement(name = "Approver")
    protected User approver;
    @XmlElement(name = "TimeZonePreferenceId")
    protected String timeZonePreferenceId;
    @XmlElement(name = "TimeZonePreference")
    protected TimeZone timeZonePreference;
    @XmlElement(name = "OptText1")
    protected String optText1;
    @XmlElement(name = "OptText2")
    protected String optText2;
    @XmlElement(name = "OptText3")
    protected String optText3;
    @XmlElement(name = "OptText4")
    protected String optText4;
    @XmlElement(name = "OptMemo1")
    protected String optMemo1;
    @XmlElement(name = "OptDate1", required = true)
    protected NullableDateTime optDate1;
    @XmlElement(name = "OptDate2", required = true)
    protected NullableDateTime optDate2;
    @XmlElement(name = "OptYesNo")
    protected boolean optYesNo;
    @XmlElement(name = "OptMoney", required = true)
    protected NullableDecimal optMoney;
    @XmlElement(name = "OptInteger", required = true)
    protected NullableInt32 optInteger;
    @XmlElement(name = "OptFloat", required = true)
    protected NullableDouble optFloat;
    @XmlElement(name = "OptCurrencyId")
    protected String optCurrencyId;
    @XmlElement(name = "OptCurrency")
    protected Currency optCurrency;

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
     * Gets the value of the contactPersonFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonFirstName() {
        return contactPersonFirstName;
    }

    /**
     * Sets the value of the contactPersonFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonFirstName(String value) {
        this.contactPersonFirstName = value;
    }

    /**
     * Gets the value of the contactPersonLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonLastName() {
        return contactPersonLastName;
    }

    /**
     * Sets the value of the contactPersonLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonLastName(String value) {
        this.contactPersonLastName = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * Gets the value of the personnelEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelEMail() {
        return personnelEMail;
    }

    /**
     * Sets the value of the personnelEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelEMail(String value) {
        this.personnelEMail = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the isInternal property.
     * 
     */
    public boolean isIsInternal() {
        return isInternal;
    }

    /**
     * Sets the value of the isInternal property.
     * 
     */
    public void setIsInternal(boolean value) {
        this.isInternal = value;
    }

    /**
     * Gets the value of the requiresApproval property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getRequiresApproval() {
        return requiresApproval;
    }

    /**
     * Sets the value of the requiresApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setRequiresApproval(NullableInt32 value) {
        this.requiresApproval = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCity(String value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the addressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * Sets the value of the addressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCountry(String value) {
        this.addressCountry = value;
    }

    /**
     * Gets the value of the addressFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFax() {
        return addressFax;
    }

    /**
     * Sets the value of the addressFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFax(String value) {
        this.addressFax = value;
    }

    /**
     * Gets the value of the addressPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPhone1() {
        return addressPhone1;
    }

    /**
     * Sets the value of the addressPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPhone1(String value) {
        this.addressPhone1 = value;
    }

    /**
     * Gets the value of the addressPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPhone2() {
        return addressPhone2;
    }

    /**
     * Sets the value of the addressPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPhone2(String value) {
        this.addressPhone2 = value;
    }

    /**
     * Gets the value of the addressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressState() {
        return addressState;
    }

    /**
     * Sets the value of the addressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressState(String value) {
        this.addressState = value;
    }

    /**
     * Gets the value of the addressStreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet1() {
        return addressStreet1;
    }

    /**
     * Sets the value of the addressStreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet1(String value) {
        this.addressStreet1 = value;
    }

    /**
     * Gets the value of the addressStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet2() {
        return addressStreet2;
    }

    /**
     * Sets the value of the addressStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet2(String value) {
        this.addressStreet2 = value;
    }

    /**
     * Gets the value of the addressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * Sets the value of the addressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPostalCode(String value) {
        this.addressPostalCode = value;
    }

    /**
     * Gets the value of the addressEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressEmail() {
        return addressEmail;
    }

    /**
     * Sets the value of the addressEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressEmail(String value) {
        this.addressEmail = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link Domain }
     *     
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain }
     *     
     */
    public void setDomain(Domain value) {
        this.domain = value;
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
     * Gets the value of the timeZonePreferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZonePreferenceId() {
        return timeZonePreferenceId;
    }

    /**
     * Sets the value of the timeZonePreferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZonePreferenceId(String value) {
        this.timeZonePreferenceId = value;
    }

    /**
     * Gets the value of the timeZonePreference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZonePreference() {
        return timeZonePreference;
    }

    /**
     * Sets the value of the timeZonePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZonePreference(TimeZone value) {
        this.timeZonePreference = value;
    }

    /**
     * Gets the value of the optText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText1() {
        return optText1;
    }

    /**
     * Sets the value of the optText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText1(String value) {
        this.optText1 = value;
    }

    /**
     * Gets the value of the optText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText2() {
        return optText2;
    }

    /**
     * Sets the value of the optText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText2(String value) {
        this.optText2 = value;
    }

    /**
     * Gets the value of the optText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText3() {
        return optText3;
    }

    /**
     * Sets the value of the optText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText3(String value) {
        this.optText3 = value;
    }

    /**
     * Gets the value of the optText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText4() {
        return optText4;
    }

    /**
     * Sets the value of the optText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText4(String value) {
        this.optText4 = value;
    }

    /**
     * Gets the value of the optMemo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptMemo1() {
        return optMemo1;
    }

    /**
     * Sets the value of the optMemo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptMemo1(String value) {
        this.optMemo1 = value;
    }

    /**
     * Gets the value of the optDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getOptDate1() {
        return optDate1;
    }

    /**
     * Sets the value of the optDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setOptDate1(NullableDateTime value) {
        this.optDate1 = value;
    }

    /**
     * Gets the value of the optDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getOptDate2() {
        return optDate2;
    }

    /**
     * Sets the value of the optDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setOptDate2(NullableDateTime value) {
        this.optDate2 = value;
    }

    /**
     * Gets the value of the optYesNo property.
     * 
     */
    public boolean isOptYesNo() {
        return optYesNo;
    }

    /**
     * Sets the value of the optYesNo property.
     * 
     */
    public void setOptYesNo(boolean value) {
        this.optYesNo = value;
    }

    /**
     * Gets the value of the optMoney property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getOptMoney() {
        return optMoney;
    }

    /**
     * Sets the value of the optMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setOptMoney(NullableDecimal value) {
        this.optMoney = value;
    }

    /**
     * Gets the value of the optInteger property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getOptInteger() {
        return optInteger;
    }

    /**
     * Sets the value of the optInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setOptInteger(NullableInt32 value) {
        this.optInteger = value;
    }

    /**
     * Gets the value of the optFloat property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDouble }
     *     
     */
    public NullableDouble getOptFloat() {
        return optFloat;
    }

    /**
     * Sets the value of the optFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDouble }
     *     
     */
    public void setOptFloat(NullableDouble value) {
        this.optFloat = value;
    }

    /**
     * Gets the value of the optCurrencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptCurrencyId() {
        return optCurrencyId;
    }

    /**
     * Sets the value of the optCurrencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptCurrencyId(String value) {
        this.optCurrencyId = value;
    }

    /**
     * Gets the value of the optCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOptCurrency() {
        return optCurrency;
    }

    /**
     * Sets the value of the optCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOptCurrency(Currency value) {
        this.optCurrency = value;
    }

}
