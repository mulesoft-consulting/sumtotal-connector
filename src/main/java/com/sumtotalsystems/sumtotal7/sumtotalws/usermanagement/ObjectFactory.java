
package com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement package. 
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

    private final static QName _ArrayOfUser_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUser");
    private final static QName _ArrayOfEvaluation_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfEvaluation");
    private final static QName _Boolean_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "boolean");
    private final static QName _ArrayOfUserRequiredSkill_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredSkill");
    private final static QName _ArrayOfDomainUser_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfDomainUser");
    private final static QName _String_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "string");
    private final static QName _ArrayOfUserRequiredActivity_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredActivity");
    private final static QName _ArrayOfUserAcquiredSkill_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserAcquiredSkill");
    private final static QName _ArrayOfUserRequiredCompetency_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", "ArrayOfUserRequiredCompetency");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRequiredSkills }
     * 
     */
    public GetRequiredSkills createGetRequiredSkills() {
        return new GetRequiredSkills();
    }

    /**
     * Create an instance of {@link CreateUserAndUpdateJobOrgResponse }
     * 
     */
    public CreateUserAndUpdateJobOrgResponse createCreateUserAndUpdateJobOrgResponse() {
        return new CreateUserAndUpdateJobOrgResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredActivity }
     * 
     */
    public ArrayOfUserRequiredActivity createArrayOfUserRequiredActivity() {
        return new ArrayOfUserRequiredActivity();
    }

    /**
     * Create an instance of {@link GetTRUsersResponse }
     * 
     */
    public GetTRUsersResponse createGetTRUsersResponse() {
        return new GetTRUsersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link RemoveRequiredActivityResponse }
     * 
     */
    public RemoveRequiredActivityResponse createRemoveRequiredActivityResponse() {
        return new RemoveRequiredActivityResponse();
    }

    /**
     * Create an instance of {@link GetUserByUserNameResponse }
     * 
     */
    public GetUserByUserNameResponse createGetUserByUserNameResponse() {
        return new GetUserByUserNameResponse();
    }

    /**
     * Create an instance of {@link RemoveAcquiredSkillResponse }
     * 
     */
    public RemoveAcquiredSkillResponse createRemoveAcquiredSkillResponse() {
        return new RemoveAcquiredSkillResponse();
    }

    /**
     * Create an instance of {@link SearchUsersByPath }
     * 
     */
    public SearchUsersByPath createSearchUsersByPath() {
        return new SearchUsersByPath();
    }

    /**
     * Create an instance of {@link RemoveRequiredActivity }
     * 
     */
    public RemoveRequiredActivity createRemoveRequiredActivity() {
        return new RemoveRequiredActivity();
    }

    /**
     * Create an instance of {@link GetPendingEvaluations }
     * 
     */
    public GetPendingEvaluations createGetPendingEvaluations() {
        return new GetPendingEvaluations();
    }

    /**
     * Create an instance of {@link RemoveRequiredCompetencyResponse }
     * 
     */
    public RemoveRequiredCompetencyResponse createRemoveRequiredCompetencyResponse() {
        return new RemoveRequiredCompetencyResponse();
    }

    /**
     * Create an instance of {@link RefreshAudienceResponse }
     * 
     */
    public RefreshAudienceResponse createRefreshAudienceResponse() {
        return new RefreshAudienceResponse();
    }

    /**
     * Create an instance of {@link GetAcquiredSkills }
     * 
     */
    public GetAcquiredSkills createGetAcquiredSkills() {
        return new GetAcquiredSkills();
    }

    /**
     * Create an instance of {@link GetRequiredCompetenciesResponse }
     * 
     */
    public GetRequiredCompetenciesResponse createGetRequiredCompetenciesResponse() {
        return new GetRequiredCompetenciesResponse();
    }

    /**
     * Create an instance of {@link IsCertificationResponse }
     * 
     */
    public IsCertificationResponse createIsCertificationResponse() {
        return new IsCertificationResponse();
    }

    /**
     * Create an instance of {@link UserAudienceRefresh }
     * 
     */
    public UserAudienceRefresh createUserAudienceRefresh() {
        return new UserAudienceRefresh();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfEvaluation }
     * 
     */
    public ArrayOfEvaluation createArrayOfEvaluation() {
        return new ArrayOfEvaluation();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredActivityResponse }
     * 
     */
    public AddUpdateRequiredActivityResponse createAddUpdateRequiredActivityResponse() {
        return new AddUpdateRequiredActivityResponse();
    }

    /**
     * Create an instance of {@link CreateEmptyUser }
     * 
     */
    public CreateEmptyUser createCreateEmptyUser() {
        return new CreateEmptyUser();
    }

    /**
     * Create an instance of {@link GetRequiredSkillsResponse }
     * 
     */
    public GetRequiredSkillsResponse createGetRequiredSkillsResponse() {
        return new GetRequiredSkillsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDomainUser }
     * 
     */
    public ArrayOfDomainUser createArrayOfDomainUser() {
        return new ArrayOfDomainUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link RemoveRequiredSkillResponse }
     * 
     */
    public RemoveRequiredSkillResponse createRemoveRequiredSkillResponse() {
        return new RemoveRequiredSkillResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUserAcquiredSkill }
     * 
     */
    public ArrayOfUserAcquiredSkill createArrayOfUserAcquiredSkill() {
        return new ArrayOfUserAcquiredSkill();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetMemberDomains }
     * 
     */
    public GetMemberDomains createGetMemberDomains() {
        return new GetMemberDomains();
    }

    /**
     * Create an instance of {@link SearchUsersByPathResponse }
     * 
     */
    public SearchUsersByPathResponse createSearchUsersByPathResponse() {
        return new SearchUsersByPathResponse();
    }

    /**
     * Create an instance of {@link UserAudienceRefreshResponse }
     * 
     */
    public UserAudienceRefreshResponse createUserAudienceRefreshResponse() {
        return new UserAudienceRefreshResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link CreateEmptyUserResponse }
     * 
     */
    public CreateEmptyUserResponse createCreateEmptyUserResponse() {
        return new CreateEmptyUserResponse();
    }

    /**
     * Create an instance of {@link GetRequiredActivitiesResponse }
     * 
     */
    public GetRequiredActivitiesResponse createGetRequiredActivitiesResponse() {
        return new GetRequiredActivitiesResponse();
    }

    /**
     * Create an instance of {@link CreateUserAndUpdateJobOrg }
     * 
     */
    public CreateUserAndUpdateJobOrg createCreateUserAndUpdateJobOrg() {
        return new CreateUserAndUpdateJobOrg();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredCompetency }
     * 
     */
    public AddUpdateRequiredCompetency createAddUpdateRequiredCompetency() {
        return new AddUpdateRequiredCompetency();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredCompetency }
     * 
     */
    public ArrayOfUserRequiredCompetency createArrayOfUserRequiredCompetency() {
        return new ArrayOfUserRequiredCompetency();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link GetTRUsers }
     * 
     */
    public GetTRUsers createGetTRUsers() {
        return new GetTRUsers();
    }

    /**
     * Create an instance of {@link AddUpdateAcquiredSkillResponse }
     * 
     */
    public AddUpdateAcquiredSkillResponse createAddUpdateAcquiredSkillResponse() {
        return new AddUpdateAcquiredSkillResponse();
    }

    /**
     * Create an instance of {@link RemoveRequiredSkill }
     * 
     */
    public RemoveRequiredSkill createRemoveRequiredSkill() {
        return new RemoveRequiredSkill();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
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
     * Create an instance of {@link AddUpdateAcquiredSkill }
     * 
     */
    public AddUpdateAcquiredSkill createAddUpdateAcquiredSkill() {
        return new AddUpdateAcquiredSkill();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetRequiredCompetencies }
     * 
     */
    public GetRequiredCompetencies createGetRequiredCompetencies() {
        return new GetRequiredCompetencies();
    }

    /**
     * Create an instance of {@link GetMemberDomainsResponse }
     * 
     */
    public GetMemberDomainsResponse createGetMemberDomainsResponse() {
        return new GetMemberDomainsResponse();
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
     * Create an instance of {@link AddUpdateRequiredCompetencyResponse }
     * 
     */
    public AddUpdateRequiredCompetencyResponse createAddUpdateRequiredCompetencyResponse() {
        return new AddUpdateRequiredCompetencyResponse();
    }

    /**
     * Create an instance of {@link AddUpdateRequiredSkill }
     * 
     */
    public AddUpdateRequiredSkill createAddUpdateRequiredSkill() {
        return new AddUpdateRequiredSkill();
    }

    /**
     * Create an instance of {@link GetUserByUserName }
     * 
     */
    public GetUserByUserName createGetUserByUserName() {
        return new GetUserByUserName();
    }

    /**
     * Create an instance of {@link GetPendingEvaluationsResponse }
     * 
     */
    public GetPendingEvaluationsResponse createGetPendingEvaluationsResponse() {
        return new GetPendingEvaluationsResponse();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link RefreshAudience }
     * 
     */
    public RefreshAudience createRefreshAudience() {
        return new RefreshAudience();
    }

    /**
     * Create an instance of {@link IsCertification }
     * 
     */
    public IsCertification createIsCertification() {
        return new IsCertification();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GetAcquiredSkillsResponse }
     * 
     */
    public GetAcquiredSkillsResponse createGetAcquiredSkillsResponse() {
        return new GetAcquiredSkillsResponse();
    }

    /**
     * Create an instance of {@link RemoveAcquiredSkill }
     * 
     */
    public RemoveAcquiredSkill createRemoveAcquiredSkill() {
        return new RemoveAcquiredSkill();
    }

    /**
     * Create an instance of {@link ArrayOfUserRequiredSkill }
     * 
     */
    public ArrayOfUserRequiredSkill createArrayOfUserRequiredSkill() {
        return new ArrayOfUserRequiredSkill();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredSkill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredSkill")
    public JAXBElement<ArrayOfUserRequiredSkill> createArrayOfUserRequiredSkill(ArrayOfUserRequiredSkill value) {
        return new JAXBElement<ArrayOfUserRequiredSkill>(_ArrayOfUserRequiredSkill_QNAME, ArrayOfUserRequiredSkill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDomainUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfDomainUser")
    public JAXBElement<ArrayOfDomainUser> createArrayOfDomainUser(ArrayOfDomainUser value) {
        return new JAXBElement<ArrayOfDomainUser>(_ArrayOfDomainUser_QNAME, ArrayOfDomainUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredActivity")
    public JAXBElement<ArrayOfUserRequiredActivity> createArrayOfUserRequiredActivity(ArrayOfUserRequiredActivity value) {
        return new JAXBElement<ArrayOfUserRequiredActivity>(_ArrayOfUserRequiredActivity_QNAME, ArrayOfUserRequiredActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserAcquiredSkill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserAcquiredSkill")
    public JAXBElement<ArrayOfUserAcquiredSkill> createArrayOfUserAcquiredSkill(ArrayOfUserAcquiredSkill value) {
        return new JAXBElement<ArrayOfUserAcquiredSkill>(_ArrayOfUserAcquiredSkill_QNAME, ArrayOfUserAcquiredSkill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserRequiredCompetency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "ArrayOfUserRequiredCompetency")
    public JAXBElement<ArrayOfUserRequiredCompetency> createArrayOfUserRequiredCompetency(ArrayOfUserRequiredCompetency value) {
        return new JAXBElement<ArrayOfUserRequiredCompetency>(_ArrayOfUserRequiredCompetency_QNAME, ArrayOfUserRequiredCompetency.class, null, value);
    }

}
