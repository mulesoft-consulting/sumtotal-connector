
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNamePronounciation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNamePronounciation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NtAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="EndDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="LastReviewDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserCode" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserCode" minOccurs="0"/>
 *         &lt;element name="UserStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserStatus" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserStatus" minOccurs="0"/>
 *         &lt;element name="PassportPUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="DefaultApproverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultApprover" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="ApproverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Approver" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}User" minOccurs="0"/>
 *         &lt;element name="RequiresConfirmation" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="DomainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityRole" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}SecurityRole" minOccurs="0"/>
 *         &lt;element name="AutoPublishCalender" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanViewAllUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsActive" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="IsLoginEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasWebServiceAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInstructor" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableBoolean"/>
 *         &lt;element name="MustChangePassword" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="LanguagePreferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagePreference" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserLanguage" minOccurs="0"/>
 *         &lt;element name="CurrencyPreferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyPreference" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Currency" minOccurs="0"/>
 *         &lt;element name="TimeZonePreferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZonePreference" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}TimeZone" minOccurs="0"/>
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailFormat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TalentManagementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ActivityAttempts" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityAttempt"/>
 *         &lt;element name="ActivityRegistrations" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfActivityRegistration"/>
 *         &lt;element name="AcquiredSkills" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfUserAcquiredSkill"/>
 *         &lt;element name="RequiredActivities" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfUserRequiredActivity"/>
 *         &lt;element name="RequiredSkills" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfUserRequiredSkill"/>
 *         &lt;element name="RequiredCompetencies" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfUserRequiredCompetency"/>
 *         &lt;element name="MemberDomains" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfDomainUser"/>
 *         &lt;element name="AcquiredCertifications" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfUserAcquiredCertification"/>
 *         &lt;element name="MemberJobs" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfJobUser"/>
 *         &lt;element name="MemberOrganizations" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfOrganizationUser"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPropertyBase", propOrder = {
    "id",
    "firstName",
    "lastName",
    "firstNamePronounciation",
    "lastNamePronounciation",
    "middleName",
    "nameTitle",
    "nameSuffix",
    "jobTitle",
    "userNumber",
    "username",
    "password",
    "ntAccount",
    "startDate",
    "endDate",
    "lastReviewDate",
    "note",
    "companyCode",
    "userCodeId",
    "userCode",
    "userStatusId",
    "userStatus",
    "passportPUID",
    "managerId",
    "manager",
    "defaultApproverId",
    "defaultApprover",
    "approverId",
    "approver",
    "requiresConfirmation",
    "domainId",
    "domain",
    "domainCode",
    "securityRoleId",
    "securityRole",
    "autoPublishCalender",
    "canViewAllUsers",
    "isActive",
    "isLoginEnabled",
    "isInternal",
    "hasWebServiceAccess",
    "isInstructor",
    "mustChangePassword",
    "languagePreferenceId",
    "languagePreference",
    "currencyPreferenceId",
    "currencyPreference",
    "timeZonePreferenceId",
    "timeZonePreference",
    "addressCity",
    "addressCountry",
    "addressFax",
    "addressPhone1",
    "addressPhone2",
    "addressState",
    "addressStreet1",
    "addressStreet2",
    "addressPostalCode",
    "email",
    "emailFormat",
    "url",
    "talentManagementID",
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
    "activityAttempts",
    "activityRegistrations",
    "acquiredSkills",
    "requiredActivities",
    "requiredSkills",
    "requiredCompetencies",
    "memberDomains",
    "acquiredCertifications",
    "memberJobs",
    "memberOrganizations"
})
@XmlSeeAlso({
    UserCore.class
})
public abstract class UserPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstNamePronounciation")
    protected String firstNamePronounciation;
    @XmlElement(name = "LastNamePronounciation")
    protected String lastNamePronounciation;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "NameTitle")
    protected String nameTitle;
    @XmlElement(name = "NameSuffix")
    protected String nameSuffix;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "UserNumber")
    protected String userNumber;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "NtAccount")
    protected String ntAccount;
    @XmlElement(name = "StartDate", required = true)
    protected NullableDateTime startDate;
    @XmlElement(name = "EndDate", required = true)
    protected NullableDateTime endDate;
    @XmlElement(name = "LastReviewDate", required = true)
    protected NullableDateTime lastReviewDate;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "UserCodeId")
    protected String userCodeId;
    @XmlElement(name = "UserCode")
    protected UserCode userCode;
    @XmlElement(name = "UserStatusId")
    protected String userStatusId;
    @XmlElement(name = "UserStatus")
    protected UserStatus userStatus;
    @XmlElement(name = "PassportPUID")
    protected String passportPUID;
    @XmlElement(name = "ManagerId")
    protected String managerId;
    @XmlElement(name = "Manager")
    protected User manager;
    @XmlElement(name = "DefaultApproverId")
    protected String defaultApproverId;
    @XmlElement(name = "DefaultApprover")
    protected User defaultApprover;
    @XmlElement(name = "ApproverId")
    protected String approverId;
    @XmlElement(name = "Approver")
    protected User approver;
    @XmlElement(name = "RequiresConfirmation", required = true)
    protected NullableInt32 requiresConfirmation;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "DomainCode")
    protected String domainCode;
    @XmlElement(name = "SecurityRoleId")
    protected String securityRoleId;
    @XmlElement(name = "SecurityRole")
    protected SecurityRole securityRole;
    @XmlElement(name = "AutoPublishCalender")
    protected boolean autoPublishCalender;
    @XmlElement(name = "CanViewAllUsers")
    protected boolean canViewAllUsers;
    @XmlElement(name = "IsActive", required = true)
    protected NullableInt32 isActive;
    @XmlElement(name = "IsLoginEnabled")
    protected boolean isLoginEnabled;
    @XmlElement(name = "IsInternal")
    protected boolean isInternal;
    @XmlElement(name = "HasWebServiceAccess")
    protected boolean hasWebServiceAccess;
    @XmlElement(name = "IsInstructor", required = true)
    protected NullableBoolean isInstructor;
    @XmlElement(name = "MustChangePassword", required = true)
    protected NullableInt32 mustChangePassword;
    @XmlElement(name = "LanguagePreferenceId")
    protected String languagePreferenceId;
    @XmlElement(name = "LanguagePreference")
    protected UserLanguage languagePreference;
    @XmlElement(name = "CurrencyPreferenceId")
    protected String currencyPreferenceId;
    @XmlElement(name = "CurrencyPreference")
    protected Currency currencyPreference;
    @XmlElement(name = "TimeZonePreferenceId")
    protected String timeZonePreferenceId;
    @XmlElement(name = "TimeZonePreference")
    protected TimeZone timeZonePreference;
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
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "EmailFormat")
    protected int emailFormat;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "TalentManagementID")
    protected String talentManagementID;
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
    @XmlElement(name = "ActivityAttempts", required = true, nillable = true)
    protected ArrayOfActivityAttempt activityAttempts;
    @XmlElement(name = "ActivityRegistrations", required = true, nillable = true)
    protected ArrayOfActivityRegistration activityRegistrations;
    @XmlElement(name = "AcquiredSkills", required = true, nillable = true)
    protected ArrayOfUserAcquiredSkill acquiredSkills;
    @XmlElement(name = "RequiredActivities", required = true, nillable = true)
    protected ArrayOfUserRequiredActivity requiredActivities;
    @XmlElement(name = "RequiredSkills", required = true, nillable = true)
    protected ArrayOfUserRequiredSkill requiredSkills;
    @XmlElement(name = "RequiredCompetencies", required = true, nillable = true)
    protected ArrayOfUserRequiredCompetency requiredCompetencies;
    @XmlElement(name = "MemberDomains", required = true, nillable = true)
    protected ArrayOfDomainUser memberDomains;
    @XmlElement(name = "AcquiredCertifications", required = true, nillable = true)
    protected ArrayOfUserAcquiredCertification acquiredCertifications;
    @XmlElement(name = "MemberJobs", required = true, nillable = true)
    protected ArrayOfJobUser memberJobs;
    @XmlElement(name = "MemberOrganizations", required = true, nillable = true)
    protected ArrayOfOrganizationUser memberOrganizations;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstNamePronounciation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNamePronounciation() {
        return firstNamePronounciation;
    }

    /**
     * Sets the value of the firstNamePronounciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNamePronounciation(String value) {
        this.firstNamePronounciation = value;
    }

    /**
     * Gets the value of the lastNamePronounciation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNamePronounciation() {
        return lastNamePronounciation;
    }

    /**
     * Sets the value of the lastNamePronounciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNamePronounciation(String value) {
        this.lastNamePronounciation = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSuffix(String value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the userNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Sets the value of the userNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNumber(String value) {
        this.userNumber = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the ntAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtAccount() {
        return ntAccount;
    }

    /**
     * Sets the value of the ntAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtAccount(String value) {
        this.ntAccount = value;
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
     * Gets the value of the lastReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getLastReviewDate() {
        return lastReviewDate;
    }

    /**
     * Sets the value of the lastReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setLastReviewDate(NullableDateTime value) {
        this.lastReviewDate = value;
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
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the userCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCodeId() {
        return userCodeId;
    }

    /**
     * Sets the value of the userCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCodeId(String value) {
        this.userCodeId = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link UserCode }
     *     
     */
    public UserCode getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCode }
     *     
     */
    public void setUserCode(UserCode value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the userStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatusId() {
        return userStatusId;
    }

    /**
     * Sets the value of the userStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatusId(String value) {
        this.userStatusId = value;
    }

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatus }
     *     
     */
    public UserStatus getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatus }
     *     
     */
    public void setUserStatus(UserStatus value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the passportPUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportPUID() {
        return passportPUID;
    }

    /**
     * Sets the value of the passportPUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportPUID(String value) {
        this.passportPUID = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerId(String value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setManager(User value) {
        this.manager = value;
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
     * Gets the value of the requiresConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getRequiresConfirmation() {
        return requiresConfirmation;
    }

    /**
     * Sets the value of the requiresConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setRequiresConfirmation(NullableInt32 value) {
        this.requiresConfirmation = value;
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
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the securityRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityRoleId() {
        return securityRoleId;
    }

    /**
     * Sets the value of the securityRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityRoleId(String value) {
        this.securityRoleId = value;
    }

    /**
     * Gets the value of the securityRole property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityRole }
     *     
     */
    public SecurityRole getSecurityRole() {
        return securityRole;
    }

    /**
     * Sets the value of the securityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityRole }
     *     
     */
    public void setSecurityRole(SecurityRole value) {
        this.securityRole = value;
    }

    /**
     * Gets the value of the autoPublishCalender property.
     * 
     */
    public boolean isAutoPublishCalender() {
        return autoPublishCalender;
    }

    /**
     * Sets the value of the autoPublishCalender property.
     * 
     */
    public void setAutoPublishCalender(boolean value) {
        this.autoPublishCalender = value;
    }

    /**
     * Gets the value of the canViewAllUsers property.
     * 
     */
    public boolean isCanViewAllUsers() {
        return canViewAllUsers;
    }

    /**
     * Sets the value of the canViewAllUsers property.
     * 
     */
    public void setCanViewAllUsers(boolean value) {
        this.canViewAllUsers = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setIsActive(NullableInt32 value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isLoginEnabled property.
     * 
     */
    public boolean isIsLoginEnabled() {
        return isLoginEnabled;
    }

    /**
     * Sets the value of the isLoginEnabled property.
     * 
     */
    public void setIsLoginEnabled(boolean value) {
        this.isLoginEnabled = value;
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
     * Gets the value of the hasWebServiceAccess property.
     * 
     */
    public boolean isHasWebServiceAccess() {
        return hasWebServiceAccess;
    }

    /**
     * Sets the value of the hasWebServiceAccess property.
     * 
     */
    public void setHasWebServiceAccess(boolean value) {
        this.hasWebServiceAccess = value;
    }

    /**
     * Gets the value of the isInstructor property.
     * 
     * @return
     *     possible object is
     *     {@link NullableBoolean }
     *     
     */
    public NullableBoolean getIsInstructor() {
        return isInstructor;
    }

    /**
     * Sets the value of the isInstructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableBoolean }
     *     
     */
    public void setIsInstructor(NullableBoolean value) {
        this.isInstructor = value;
    }

    /**
     * Gets the value of the mustChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getMustChangePassword() {
        return mustChangePassword;
    }

    /**
     * Sets the value of the mustChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setMustChangePassword(NullableInt32 value) {
        this.mustChangePassword = value;
    }

    /**
     * Gets the value of the languagePreferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagePreferenceId() {
        return languagePreferenceId;
    }

    /**
     * Sets the value of the languagePreferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagePreferenceId(String value) {
        this.languagePreferenceId = value;
    }

    /**
     * Gets the value of the languagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link UserLanguage }
     *     
     */
    public UserLanguage getLanguagePreference() {
        return languagePreference;
    }

    /**
     * Sets the value of the languagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLanguage }
     *     
     */
    public void setLanguagePreference(UserLanguage value) {
        this.languagePreference = value;
    }

    /**
     * Gets the value of the currencyPreferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyPreferenceId() {
        return currencyPreferenceId;
    }

    /**
     * Sets the value of the currencyPreferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyPreferenceId(String value) {
        this.currencyPreferenceId = value;
    }

    /**
     * Gets the value of the currencyPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrencyPreference() {
        return currencyPreference;
    }

    /**
     * Sets the value of the currencyPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrencyPreference(Currency value) {
        this.currencyPreference = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailFormat property.
     * 
     */
    public int getEmailFormat() {
        return emailFormat;
    }

    /**
     * Sets the value of the emailFormat property.
     * 
     */
    public void setEmailFormat(int value) {
        this.emailFormat = value;
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
     * Gets the value of the talentManagementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTalentManagementID() {
        return talentManagementID;
    }

    /**
     * Sets the value of the talentManagementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTalentManagementID(String value) {
        this.talentManagementID = value;
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
     * Gets the value of the activityAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityAttempt }
     *     
     */
    public ArrayOfActivityAttempt getActivityAttempts() {
        return activityAttempts;
    }

    /**
     * Sets the value of the activityAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityAttempt }
     *     
     */
    public void setActivityAttempts(ArrayOfActivityAttempt value) {
        this.activityAttempts = value;
    }

    /**
     * Gets the value of the activityRegistrations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivityRegistration }
     *     
     */
    public ArrayOfActivityRegistration getActivityRegistrations() {
        return activityRegistrations;
    }

    /**
     * Sets the value of the activityRegistrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivityRegistration }
     *     
     */
    public void setActivityRegistrations(ArrayOfActivityRegistration value) {
        this.activityRegistrations = value;
    }

    /**
     * Gets the value of the acquiredSkills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserAcquiredSkill }
     *     
     */
    public ArrayOfUserAcquiredSkill getAcquiredSkills() {
        return acquiredSkills;
    }

    /**
     * Sets the value of the acquiredSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserAcquiredSkill }
     *     
     */
    public void setAcquiredSkills(ArrayOfUserAcquiredSkill value) {
        this.acquiredSkills = value;
    }

    /**
     * Gets the value of the requiredActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredActivity }
     *     
     */
    public ArrayOfUserRequiredActivity getRequiredActivities() {
        return requiredActivities;
    }

    /**
     * Sets the value of the requiredActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredActivity }
     *     
     */
    public void setRequiredActivities(ArrayOfUserRequiredActivity value) {
        this.requiredActivities = value;
    }

    /**
     * Gets the value of the requiredSkills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredSkill }
     *     
     */
    public ArrayOfUserRequiredSkill getRequiredSkills() {
        return requiredSkills;
    }

    /**
     * Sets the value of the requiredSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredSkill }
     *     
     */
    public void setRequiredSkills(ArrayOfUserRequiredSkill value) {
        this.requiredSkills = value;
    }

    /**
     * Gets the value of the requiredCompetencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserRequiredCompetency }
     *     
     */
    public ArrayOfUserRequiredCompetency getRequiredCompetencies() {
        return requiredCompetencies;
    }

    /**
     * Sets the value of the requiredCompetencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserRequiredCompetency }
     *     
     */
    public void setRequiredCompetencies(ArrayOfUserRequiredCompetency value) {
        this.requiredCompetencies = value;
    }

    /**
     * Gets the value of the memberDomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomainUser }
     *     
     */
    public ArrayOfDomainUser getMemberDomains() {
        return memberDomains;
    }

    /**
     * Sets the value of the memberDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomainUser }
     *     
     */
    public void setMemberDomains(ArrayOfDomainUser value) {
        this.memberDomains = value;
    }

    /**
     * Gets the value of the acquiredCertifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserAcquiredCertification }
     *     
     */
    public ArrayOfUserAcquiredCertification getAcquiredCertifications() {
        return acquiredCertifications;
    }

    /**
     * Sets the value of the acquiredCertifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserAcquiredCertification }
     *     
     */
    public void setAcquiredCertifications(ArrayOfUserAcquiredCertification value) {
        this.acquiredCertifications = value;
    }

    /**
     * Gets the value of the memberJobs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfJobUser }
     *     
     */
    public ArrayOfJobUser getMemberJobs() {
        return memberJobs;
    }

    /**
     * Sets the value of the memberJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfJobUser }
     *     
     */
    public void setMemberJobs(ArrayOfJobUser value) {
        this.memberJobs = value;
    }

    /**
     * Gets the value of the memberOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrganizationUser }
     *     
     */
    public ArrayOfOrganizationUser getMemberOrganizations() {
        return memberOrganizations;
    }

    /**
     * Sets the value of the memberOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrganizationUser }
     *     
     */
    public void setMemberOrganizations(ArrayOfOrganizationUser value) {
        this.memberOrganizations = value;
    }

}
