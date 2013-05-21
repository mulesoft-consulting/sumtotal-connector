
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDomain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HierarchyTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HierarchyType" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}HierarchyType" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Organization" minOccurs="0"/>
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactUser" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
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
 *         &lt;element name="RequiredActivities" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfOrganizationRequiredActivity"/>
 *         &lt;element name="RequiredSkills" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfOrganizationRequiredSkill"/>
 *         &lt;element name="RequiredCompetencies" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfOrganizationRequiredCompetency"/>
 *         &lt;element name="OrganizationUsers" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfOrganizationUser"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationPropertyBase", propOrder = {
    "id",
    "code",
    "name",
    "note",
    "url",
    "isDomain",
    "hierarchyTypeId",
    "hierarchyType",
    "parentId",
    "parent",
    "addressCity",
    "addressCountry",
    "addressFax",
    "addressPhone1",
    "addressPhone2",
    "addressState",
    "addressStreet1",
    "addressStreet2",
    "addressPostalCode",
    "contactEmail",
    "contactUserId",
    "contactUser",
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
    "optCurrency",
    "requiredActivities",
    "requiredSkills",
    "requiredCompetencies",
    "organizationUsers"
})
@XmlSeeAlso({
    OrganizationCore.class
})
public abstract class OrganizationPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "IsDomain")
    protected boolean isDomain;
    @XmlElement(name = "HierarchyTypeId")
    protected String hierarchyTypeId;
    @XmlElement(name = "HierarchyType")
    protected HierarchyType hierarchyType;
    @XmlElement(name = "ParentId")
    protected String parentId;
    @XmlElement(name = "Parent")
    protected Organization parent;
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
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "ContactUserId")
    protected String contactUserId;
    @XmlElement(name = "ContactUser")
    protected User contactUser;
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
    @XmlElement(name = "RequiredActivities", required = true, nillable = true)
    protected ArrayOfOrganizationRequiredActivity requiredActivities;
    @XmlElement(name = "RequiredSkills", required = true, nillable = true)
    protected ArrayOfOrganizationRequiredSkill requiredSkills;
    @XmlElement(name = "RequiredCompetencies", required = true, nillable = true)
    protected ArrayOfOrganizationRequiredCompetency requiredCompetencies;
    @XmlElement(name = "OrganizationUsers", required = true, nillable = true)
    protected ArrayOfOrganizationUser organizationUsers;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
     * Gets the value of the isDomain property.
     * 
     */
    public boolean isIsDomain() {
        return isDomain;
    }

    /**
     * Sets the value of the isDomain property.
     * 
     */
    public void setIsDomain(boolean value) {
        this.isDomain = value;
    }

    /**
     * Gets the value of the hierarchyTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyTypeId() {
        return hierarchyTypeId;
    }

    /**
     * Sets the value of the hierarchyTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyTypeId(String value) {
        this.hierarchyTypeId = value;
    }

    /**
     * Gets the value of the hierarchyType property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyType }
     *     
     */
    public HierarchyType getHierarchyType() {
        return hierarchyType;
    }

    /**
     * Sets the value of the hierarchyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyType }
     *     
     */
    public void setHierarchyType(HierarchyType value) {
        this.hierarchyType = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setParent(Organization value) {
        this.parent = value;
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
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactUserId() {
        return contactUserId;
    }

    /**
     * Sets the value of the contactUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactUserId(String value) {
        this.contactUserId = value;
    }

    /**
     * Gets the value of the contactUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getContactUser() {
        return contactUser;
    }

    /**
     * Sets the value of the contactUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setContactUser(User value) {
        this.contactUser = value;
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

    /**
     * Gets the value of the requiredActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganizationRequiredActivity }
     *     
     */
    public ArrayOfOrganizationRequiredActivity getRequiredActivities() {
        return requiredActivities;
    }

    /**
     * Sets the value of the requiredActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganizationRequiredActivity }
     *     
     */
    public void setRequiredActivities(ArrayOfOrganizationRequiredActivity value) {
        this.requiredActivities = value;
    }

    /**
     * Gets the value of the requiredSkills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganizationRequiredSkill }
     *     
     */
    public ArrayOfOrganizationRequiredSkill getRequiredSkills() {
        return requiredSkills;
    }

    /**
     * Sets the value of the requiredSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganizationRequiredSkill }
     *     
     */
    public void setRequiredSkills(ArrayOfOrganizationRequiredSkill value) {
        this.requiredSkills = value;
    }

    /**
     * Gets the value of the requiredCompetencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganizationRequiredCompetency }
     *     
     */
    public ArrayOfOrganizationRequiredCompetency getRequiredCompetencies() {
        return requiredCompetencies;
    }

    /**
     * Sets the value of the requiredCompetencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganizationRequiredCompetency }
     *     
     */
    public void setRequiredCompetencies(ArrayOfOrganizationRequiredCompetency value) {
        this.requiredCompetencies = value;
    }

    /**
     * Gets the value of the organizationUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganizationUser }
     *     
     */
    public ArrayOfOrganizationUser getOrganizationUsers() {
        return organizationUsers;
    }

    /**
     * Sets the value of the organizationUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganizationUser }
     *     
     */
    public void setOrganizationUsers(ArrayOfOrganizationUser value) {
        this.organizationUsers = value;
    }

}
