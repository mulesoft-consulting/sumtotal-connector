
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.demo.sumtotal.client.auth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _User_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "User");
    private final static QName _UserSecurityContext_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", "UserSecurityContext");
    private final static QName _GetLoggedInUserResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "GetLoggedInUserResult");
    private final static QName _String_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", "string");
    private final static QName _UserToken_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", "UserToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.demo.sumtotal.client.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationUser }
     * 
     */
    public ArrayOfOrganizationUser createArrayOfOrganizationUser() {
        return new ArrayOfOrganizationUser();
    }

    /**
     * Create an instance of {@link ArrayOfActivityInstructor }
     * 
     */
    public ArrayOfActivityInstructor createArrayOfActivityInstructor() {
        return new ArrayOfActivityInstructor();
    }

    /**
     * Create an instance of {@link Skill }
     * 
     */
    public Skill createSkill() {
        return new Skill();
    }

    /**
     * Create an instance of {@link ActivitySystemMetadata }
     * 
     */
    public ActivitySystemMetadata createActivitySystemMetadata() {
        return new ActivitySystemMetadata();
    }

    /**
     * Create an instance of {@link ActivityAttempt }
     * 
     */
    public ActivityAttempt createActivityAttempt() {
        return new ActivityAttempt();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link Domain }
     * 
     */
    public Domain createDomain() {
        return new Domain();
    }

    /**
     * Create an instance of {@link TotalRegulationCategory }
     * 
     */
    public TotalRegulationCategory createTotalRegulationCategory() {
        return new TotalRegulationCategory();
    }

    /**
     * Create an instance of {@link TotalRegulationOrg }
     * 
     */
    public TotalRegulationOrg createTotalRegulationOrg() {
        return new TotalRegulationOrg();
    }

    /**
     * Create an instance of {@link ActivityRegistration }
     * 
     */
    public ActivityRegistration createActivityRegistration() {
        return new ActivityRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfDomain }
     * 
     */
    public ArrayOfDomain createArrayOfDomain() {
        return new ArrayOfDomain();
    }

    /**
     * Create an instance of {@link SecurityRole }
     * 
     */
    public SecurityRole createSecurityRole() {
        return new SecurityRole();
    }

    /**
     * Create an instance of {@link CompetencySharedDomain }
     * 
     */
    public CompetencySharedDomain createCompetencySharedDomain() {
        return new CompetencySharedDomain();
    }

    /**
     * Create an instance of {@link NullableBoolean }
     * 
     */
    public NullableBoolean createNullableBoolean() {
        return new NullableBoolean();
    }

    /**
     * Create an instance of {@link ActivitySharedDomain }
     * 
     */
    public ActivitySharedDomain createActivitySharedDomain() {
        return new ActivitySharedDomain();
    }

    /**
     * Create an instance of {@link ActivityLocation }
     * 
     */
    public ActivityLocation createActivityLocation() {
        return new ActivityLocation();
    }

    /**
     * Create an instance of {@link HierarchyType }
     * 
     */
    public HierarchyType createHierarchyType() {
        return new HierarchyType();
    }

    /**
     * Create an instance of {@link NullableInt32 }
     * 
     */
    public NullableInt32 createNullableInt32() {
        return new NullableInt32();
    }

    /**
     * Create an instance of {@link LEMtd }
     * 
     */
    public LEMtd createLEMtd() {
        return new LEMtd();
    }

    /**
     * Create an instance of {@link ArrayOfActivityRegistration }
     * 
     */
    public ArrayOfActivityRegistration createArrayOfActivityRegistration() {
        return new ArrayOfActivityRegistration();
    }

    /**
     * Create an instance of {@link ArrayOfActivityAttempt }
     * 
     */
    public ArrayOfActivityAttempt createArrayOfActivityAttempt() {
        return new ArrayOfActivityAttempt();
    }

    /**
     * Create an instance of {@link ActivityMetadata }
     * 
     */
    public ActivityMetadata createActivityMetadata() {
        return new ActivityMetadata();
    }

    /**
     * Create an instance of {@link Competency }
     * 
     */
    public Competency createCompetency() {
        return new Competency();
    }

    /**
     * Create an instance of {@link Facility }
     * 
     */
    public Facility createFacility() {
        return new Facility();
    }

    /**
     * Create an instance of {@link ArrayOfDomainUser }
     * 
     */
    public ArrayOfDomainUser createArrayOfDomainUser() {
        return new ArrayOfDomainUser();
    }

    /**
     * Create an instance of {@link ArrayOfJobUser }
     * 
     */
    public ArrayOfJobUser createArrayOfJobUser() {
        return new ArrayOfJobUser();
    }

    /**
     * Create an instance of {@link ProficiencyValue }
     * 
     */
    public ProficiencyValue createProficiencyValue() {
        return new ProficiencyValue();
    }

    /**
     * Create an instance of {@link ArrayOfCompetencyRequiredSkill }
     * 
     */
    public ArrayOfCompetencyRequiredSkill createArrayOfCompetencyRequiredSkill() {
        return new ArrayOfCompetencyRequiredSkill();
    }

    /**
     * Create an instance of {@link JobRequiredActivity }
     * 
     */
    public JobRequiredActivity createJobRequiredActivity() {
        return new JobRequiredActivity();
    }

    /**
     * Create an instance of {@link UserRequiredSkill }
     * 
     */
    public UserRequiredSkill createUserRequiredSkill() {
        return new UserRequiredSkill();
    }

    /**
     * Create an instance of {@link ActivityTrack }
     * 
     */
    public ActivityTrack createActivityTrack() {
        return new ActivityTrack();
    }

    /**
     * Create an instance of {@link OrganizationRequiredCompetency }
     * 
     */
    public OrganizationRequiredCompetency createOrganizationRequiredCompetency() {
        return new OrganizationRequiredCompetency();
    }

    /**
     * Create an instance of {@link NullableDateTime }
     * 
     */
    public NullableDateTime createNullableDateTime() {
        return new NullableDateTime();
    }

    /**
     * Create an instance of {@link NullableDecimal }
     * 
     */
    public NullableDecimal createNullableDecimal() {
        return new NullableDecimal();
    }

    /**
     * Create an instance of {@link UserAcquiredSkill }
     * 
     */
    public UserAcquiredSkill createUserAcquiredSkill() {
        return new UserAcquiredSkill();
    }

    /**
     * Create an instance of {@link ArrayOfJobRequiredCompetency }
     * 
     */
    public ArrayOfJobRequiredCompetency createArrayOfJobRequiredCompetency() {
        return new ArrayOfJobRequiredCompetency();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationRequiredSkill }
     * 
     */
    public ArrayOfOrganizationRequiredSkill createArrayOfOrganizationRequiredSkill() {
        return new ArrayOfOrganizationRequiredSkill();
    }

    /**
     * Create an instance of {@link UserRequiredActivity }
     * 
     */
    public UserRequiredActivity createUserRequiredActivity() {
        return new UserRequiredActivity();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link CompetencyRequiredSkill }
     * 
     */
    public CompetencyRequiredSkill createCompetencyRequiredSkill() {
        return new CompetencyRequiredSkill();
    }

    /**
     * Create an instance of {@link DomainUser }
     * 
     */
    public DomainUser createDomainUser() {
        return new DomainUser();
    }

    /**
     * Create an instance of {@link UserRequiredCompetency }
     * 
     */
    public UserRequiredCompetency createUserRequiredCompetency() {
        return new UserRequiredCompetency();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredActivity }
     * 
     */
    public ArrayOfUserRequiredActivity createArrayOfUserRequiredActivity() {
        return new ArrayOfUserRequiredActivity();
    }

    /**
     * Create an instance of {@link OrganizationRequiredActivity }
     * 
     */
    public OrganizationRequiredActivity createOrganizationRequiredActivity() {
        return new OrganizationRequiredActivity();
    }

    /**
     * Create an instance of {@link ArrayOfJobRequiredActivity }
     * 
     */
    public ArrayOfJobRequiredActivity createArrayOfJobRequiredActivity() {
        return new ArrayOfJobRequiredActivity();
    }

    /**
     * Create an instance of {@link OrganizationRequiredSkill }
     * 
     */
    public OrganizationRequiredSkill createOrganizationRequiredSkill() {
        return new OrganizationRequiredSkill();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ArrayOfActivitySharedDomain }
     * 
     */
    public ArrayOfActivitySharedDomain createArrayOfActivitySharedDomain() {
        return new ArrayOfActivitySharedDomain();
    }

    /**
     * Create an instance of {@link ArrayOfUserAcquiredCertification }
     * 
     */
    public ArrayOfUserAcquiredCertification createArrayOfUserAcquiredCertification() {
        return new ArrayOfUserAcquiredCertification();
    }

    /**
     * Create an instance of {@link JobRequiredSkill }
     * 
     */
    public JobRequiredSkill createJobRequiredSkill() {
        return new JobRequiredSkill();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link UserLanguage }
     * 
     */
    public UserLanguage createUserLanguage() {
        return new UserLanguage();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link UserCode }
     * 
     */
    public UserCode createUserCode() {
        return new UserCode();
    }

    /**
     * Create an instance of {@link NullableDouble }
     * 
     */
    public NullableDouble createNullableDouble() {
        return new NullableDouble();
    }

    /**
     * Create an instance of {@link ArrayOfJobRequiredSkill }
     * 
     */
    public ArrayOfJobRequiredSkill createArrayOfJobRequiredSkill() {
        return new ArrayOfJobRequiredSkill();
    }

    /**
     * Create an instance of {@link JobSharedDomain }
     * 
     */
    public JobSharedDomain createJobSharedDomain() {
        return new JobSharedDomain();
    }

    /**
     * Create an instance of {@link ArrayOfActivityLocation }
     * 
     */
    public ArrayOfActivityLocation createArrayOfActivityLocation() {
        return new ArrayOfActivityLocation();
    }

    /**
     * Create an instance of {@link TRDIFSettings }
     * 
     */
    public TRDIFSettings createTRDIFSettings() {
        return new TRDIFSettings();
    }

    /**
     * Create an instance of {@link ArrayOfJobSharedDomain }
     * 
     */
    public ArrayOfJobSharedDomain createArrayOfJobSharedDomain() {
        return new ArrayOfJobSharedDomain();
    }

    /**
     * Create an instance of {@link ArrayOfSkillSharedDomain }
     * 
     */
    public ArrayOfSkillSharedDomain createArrayOfSkillSharedDomain() {
        return new ArrayOfSkillSharedDomain();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredCompetency }
     * 
     */
    public ArrayOfUserRequiredCompetency createArrayOfUserRequiredCompetency() {
        return new ArrayOfUserRequiredCompetency();
    }

    /**
     * Create an instance of {@link ArrayOfCompetencySharedDomain }
     * 
     */
    public ArrayOfCompetencySharedDomain createArrayOfCompetencySharedDomain() {
        return new ArrayOfCompetencySharedDomain();
    }

    /**
     * Create an instance of {@link Priority }
     * 
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link ActivityEquipment }
     * 
     */
    public ActivityEquipment createActivityEquipment() {
        return new ActivityEquipment();
    }

    /**
     * Create an instance of {@link UserAcquiredCertification }
     * 
     */
    public UserAcquiredCertification createUserAcquiredCertification() {
        return new UserAcquiredCertification();
    }

    /**
     * Create an instance of {@link ProficiencyScale }
     * 
     */
    public ProficiencyScale createProficiencyScale() {
        return new ProficiencyScale();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link SkillSharedDomain }
     * 
     */
    public SkillSharedDomain createSkillSharedDomain() {
        return new SkillSharedDomain();
    }

    /**
     * Create an instance of {@link OrganizationUser }
     * 
     */
    public OrganizationUser createOrganizationUser() {
        return new OrganizationUser();
    }

    /**
     * Create an instance of {@link ActivityDuration }
     * 
     */
    public ActivityDuration createActivityDuration() {
        return new ActivityDuration();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredSkill }
     * 
     */
    public ArrayOfUserRequiredSkill createArrayOfUserRequiredSkill() {
        return new ArrayOfUserRequiredSkill();
    }

    /**
     * Create an instance of {@link ArrayOfActivityTrack }
     * 
     */
    public ArrayOfActivityTrack createArrayOfActivityTrack() {
        return new ArrayOfActivityTrack();
    }

    /**
     * Create an instance of {@link JobUser }
     * 
     */
    public JobUser createJobUser() {
        return new JobUser();
    }

    /**
     * Create an instance of {@link EquipmentType }
     * 
     */
    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    /**
     * Create an instance of {@link UserStatus }
     * 
     */
    public UserStatus createUserStatus() {
        return new UserStatus();
    }

    /**
     * Create an instance of {@link ActivityOffering }
     * 
     */
    public ActivityOffering createActivityOffering() {
        return new ActivityOffering();
    }

    /**
     * Create an instance of {@link ArrayOfUserAcquiredSkill }
     * 
     */
    public ArrayOfUserAcquiredSkill createArrayOfUserAcquiredSkill() {
        return new ArrayOfUserAcquiredSkill();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationRequiredCompetency }
     * 
     */
    public ArrayOfOrganizationRequiredCompetency createArrayOfOrganizationRequiredCompetency() {
        return new ArrayOfOrganizationRequiredCompetency();
    }

    /**
     * Create an instance of {@link ActivityLabel }
     * 
     */
    public ActivityLabel createActivityLabel() {
        return new ActivityLabel();
    }

    /**
     * Create an instance of {@link TimeZone }
     * 
     */
    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    /**
     * Create an instance of {@link ActivityAllocation }
     * 
     */
    public ActivityAllocation createActivityAllocation() {
        return new ActivityAllocation();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link ArrayOfActivityEquipment }
     * 
     */
    public ArrayOfActivityEquipment createArrayOfActivityEquipment() {
        return new ArrayOfActivityEquipment();
    }

    /**
     * Create an instance of {@link ActivityInstructor }
     * 
     */
    public ActivityInstructor createActivityInstructor() {
        return new ActivityInstructor();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ArrayOfOrganizationRequiredActivity }
     * 
     */
    public ArrayOfOrganizationRequiredActivity createArrayOfOrganizationRequiredActivity() {
        return new ArrayOfOrganizationRequiredActivity();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link JobRequiredCompetency }
     * 
     */
    public JobRequiredCompetency createJobRequiredCompetency() {
        return new JobRequiredCompetency();
    }

    /**
     * Create an instance of {@link UserSecurityContext }
     * 
     */
    public UserSecurityContext createUserSecurityContext() {
        return new UserSecurityContext();
    }

    /**
     * Create an instance of {@link UserToken }
     * 
     */
    public UserToken createUserToken() {
        return new UserToken();
    }

    /**
     * Create an instance of {@link AspenContextIdentity }
     * 
     */
    public AspenContextIdentity createAspenContextIdentity() {
        return new AspenContextIdentity();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link UserCredentials }
     * 
     */
    public UserCredentials createUserCredentials() {
        return new UserCredentials();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link GetWorkingDomainResponse }
     * 
     */
    public GetWorkingDomainResponse createGetWorkingDomainResponse() {
        return new GetWorkingDomainResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SetWorkingDomain }
     * 
     */
    public SetWorkingDomain createSetWorkingDomain() {
        return new SetWorkingDomain();
    }

    /**
     * Create an instance of {@link GetWorkingDomain }
     * 
     */
    public GetWorkingDomain createGetWorkingDomain() {
        return new GetWorkingDomain();
    }

    /**
     * Create an instance of {@link GetLoggedInUserResponse }
     * 
     */
    public GetLoggedInUserResponse createGetLoggedInUserResponse() {
        return new GetLoggedInUserResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetLoggedInUser }
     * 
     */
    public GetLoggedInUser createGetLoggedInUser() {
        return new GetLoggedInUser();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link SetWorkingDomainResponse }
     * 
     */
    public SetWorkingDomainResponse createSetWorkingDomainResponse() {
        return new SetWorkingDomainResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSecurityContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", name = "UserSecurityContext")
    public JAXBElement<UserSecurityContext> createUserSecurityContext(UserSecurityContext value) {
        return new JAXBElement<UserSecurityContext>(_UserSecurityContext_QNAME, UserSecurityContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "GetLoggedInUserResult")
    public JAXBElement<User> createGetLoggedInUserResult(User value) {
        return new JAXBElement<User>(_GetLoggedInUserResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", name = "UserToken")
    public JAXBElement<UserToken> createUserToken(UserToken value) {
        return new JAXBElement<UserToken>(_UserToken_QNAME, UserToken.class, null, value);
    }

}
