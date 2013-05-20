
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.demo.sumtotal.client.users package. 
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

    private final static QName _UpdateUserResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "UpdateUserResult");
    private final static QName _DeleteUserResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "DeleteUserResult");
    private final static QName _ArrayOfUser_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUser");
    private final static QName _ArrayOfEvaluation_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfEvaluation");
    private final static QName _UserSecurityContext_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", "UserSecurityContext");
    private final static QName _Boolean_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "boolean");
    private final static QName _ArrayOfUserRequiredSkill_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredSkill");
    private final static QName _CreateUserAndUpdateJobOrgResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "CreateUserAndUpdateJobOrgResult");
    private final static QName _ArrayOfDomainUser_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfDomainUser");
    private final static QName _String_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "string");
    private final static QName _Usr_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "usr");
    private final static QName _ArrayOfUserRequiredActivity_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredActivity");
    private final static QName _GetUserByUserNameResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "GetUserByUserNameResult");
    private final static QName _User_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "User");
    private final static QName _CreateUserResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "CreateUserResult");
    private final static QName _GetUserByIdResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "GetUserByIdResult");
    private final static QName _CreateEmptyUserResult_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", "CreateEmptyUserResult");
    private final static QName _ArrayOfUserRequiredCompetency_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredCompetency");
    private final static QName _ArrayOfUserAcquiredSkill_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserAcquiredSkill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.demo.sumtotal.client.users
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
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
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
     * Create an instance of {@link RemoveAcquiredSkill }
     * 
     */
    public RemoveAcquiredSkill createRemoveAcquiredSkill() {
        return new RemoveAcquiredSkill();
    }

    /**
     * Create an instance of {@link CreateUserAndUpdateJobOrg }
     * 
     */
    public CreateUserAndUpdateJobOrg createCreateUserAndUpdateJobOrg() {
        return new CreateUserAndUpdateJobOrg();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetRequiredSkillsResponse }
     * 
     */
    public GetRequiredSkillsResponse createGetRequiredSkillsResponse() {
        return new GetRequiredSkillsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredSkill2 }
     * 
     */
    public ArrayOfUserRequiredSkill2 createArrayOfUserRequiredSkill2() {
        return new ArrayOfUserRequiredSkill2();
    }

    /**
     * Create an instance of {@link IsCertificationResponse }
     * 
     */
    public IsCertificationResponse createIsCertificationResponse() {
        return new IsCertificationResponse();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredActivity }
     * 
     */
    public AddUpdateRequiredActivity createAddUpdateRequiredActivity() {
        return new AddUpdateRequiredActivity();
    }

    /**
     * Create an instance of {@link RemoveRequiredCompetency }
     * 
     */
    public RemoveRequiredCompetency createRemoveRequiredCompetency() {
        return new RemoveRequiredCompetency();
    }

    /**
     * Create an instance of {@link GetUserByUserNameResponse }
     * 
     */
    public GetUserByUserNameResponse createGetUserByUserNameResponse() {
        return new GetUserByUserNameResponse();
    }

    /**
     * Create an instance of {@link UserAudienceRefreshResponse }
     * 
     */
    public UserAudienceRefreshResponse createUserAudienceRefreshResponse() {
        return new UserAudienceRefreshResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredActivity2 }
     * 
     */
    public ArrayOfUserRequiredActivity2 createArrayOfUserRequiredActivity2() {
        return new ArrayOfUserRequiredActivity2();
    }

    /**
     * Create an instance of {@link GetPendingEvaluations }
     * 
     */
    public GetPendingEvaluations createGetPendingEvaluations() {
        return new GetPendingEvaluations();
    }

    /**
     * Create an instance of {@link GetRequiredActivitiesResponse }
     * 
     */
    public GetRequiredActivitiesResponse createGetRequiredActivitiesResponse() {
        return new GetRequiredActivitiesResponse();
    }

    /**
     * Create an instance of {@link SearchUsersByPathResponse }
     * 
     */
    public SearchUsersByPathResponse createSearchUsersByPathResponse() {
        return new SearchUsersByPathResponse();
    }

    /**
     * Create an instance of {@link RemoveRequiredSkillResponse }
     * 
     */
    public RemoveRequiredSkillResponse createRemoveRequiredSkillResponse() {
        return new RemoveRequiredSkillResponse();
    }

    /**
     * Create an instance of {@link GetAcquiredSkillsResponse }
     * 
     */
    public GetAcquiredSkillsResponse createGetAcquiredSkillsResponse() {
        return new GetAcquiredSkillsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserAcquiredSkill2 }
     * 
     */
    public ArrayOfUserAcquiredSkill2 createArrayOfUserAcquiredSkill2() {
        return new ArrayOfUserAcquiredSkill2();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link AddUpdateAcquiredSkill }
     * 
     */
    public AddUpdateAcquiredSkill createAddUpdateAcquiredSkill() {
        return new AddUpdateAcquiredSkill();
    }

    /**
     * Create an instance of {@link GetRequiredCompetenciesResponse }
     * 
     */
    public GetRequiredCompetenciesResponse createGetRequiredCompetenciesResponse() {
        return new GetRequiredCompetenciesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredCompetency2 }
     * 
     */
    public ArrayOfUserRequiredCompetency2 createArrayOfUserRequiredCompetency2() {
        return new ArrayOfUserRequiredCompetency2();
    }

    /**
     * Create an instance of {@link CreateEmptyUserResponse }
     * 
     */
    public CreateEmptyUserResponse createCreateEmptyUserResponse() {
        return new CreateEmptyUserResponse();
    }

    /**
     * Create an instance of {@link GetMemberDomainsResponse }
     * 
     */
    public GetMemberDomainsResponse createGetMemberDomainsResponse() {
        return new GetMemberDomainsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDomainUser2 }
     * 
     */
    public ArrayOfDomainUser2 createArrayOfDomainUser2() {
        return new ArrayOfDomainUser2();
    }

    /**
     * Create an instance of {@link RefreshAudience }
     * 
     */
    public RefreshAudience createRefreshAudience() {
        return new RefreshAudience();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredCompetencyResponse }
     * 
     */
    public AddUpdateRequiredCompetencyResponse createAddUpdateRequiredCompetencyResponse() {
        return new AddUpdateRequiredCompetencyResponse();
    }

    /**
     * Create an instance of {@link AddUpdateAcquiredSkillResponse }
     * 
     */
    public AddUpdateAcquiredSkillResponse createAddUpdateAcquiredSkillResponse() {
        return new AddUpdateAcquiredSkillResponse();
    }

    /**
     * Create an instance of {@link RefreshAudienceResponse }
     * 
     */
    public RefreshAudienceResponse createRefreshAudienceResponse() {
        return new RefreshAudienceResponse();
    }

    /**
     * Create an instance of {@link GetUserByUserName }
     * 
     */
    public GetUserByUserName createGetUserByUserName() {
        return new GetUserByUserName();
    }

    /**
     * Create an instance of {@link RemoveRequiredSkill }
     * 
     */
    public RemoveRequiredSkill createRemoveRequiredSkill() {
        return new RemoveRequiredSkill();
    }

    /**
     * Create an instance of {@link GetRequiredCompetencies }
     * 
     */
    public GetRequiredCompetencies createGetRequiredCompetencies() {
        return new GetRequiredCompetencies();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetMemberDomains }
     * 
     */
    public GetMemberDomains createGetMemberDomains() {
        return new GetMemberDomains();
    }

    /**
     * Create an instance of {@link CreateEmptyUser }
     * 
     */
    public CreateEmptyUser createCreateEmptyUser() {
        return new CreateEmptyUser();
    }

    /**
     * Create an instance of {@link GetTRUsers }
     * 
     */
    public GetTRUsers createGetTRUsers() {
        return new GetTRUsers();
    }

    /**
     * Create an instance of {@link GetTRUsersResponse }
     * 
     */
    public GetTRUsersResponse createGetTRUsersResponse() {
        return new GetTRUsersResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link RemoveRequiredActivityResponse }
     * 
     */
    public RemoveRequiredActivityResponse createRemoveRequiredActivityResponse() {
        return new RemoveRequiredActivityResponse();
    }

    /**
     * Create an instance of {@link RemoveRequiredCompetencyResponse }
     * 
     */
    public RemoveRequiredCompetencyResponse createRemoveRequiredCompetencyResponse() {
        return new RemoveRequiredCompetencyResponse();
    }

    /**
     * Create an instance of {@link CreateUserAndUpdateJobOrgResponse }
     * 
     */
    public CreateUserAndUpdateJobOrgResponse createCreateUserAndUpdateJobOrgResponse() {
        return new CreateUserAndUpdateJobOrgResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredSkill }
     * 
     */
    public AddUpdateRequiredSkill createAddUpdateRequiredSkill() {
        return new AddUpdateRequiredSkill();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link SearchUsersByPath }
     * 
     */
    public SearchUsersByPath createSearchUsersByPath() {
        return new SearchUsersByPath();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredActivityResponse }
     * 
     */
    public AddUpdateRequiredActivityResponse createAddUpdateRequiredActivityResponse() {
        return new AddUpdateRequiredActivityResponse();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredCompetency }
     * 
     */
    public AddUpdateRequiredCompetency createAddUpdateRequiredCompetency() {
        return new AddUpdateRequiredCompetency();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link RemoveAcquiredSkillResponse }
     * 
     */
    public RemoveAcquiredSkillResponse createRemoveAcquiredSkillResponse() {
        return new RemoveAcquiredSkillResponse();
    }

    /**
     * Create an instance of {@link GetAcquiredSkills }
     * 
     */
    public GetAcquiredSkills createGetAcquiredSkills() {
        return new GetAcquiredSkills();
    }

    /**
     * Create an instance of {@link RemoveRequiredActivity }
     * 
     */
    public RemoveRequiredActivity createRemoveRequiredActivity() {
        return new RemoveRequiredActivity();
    }

    /**
     * Create an instance of {@link UserAudienceRefresh }
     * 
     */
    public UserAudienceRefresh createUserAudienceRefresh() {
        return new UserAudienceRefresh();
    }

    /**
     * Create an instance of {@link GetRequiredSkills }
     * 
     */
    public GetRequiredSkills createGetRequiredSkills() {
        return new GetRequiredSkills();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredSkillResponse }
     * 
     */
    public AddUpdateRequiredSkillResponse createAddUpdateRequiredSkillResponse() {
        return new AddUpdateRequiredSkillResponse();
    }

    /**
     * Create an instance of {@link GetRequiredActivities }
     * 
     */
    public GetRequiredActivities createGetRequiredActivities() {
        return new GetRequiredActivities();
    }

    /**
     * Create an instance of {@link GetPendingEvaluationsResponse }
     * 
     */
    public GetPendingEvaluationsResponse createGetPendingEvaluationsResponse() {
        return new GetPendingEvaluationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEvaluation }
     * 
     */
    public ArrayOfEvaluation createArrayOfEvaluation() {
        return new ArrayOfEvaluation();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link IsCertification }
     * 
     */
    public IsCertification createIsCertification() {
        return new IsCertification();
    }

    /**
     * Create an instance of {@link UserSecurityContext }
     * 
     */
    public UserSecurityContext createUserSecurityContext() {
        return new UserSecurityContext();
    }

    /**
     * Create an instance of {@link AspenContextIdentity }
     * 
     */
    public AspenContextIdentity createAspenContextIdentity() {
        return new AspenContextIdentity();
    }

    /**
     * Create an instance of {@link UserToken }
     * 
     */
    public UserToken createUserToken() {
        return new UserToken();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "UpdateUserResult")
    public JAXBElement<User> createUpdateUserResult(User value) {
        return new JAXBElement<User>(_UpdateUserResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "DeleteUserResult")
    public JAXBElement<User> createDeleteUserResult(User value) {
        return new JAXBElement<User>(_DeleteUserResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfEvaluation")
    public JAXBElement<ArrayOfEvaluation> createArrayOfEvaluation(ArrayOfEvaluation value) {
        return new JAXBElement<ArrayOfEvaluation>(_ArrayOfEvaluation_QNAME, ArrayOfEvaluation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredSkill2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredSkill")
    public JAXBElement<ArrayOfUserRequiredSkill2> createArrayOfUserRequiredSkill(ArrayOfUserRequiredSkill2 value) {
        return new JAXBElement<ArrayOfUserRequiredSkill2>(_ArrayOfUserRequiredSkill_QNAME, ArrayOfUserRequiredSkill2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "CreateUserAndUpdateJobOrgResult")
    public JAXBElement<User> createCreateUserAndUpdateJobOrgResult(User value) {
        return new JAXBElement<User>(_CreateUserAndUpdateJobOrgResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfDomainUser")
    public JAXBElement<ArrayOfDomainUser2> createArrayOfDomainUser(ArrayOfDomainUser2 value) {
        return new JAXBElement<ArrayOfDomainUser2>(_ArrayOfDomainUser_QNAME, ArrayOfDomainUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "usr")
    public JAXBElement<User> createUsr(User value) {
        return new JAXBElement<User>(_Usr_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredActivity2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredActivity")
    public JAXBElement<ArrayOfUserRequiredActivity2> createArrayOfUserRequiredActivity(ArrayOfUserRequiredActivity2 value) {
        return new JAXBElement<ArrayOfUserRequiredActivity2>(_ArrayOfUserRequiredActivity_QNAME, ArrayOfUserRequiredActivity2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "GetUserByUserNameResult")
    public JAXBElement<User> createGetUserByUserNameResult(User value) {
        return new JAXBElement<User>(_GetUserByUserNameResult_QNAME, User.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "CreateUserResult")
    public JAXBElement<User> createCreateUserResult(User value) {
        return new JAXBElement<User>(_CreateUserResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "GetUserByIdResult")
    public JAXBElement<User> createGetUserByIdResult(User value) {
        return new JAXBElement<User>(_GetUserByIdResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/", name = "CreateEmptyUserResult")
    public JAXBElement<User> createCreateEmptyUserResult(User value) {
        return new JAXBElement<User>(_CreateEmptyUserResult_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredCompetency2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredCompetency")
    public JAXBElement<ArrayOfUserRequiredCompetency2> createArrayOfUserRequiredCompetency(ArrayOfUserRequiredCompetency2 value) {
        return new JAXBElement<ArrayOfUserRequiredCompetency2>(_ArrayOfUserRequiredCompetency_QNAME, ArrayOfUserRequiredCompetency2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserAcquiredSkill2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserAcquiredSkill")
    public JAXBElement<ArrayOfUserAcquiredSkill2> createArrayOfUserAcquiredSkill(ArrayOfUserAcquiredSkill2 value) {
        return new JAXBElement<ArrayOfUserAcquiredSkill2>(_ArrayOfUserAcquiredSkill_QNAME, ArrayOfUserAcquiredSkill2 .class, null, value);
    }

}
