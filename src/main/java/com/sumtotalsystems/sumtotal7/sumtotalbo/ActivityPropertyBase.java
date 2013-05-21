
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityLabel" minOccurs="0"/>
 *         &lt;element name="ParentActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentActivity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="RootActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RootActivity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsOpenForRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NoRegistrationRequired" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="MaximumNumberOfAttempts" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="IsCancelled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmployeeNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstructorNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseCost" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="CancellationCost" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="LateCancellationCost" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="NoShowCost" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="CostCurrency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="StartDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="EndDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="RegistrationDeadline" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="RegCancellationDeadline" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="TimeZone" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="RequiresApproval" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="DefaultApproverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultApprover" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="ContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Metadata" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityMetadata" minOccurs="0"/>
 *         &lt;element name="SystemMetadataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemMetadata" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivitySystemMetadata" minOccurs="0"/>
 *         &lt;element name="OptText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptMemo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptDate1" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptDate2" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptYesNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OptMoney" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="OptInteger" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="OptFloat" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDouble"/>
 *         &lt;element name="OptCurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptCurrency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Currency" minOccurs="0"/>
 *         &lt;element name="IsCertification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LEMtdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEMtd" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}LEMtd" minOccurs="0"/>
 *         &lt;element name="OfferingStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferingStatus" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityOffering" minOccurs="0"/>
 *         &lt;element name="MinimumCapacity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="MaximumCapacity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="DIFSettingsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DIFSettings" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TRDIFSettings" minOccurs="0"/>
 *         &lt;element name="DurationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ActivityDuration" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SharedDomains" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivitySharedDomain"/>
 *         &lt;element name="Instructors" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityInstructor"/>
 *         &lt;element name="Locations" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityLocation"/>
 *         &lt;element name="Equipments" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityEquipment"/>
 *         &lt;element name="Tracks" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityTrack"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityPropertyBase", propOrder = {
    "id",
    "name",
    "labelId",
    "label",
    "parentActivityId",
    "parentActivity",
    "rootActivityId",
    "rootActivity",
    "domainId",
    "domain",
    "code",
    "description",
    "url",
    "isActive",
    "isOpenForRegistration",
    "noRegistrationRequired",
    "maximumNumberOfAttempts",
    "isCancelled",
    "isHidden",
    "isPrivate",
    "employeeNotes",
    "instructorNotes",
    "baseCost",
    "cancellationCost",
    "lateCancellationCost",
    "noShowCost",
    "costCurrency",
    "startDate",
    "endDate",
    "registrationDeadline",
    "regCancellationDeadline",
    "timeZone",
    "requiresApproval",
    "defaultApproverId",
    "defaultApprover",
    "contactEmail",
    "notificationEmail",
    "metadataId",
    "metadata",
    "systemMetadataId",
    "systemMetadata",
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
    "isCertification",
    "leMtdId",
    "leMtd",
    "offeringStatusId",
    "offeringStatus",
    "minimumCapacity",
    "maximumCapacity",
    "difSettingsId",
    "difSettings",
    "durationId",
    "duration",
    "lastUpdateDate",
    "sharedDomains",
    "instructors",
    "locations",
    "equipments",
    "tracks"
})
@XmlSeeAlso({
    ActivityCore.class
})
public abstract class ActivityPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LabelId")
    protected String labelId;
    @XmlElement(name = "Label")
    protected ActivityLabel label;
    @XmlElement(name = "ParentActivityId")
    protected String parentActivityId;
    @XmlElement(name = "ParentActivity")
    protected Activity parentActivity;
    @XmlElement(name = "RootActivityId")
    protected String rootActivityId;
    @XmlElement(name = "RootActivity")
    protected Activity rootActivity;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "IsOpenForRegistration")
    protected int isOpenForRegistration;
    @XmlElement(name = "NoRegistrationRequired", required = true)
    protected NullableInt32 noRegistrationRequired;
    @XmlElement(name = "MaximumNumberOfAttempts", required = true)
    protected NullableInt32 maximumNumberOfAttempts;
    @XmlElement(name = "IsCancelled")
    protected int isCancelled;
    @XmlElement(name = "IsHidden")
    protected int isHidden;
    @XmlElement(name = "IsPrivate")
    protected int isPrivate;
    @XmlElement(name = "EmployeeNotes")
    protected String employeeNotes;
    @XmlElement(name = "InstructorNotes")
    protected String instructorNotes;
    @XmlElement(name = "BaseCost", required = true)
    protected NullableDecimal baseCost;
    @XmlElement(name = "CancellationCost", required = true)
    protected NullableDecimal cancellationCost;
    @XmlElement(name = "LateCancellationCost", required = true)
    protected NullableDecimal lateCancellationCost;
    @XmlElement(name = "NoShowCost", required = true)
    protected NullableDecimal noShowCost;
    @XmlElement(name = "CostCurrency", required = true)
    protected NullableInt32 costCurrency;
    @XmlElement(name = "StartDate", required = true)
    protected NullableDateTime startDate;
    @XmlElement(name = "EndDate", required = true)
    protected NullableDateTime endDate;
    @XmlElement(name = "RegistrationDeadline", required = true)
    protected NullableDateTime registrationDeadline;
    @XmlElement(name = "RegCancellationDeadline", required = true)
    protected NullableDateTime regCancellationDeadline;
    @XmlElement(name = "TimeZone", required = true)
    protected NullableInt32 timeZone;
    @XmlElement(name = "RequiresApproval", required = true)
    protected NullableInt32 requiresApproval;
    @XmlElement(name = "DefaultApproverId")
    protected String defaultApproverId;
    @XmlElement(name = "DefaultApprover")
    protected User defaultApprover;
    @XmlElement(name = "ContactEmail")
    protected String contactEmail;
    @XmlElement(name = "NotificationEmail")
    protected String notificationEmail;
    @XmlElement(name = "MetadataId")
    protected String metadataId;
    @XmlElement(name = "Metadata")
    protected ActivityMetadata metadata;
    @XmlElement(name = "SystemMetadataId")
    protected String systemMetadataId;
    @XmlElement(name = "SystemMetadata")
    protected ActivitySystemMetadata systemMetadata;
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
    protected int optYesNo;
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
    @XmlElement(name = "IsCertification")
    protected boolean isCertification;
    @XmlElement(name = "LEMtdId")
    protected String leMtdId;
    @XmlElement(name = "LEMtd")
    protected LEMtd leMtd;
    @XmlElement(name = "OfferingStatusId")
    protected String offeringStatusId;
    @XmlElement(name = "OfferingStatus")
    protected ActivityOffering offeringStatus;
    @XmlElement(name = "MinimumCapacity", required = true)
    protected NullableInt32 minimumCapacity;
    @XmlElement(name = "MaximumCapacity", required = true)
    protected NullableInt32 maximumCapacity;
    @XmlElement(name = "DIFSettingsId")
    protected String difSettingsId;
    @XmlElement(name = "DIFSettings")
    protected TRDIFSettings difSettings;
    @XmlElement(name = "DurationId")
    protected String durationId;
    @XmlElement(name = "Duration")
    protected ActivityDuration duration;
    @XmlElement(name = "LastUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "SharedDomains", required = true, nillable = true)
    protected ArrayOfActivitySharedDomain sharedDomains;
    @XmlElement(name = "Instructors", required = true, nillable = true)
    protected ArrayOfActivityInstructor instructors;
    @XmlElement(name = "Locations", required = true, nillable = true)
    protected ArrayOfActivityLocation locations;
    @XmlElement(name = "Equipments", required = true, nillable = true)
    protected ArrayOfActivityEquipment equipments;
    @XmlElement(name = "Tracks", required = true, nillable = true)
    protected ArrayOfActivityTrack tracks;

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
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelId(String value) {
        this.labelId = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLabel }
     *     
     */
    public ActivityLabel getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLabel }
     *     
     */
    public void setLabel(ActivityLabel value) {
        this.label = value;
    }

    /**
     * Gets the value of the parentActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentActivityId() {
        return parentActivityId;
    }

    /**
     * Sets the value of the parentActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentActivityId(String value) {
        this.parentActivityId = value;
    }

    /**
     * Gets the value of the parentActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getParentActivity() {
        return parentActivity;
    }

    /**
     * Sets the value of the parentActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setParentActivity(Activity value) {
        this.parentActivity = value;
    }

    /**
     * Gets the value of the rootActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootActivityId() {
        return rootActivityId;
    }

    /**
     * Sets the value of the rootActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootActivityId(String value) {
        this.rootActivityId = value;
    }

    /**
     * Gets the value of the rootActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getRootActivity() {
        return rootActivity;
    }

    /**
     * Sets the value of the rootActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setRootActivity(Activity value) {
        this.rootActivity = value;
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
     * Gets the value of the isOpenForRegistration property.
     * 
     */
    public int getIsOpenForRegistration() {
        return isOpenForRegistration;
    }

    /**
     * Sets the value of the isOpenForRegistration property.
     * 
     */
    public void setIsOpenForRegistration(int value) {
        this.isOpenForRegistration = value;
    }

    /**
     * Gets the value of the noRegistrationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getNoRegistrationRequired() {
        return noRegistrationRequired;
    }

    /**
     * Sets the value of the noRegistrationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setNoRegistrationRequired(NullableInt32 value) {
        this.noRegistrationRequired = value;
    }

    /**
     * Gets the value of the maximumNumberOfAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getMaximumNumberOfAttempts() {
        return maximumNumberOfAttempts;
    }

    /**
     * Sets the value of the maximumNumberOfAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setMaximumNumberOfAttempts(NullableInt32 value) {
        this.maximumNumberOfAttempts = value;
    }

    /**
     * Gets the value of the isCancelled property.
     * 
     */
    public int getIsCancelled() {
        return isCancelled;
    }

    /**
     * Sets the value of the isCancelled property.
     * 
     */
    public void setIsCancelled(int value) {
        this.isCancelled = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public int getIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(int value) {
        this.isHidden = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     */
    public int getIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     */
    public void setIsPrivate(int value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the employeeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNotes() {
        return employeeNotes;
    }

    /**
     * Sets the value of the employeeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNotes(String value) {
        this.employeeNotes = value;
    }

    /**
     * Gets the value of the instructorNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructorNotes() {
        return instructorNotes;
    }

    /**
     * Sets the value of the instructorNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructorNotes(String value) {
        this.instructorNotes = value;
    }

    /**
     * Gets the value of the baseCost property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getBaseCost() {
        return baseCost;
    }

    /**
     * Sets the value of the baseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setBaseCost(NullableDecimal value) {
        this.baseCost = value;
    }

    /**
     * Gets the value of the cancellationCost property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getCancellationCost() {
        return cancellationCost;
    }

    /**
     * Sets the value of the cancellationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setCancellationCost(NullableDecimal value) {
        this.cancellationCost = value;
    }

    /**
     * Gets the value of the lateCancellationCost property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getLateCancellationCost() {
        return lateCancellationCost;
    }

    /**
     * Sets the value of the lateCancellationCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setLateCancellationCost(NullableDecimal value) {
        this.lateCancellationCost = value;
    }

    /**
     * Gets the value of the noShowCost property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getNoShowCost() {
        return noShowCost;
    }

    /**
     * Sets the value of the noShowCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setNoShowCost(NullableDecimal value) {
        this.noShowCost = value;
    }

    /**
     * Gets the value of the costCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getCostCurrency() {
        return costCurrency;
    }

    /**
     * Sets the value of the costCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setCostCurrency(NullableInt32 value) {
        this.costCurrency = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setStartDate(NullableDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setEndDate(NullableDateTime value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the registrationDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getRegistrationDeadline() {
        return registrationDeadline;
    }

    /**
     * Sets the value of the registrationDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setRegistrationDeadline(NullableDateTime value) {
        this.registrationDeadline = value;
    }

    /**
     * Gets the value of the regCancellationDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getRegCancellationDeadline() {
        return regCancellationDeadline;
    }

    /**
     * Sets the value of the regCancellationDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setRegCancellationDeadline(NullableDateTime value) {
        this.regCancellationDeadline = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setTimeZone(NullableInt32 value) {
        this.timeZone = value;
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
     * Gets the value of the defaultApproverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultApproverId() {
        return defaultApproverId;
    }

    /**
     * Sets the value of the defaultApproverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultApproverId(String value) {
        this.defaultApproverId = value;
    }

    /**
     * Gets the value of the defaultApprover property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getDefaultApprover() {
        return defaultApprover;
    }

    /**
     * Sets the value of the defaultApprover property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setDefaultApprover(User value) {
        this.defaultApprover = value;
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
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the metadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataId() {
        return metadataId;
    }

    /**
     * Sets the value of the metadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataId(String value) {
        this.metadataId = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityMetadata }
     *     
     */
    public ActivityMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityMetadata }
     *     
     */
    public void setMetadata(ActivityMetadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the systemMetadataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemMetadataId() {
        return systemMetadataId;
    }

    /**
     * Sets the value of the systemMetadataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemMetadataId(String value) {
        this.systemMetadataId = value;
    }

    /**
     * Gets the value of the systemMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ActivitySystemMetadata }
     *     
     */
    public ActivitySystemMetadata getSystemMetadata() {
        return systemMetadata;
    }

    /**
     * Sets the value of the systemMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitySystemMetadata }
     *     
     */
    public void setSystemMetadata(ActivitySystemMetadata value) {
        this.systemMetadata = value;
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
    public int getOptYesNo() {
        return optYesNo;
    }

    /**
     * Sets the value of the optYesNo property.
     * 
     */
    public void setOptYesNo(int value) {
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
     * Gets the value of the isCertification property.
     * 
     */
    public boolean isIsCertification() {
        return isCertification;
    }

    /**
     * Sets the value of the isCertification property.
     * 
     */
    public void setIsCertification(boolean value) {
        this.isCertification = value;
    }

    /**
     * Gets the value of the leMtdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEMtdId() {
        return leMtdId;
    }

    /**
     * Sets the value of the leMtdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEMtdId(String value) {
        this.leMtdId = value;
    }

    /**
     * Gets the value of the leMtd property.
     * 
     * @return
     *     possible object is
     *     {@link LEMtd }
     *     
     */
    public LEMtd getLEMtd() {
        return leMtd;
    }

    /**
     * Sets the value of the leMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEMtd }
     *     
     */
    public void setLEMtd(LEMtd value) {
        this.leMtd = value;
    }

    /**
     * Gets the value of the offeringStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingStatusId() {
        return offeringStatusId;
    }

    /**
     * Sets the value of the offeringStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingStatusId(String value) {
        this.offeringStatusId = value;
    }

    /**
     * Gets the value of the offeringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityOffering }
     *     
     */
    public ActivityOffering getOfferingStatus() {
        return offeringStatus;
    }

    /**
     * Sets the value of the offeringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityOffering }
     *     
     */
    public void setOfferingStatus(ActivityOffering value) {
        this.offeringStatus = value;
    }

    /**
     * Gets the value of the minimumCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getMinimumCapacity() {
        return minimumCapacity;
    }

    /**
     * Sets the value of the minimumCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setMinimumCapacity(NullableInt32 value) {
        this.minimumCapacity = value;
    }

    /**
     * Gets the value of the maximumCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Sets the value of the maximumCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setMaximumCapacity(NullableInt32 value) {
        this.maximumCapacity = value;
    }

    /**
     * Gets the value of the difSettingsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIFSettingsId() {
        return difSettingsId;
    }

    /**
     * Sets the value of the difSettingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIFSettingsId(String value) {
        this.difSettingsId = value;
    }

    /**
     * Gets the value of the difSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TRDIFSettings }
     *     
     */
    public TRDIFSettings getDIFSettings() {
        return difSettings;
    }

    /**
     * Sets the value of the difSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRDIFSettings }
     *     
     */
    public void setDIFSettings(TRDIFSettings value) {
        this.difSettings = value;
    }

    /**
     * Gets the value of the durationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationId() {
        return durationId;
    }

    /**
     * Sets the value of the durationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationId(String value) {
        this.durationId = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDuration }
     *     
     */
    public ActivityDuration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDuration }
     *     
     */
    public void setDuration(ActivityDuration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the sharedDomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivitySharedDomain }
     *     
     */
    public ArrayOfActivitySharedDomain getSharedDomains() {
        return sharedDomains;
    }

    /**
     * Sets the value of the sharedDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivitySharedDomain }
     *     
     */
    public void setSharedDomains(ArrayOfActivitySharedDomain value) {
        this.sharedDomains = value;
    }

    /**
     * Gets the value of the instructors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityInstructor }
     *     
     */
    public ArrayOfActivityInstructor getInstructors() {
        return instructors;
    }

    /**
     * Sets the value of the instructors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityInstructor }
     *     
     */
    public void setInstructors(ArrayOfActivityInstructor value) {
        this.instructors = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityLocation }
     *     
     */
    public ArrayOfActivityLocation getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityLocation }
     *     
     */
    public void setLocations(ArrayOfActivityLocation value) {
        this.locations = value;
    }

    /**
     * Gets the value of the equipments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityEquipment }
     *     
     */
    public ArrayOfActivityEquipment getEquipments() {
        return equipments;
    }

    /**
     * Sets the value of the equipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityEquipment }
     *     
     */
    public void setEquipments(ArrayOfActivityEquipment value) {
        this.equipments = value;
    }

    /**
     * Gets the value of the tracks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityTrack }
     *     
     */
    public ArrayOfActivityTrack getTracks() {
        return tracks;
    }

    /**
     * Sets the value of the tracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityTrack }
     *     
     */
    public void setTracks(ArrayOfActivityTrack value) {
        this.tracks = value;
    }

}
