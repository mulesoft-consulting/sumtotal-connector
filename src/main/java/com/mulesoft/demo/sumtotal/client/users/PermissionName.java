
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermissionName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CanManageOwnProfile"/>
 *     &lt;enumeration value="CanExportData"/>
 *     &lt;enumeration value="CanManageKnowledgeDocs"/>
 *     &lt;enumeration value="CanViewDirectReports"/>
 *     &lt;enumeration value="CanSelectUploadShare"/>
 *     &lt;enumeration value="CanGoDirectToActivityWaitList"/>
 *     &lt;enumeration value="CanBypassBilling"/>
 *     &lt;enumeration value="CanSpecifyNoneForBillingOrg"/>
 *     &lt;enumeration value="CanRegisterAllUsers"/>
 *     &lt;enumeration value="CanManageOwnRoster"/>
 *     &lt;enumeration value="CanManageOthersRoster"/>
 *     &lt;enumeration value="CanManageRosterAsInstructor"/>
 *     &lt;enumeration value="CanApproveTrainingRequests"/>
 *     &lt;enumeration value="CanManageAgenda"/>
 *     &lt;enumeration value="CanInviteGuests"/>
 *     &lt;enumeration value="CanViewReports"/>
 *     &lt;enumeration value="CanViewObjects"/>
 *     &lt;enumeration value="CanUseAlternateJobAnalysis"/>
 *     &lt;enumeration value="CanUseAlternateOrgAnalysis"/>
 *     &lt;enumeration value="CanManageOwnSkill"/>
 *     &lt;enumeration value="CanManageOthersSkill"/>
 *     &lt;enumeration value="CanViewAssessment"/>
 *     &lt;enumeration value="CanCreateAssessment"/>
 *     &lt;enumeration value="CanCloneAssessment"/>
 *     &lt;enumeration value="CanCreateQuestion"/>
 *     &lt;enumeration value="CanBorrowQuestion"/>
 *     &lt;enumeration value="CanManageIndividualPlan"/>
 *     &lt;enumeration value="CanManageGroupPlan"/>
 *     &lt;enumeration value="CanManageOthersPlan"/>
 *     &lt;enumeration value="CanManageOwnLearning"/>
 *     &lt;enumeration value="CanManageOthersLearning"/>
 *     &lt;enumeration value="CanManageSelfReportedTraining"/>
 *     &lt;enumeration value="CanManageOthersSelfReportedTraining"/>
 *     &lt;enumeration value="CanManageVirtualSessions"/>
 *     &lt;enumeration value="CanAccessCollaborationCenter"/>
 *     &lt;enumeration value="CanAccessAuthoring"/>
 *     &lt;enumeration value="CanManageUser"/>
 *     &lt;enumeration value="CanMapUser"/>
 *     &lt;enumeration value="CanManageOrg"/>
 *     &lt;enumeration value="CanMapOrg"/>
 *     &lt;enumeration value="CanManageJob"/>
 *     &lt;enumeration value="CanMapJob"/>
 *     &lt;enumeration value="CanManageDomain"/>
 *     &lt;enumeration value="CanMapDomain"/>
 *     &lt;enumeration value="CanManageAudience"/>
 *     &lt;enumeration value="CanMapAudience"/>
 *     &lt;enumeration value="CanManageSkill"/>
 *     &lt;enumeration value="CanMapSkill"/>
 *     &lt;enumeration value="CanManageActivity"/>
 *     &lt;enumeration value="CanMapActivity"/>
 *     &lt;enumeration value="CanManageEvaluations"/>
 *     &lt;enumeration value="CanMapEvaluations"/>
 *     &lt;enumeration value="CanManageInstructors"/>
 *     &lt;enumeration value="CanUseDesigner"/>
 *     &lt;enumeration value="CanManageTaxonomy"/>
 *     &lt;enumeration value="CanOrganizeTaxonomyItems"/>
 *     &lt;enumeration value="CanManageCollaborationCenter"/>
 *     &lt;enumeration value="CanConfigureSystem"/>
 *     &lt;enumeration value="CanManageSupplementalData"/>
 *     &lt;enumeration value="CanManageResource"/>
 *     &lt;enumeration value="CanMapResource"/>
 *     &lt;enumeration value="CanManagePurchaseOrder"/>
 *     &lt;enumeration value="CanMapPurchaseOrder"/>
 *     &lt;enumeration value="CanManageNotificationTemplates"/>
 *     &lt;enumeration value="CanManageReports"/>
 *     &lt;enumeration value="CanManageRemoteServer"/>
 *     &lt;enumeration value="CanMapRemoteServer"/>
 *     &lt;enumeration value="CanManageMetaData"/>
 *     &lt;enumeration value="CanManageLEDef"/>
 *     &lt;enumeration value="CanManageLEDefOpt"/>
 *     &lt;enumeration value="CanMapLEDef"/>
 *     &lt;enumeration value="CanManageEvent"/>
 *     &lt;enumeration value="CanGoDirectToLEDefWaitList"/>
 *     &lt;enumeration value="CanGoDirectToClassWaitList"/>
 *     &lt;enumeration value="CanUseIM"/>
 *     &lt;enumeration value="CanManageUserOpt"/>
 *     &lt;enumeration value="CanManageUserSecurity"/>
 *     &lt;enumeration value="CanManageOrgOpt"/>
 *     &lt;enumeration value="CanManageJobOpt"/>
 *     &lt;enumeration value="CanManageSkillOpt"/>
 *     &lt;enumeration value="CanPublishLEDef"/>
 *     &lt;enumeration value="CanManageActivityOpt"/>
 *     &lt;enumeration value="CanManageAudienceOpt"/>
 *     &lt;enumeration value="CanViewAudienceUsers"/>
 *     &lt;enumeration value="CanManageTrack"/>
 *     &lt;enumeration value="CanManageActivityCharges"/>
 *     &lt;enumeration value="CanManageNotifications"/>
 *     &lt;enumeration value="CanEditMetadata"/>
 *     &lt;enumeration value="CanUploadMetadataDefinitions"/>
 *     &lt;enumeration value="CanChooseVirtualDirectoryForPublishing"/>
 *     &lt;enumeration value="CanAddExpertsToCollaborationCenter"/>
 *     &lt;enumeration value="CanManageOthersProfile"/>
 *     &lt;enumeration value="CanManageTrainingRequests"/>
 *     &lt;enumeration value="CanMapTrack"/>
 *     &lt;enumeration value="CanPublishKnowledgeDocs"/>
 *     &lt;enumeration value="CanUseQualifiedEmployeeFinder"/>
 *     &lt;enumeration value="CanViewCollaborationCenter"/>
 *     &lt;enumeration value="MustPayForEcommerce"/>
 *     &lt;enumeration value="CanAccessReporting"/>
 *     &lt;enumeration value="CanUseSearchPath"/>
 *     &lt;enumeration value="CanManageQuestionBank"/>
 *     &lt;enumeration value="CanAttachFilesInCollaborationCenter"/>
 *     &lt;enumeration value="CanManageAccounts"/>
 *     &lt;enumeration value="CanManageAssignments"/>
 *     &lt;enumeration value="CanManageContinuingEducation"/>
 *     &lt;enumeration value="CanManageOthersAcquiredSkill"/>
 *     &lt;enumeration value="CanManageOthersRequiredSkill"/>
 *     &lt;enumeration value="CanManageOwnAcquiredSkill"/>
 *     &lt;enumeration value="CanManageOwnRequiredSkill"/>
 *     &lt;enumeration value="CanManagePerformance"/>
 *     &lt;enumeration value="CanManageVersions"/>
 *     &lt;enumeration value="CanMapAccounts"/>
 *     &lt;enumeration value="CanReviewContent"/>
 *     &lt;enumeration value="CanSignOnBehalfOfManager"/>
 *     &lt;enumeration value="CanUseOfflineContent"/>
 *     &lt;enumeration value="CanViewAdminAuditReports"/>
 *     &lt;enumeration value="CanViewManagerSignatureReports"/>
 *     &lt;enumeration value="CanViewOthersInvoice"/>
 *     &lt;enumeration value="CanViewOthersNotificationEmails"/>
 *     &lt;enumeration value="CanViewOwnInvoice"/>
 *     &lt;enumeration value="CanManageOwnPreferences"/>
 *     &lt;enumeration value="CanManageActiveActivity"/>
 *     &lt;enumeration value="CanManageInActiveActivity"/>
 *     &lt;enumeration value="NotSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissionName")
@XmlEnum
public enum PermissionName {

    @XmlEnumValue("CanManageOwnProfile")
    CAN_MANAGE_OWN_PROFILE("CanManageOwnProfile"),
    @XmlEnumValue("CanExportData")
    CAN_EXPORT_DATA("CanExportData"),
    @XmlEnumValue("CanManageKnowledgeDocs")
    CAN_MANAGE_KNOWLEDGE_DOCS("CanManageKnowledgeDocs"),
    @XmlEnumValue("CanViewDirectReports")
    CAN_VIEW_DIRECT_REPORTS("CanViewDirectReports"),
    @XmlEnumValue("CanSelectUploadShare")
    CAN_SELECT_UPLOAD_SHARE("CanSelectUploadShare"),
    @XmlEnumValue("CanGoDirectToActivityWaitList")
    CAN_GO_DIRECT_TO_ACTIVITY_WAIT_LIST("CanGoDirectToActivityWaitList"),
    @XmlEnumValue("CanBypassBilling")
    CAN_BYPASS_BILLING("CanBypassBilling"),
    @XmlEnumValue("CanSpecifyNoneForBillingOrg")
    CAN_SPECIFY_NONE_FOR_BILLING_ORG("CanSpecifyNoneForBillingOrg"),
    @XmlEnumValue("CanRegisterAllUsers")
    CAN_REGISTER_ALL_USERS("CanRegisterAllUsers"),
    @XmlEnumValue("CanManageOwnRoster")
    CAN_MANAGE_OWN_ROSTER("CanManageOwnRoster"),
    @XmlEnumValue("CanManageOthersRoster")
    CAN_MANAGE_OTHERS_ROSTER("CanManageOthersRoster"),
    @XmlEnumValue("CanManageRosterAsInstructor")
    CAN_MANAGE_ROSTER_AS_INSTRUCTOR("CanManageRosterAsInstructor"),
    @XmlEnumValue("CanApproveTrainingRequests")
    CAN_APPROVE_TRAINING_REQUESTS("CanApproveTrainingRequests"),
    @XmlEnumValue("CanManageAgenda")
    CAN_MANAGE_AGENDA("CanManageAgenda"),
    @XmlEnumValue("CanInviteGuests")
    CAN_INVITE_GUESTS("CanInviteGuests"),
    @XmlEnumValue("CanViewReports")
    CAN_VIEW_REPORTS("CanViewReports"),
    @XmlEnumValue("CanViewObjects")
    CAN_VIEW_OBJECTS("CanViewObjects"),
    @XmlEnumValue("CanUseAlternateJobAnalysis")
    CAN_USE_ALTERNATE_JOB_ANALYSIS("CanUseAlternateJobAnalysis"),
    @XmlEnumValue("CanUseAlternateOrgAnalysis")
    CAN_USE_ALTERNATE_ORG_ANALYSIS("CanUseAlternateOrgAnalysis"),
    @XmlEnumValue("CanManageOwnSkill")
    CAN_MANAGE_OWN_SKILL("CanManageOwnSkill"),
    @XmlEnumValue("CanManageOthersSkill")
    CAN_MANAGE_OTHERS_SKILL("CanManageOthersSkill"),
    @XmlEnumValue("CanViewAssessment")
    CAN_VIEW_ASSESSMENT("CanViewAssessment"),
    @XmlEnumValue("CanCreateAssessment")
    CAN_CREATE_ASSESSMENT("CanCreateAssessment"),
    @XmlEnumValue("CanCloneAssessment")
    CAN_CLONE_ASSESSMENT("CanCloneAssessment"),
    @XmlEnumValue("CanCreateQuestion")
    CAN_CREATE_QUESTION("CanCreateQuestion"),
    @XmlEnumValue("CanBorrowQuestion")
    CAN_BORROW_QUESTION("CanBorrowQuestion"),
    @XmlEnumValue("CanManageIndividualPlan")
    CAN_MANAGE_INDIVIDUAL_PLAN("CanManageIndividualPlan"),
    @XmlEnumValue("CanManageGroupPlan")
    CAN_MANAGE_GROUP_PLAN("CanManageGroupPlan"),
    @XmlEnumValue("CanManageOthersPlan")
    CAN_MANAGE_OTHERS_PLAN("CanManageOthersPlan"),
    @XmlEnumValue("CanManageOwnLearning")
    CAN_MANAGE_OWN_LEARNING("CanManageOwnLearning"),
    @XmlEnumValue("CanManageOthersLearning")
    CAN_MANAGE_OTHERS_LEARNING("CanManageOthersLearning"),
    @XmlEnumValue("CanManageSelfReportedTraining")
    CAN_MANAGE_SELF_REPORTED_TRAINING("CanManageSelfReportedTraining"),
    @XmlEnumValue("CanManageOthersSelfReportedTraining")
    CAN_MANAGE_OTHERS_SELF_REPORTED_TRAINING("CanManageOthersSelfReportedTraining"),
    @XmlEnumValue("CanManageVirtualSessions")
    CAN_MANAGE_VIRTUAL_SESSIONS("CanManageVirtualSessions"),
    @XmlEnumValue("CanAccessCollaborationCenter")
    CAN_ACCESS_COLLABORATION_CENTER("CanAccessCollaborationCenter"),
    @XmlEnumValue("CanAccessAuthoring")
    CAN_ACCESS_AUTHORING("CanAccessAuthoring"),
    @XmlEnumValue("CanManageUser")
    CAN_MANAGE_USER("CanManageUser"),
    @XmlEnumValue("CanMapUser")
    CAN_MAP_USER("CanMapUser"),
    @XmlEnumValue("CanManageOrg")
    CAN_MANAGE_ORG("CanManageOrg"),
    @XmlEnumValue("CanMapOrg")
    CAN_MAP_ORG("CanMapOrg"),
    @XmlEnumValue("CanManageJob")
    CAN_MANAGE_JOB("CanManageJob"),
    @XmlEnumValue("CanMapJob")
    CAN_MAP_JOB("CanMapJob"),
    @XmlEnumValue("CanManageDomain")
    CAN_MANAGE_DOMAIN("CanManageDomain"),
    @XmlEnumValue("CanMapDomain")
    CAN_MAP_DOMAIN("CanMapDomain"),
    @XmlEnumValue("CanManageAudience")
    CAN_MANAGE_AUDIENCE("CanManageAudience"),
    @XmlEnumValue("CanMapAudience")
    CAN_MAP_AUDIENCE("CanMapAudience"),
    @XmlEnumValue("CanManageSkill")
    CAN_MANAGE_SKILL("CanManageSkill"),
    @XmlEnumValue("CanMapSkill")
    CAN_MAP_SKILL("CanMapSkill"),
    @XmlEnumValue("CanManageActivity")
    CAN_MANAGE_ACTIVITY("CanManageActivity"),
    @XmlEnumValue("CanMapActivity")
    CAN_MAP_ACTIVITY("CanMapActivity"),
    @XmlEnumValue("CanManageEvaluations")
    CAN_MANAGE_EVALUATIONS("CanManageEvaluations"),
    @XmlEnumValue("CanMapEvaluations")
    CAN_MAP_EVALUATIONS("CanMapEvaluations"),
    @XmlEnumValue("CanManageInstructors")
    CAN_MANAGE_INSTRUCTORS("CanManageInstructors"),
    @XmlEnumValue("CanUseDesigner")
    CAN_USE_DESIGNER("CanUseDesigner"),
    @XmlEnumValue("CanManageTaxonomy")
    CAN_MANAGE_TAXONOMY("CanManageTaxonomy"),
    @XmlEnumValue("CanOrganizeTaxonomyItems")
    CAN_ORGANIZE_TAXONOMY_ITEMS("CanOrganizeTaxonomyItems"),
    @XmlEnumValue("CanManageCollaborationCenter")
    CAN_MANAGE_COLLABORATION_CENTER("CanManageCollaborationCenter"),
    @XmlEnumValue("CanConfigureSystem")
    CAN_CONFIGURE_SYSTEM("CanConfigureSystem"),
    @XmlEnumValue("CanManageSupplementalData")
    CAN_MANAGE_SUPPLEMENTAL_DATA("CanManageSupplementalData"),
    @XmlEnumValue("CanManageResource")
    CAN_MANAGE_RESOURCE("CanManageResource"),
    @XmlEnumValue("CanMapResource")
    CAN_MAP_RESOURCE("CanMapResource"),
    @XmlEnumValue("CanManagePurchaseOrder")
    CAN_MANAGE_PURCHASE_ORDER("CanManagePurchaseOrder"),
    @XmlEnumValue("CanMapPurchaseOrder")
    CAN_MAP_PURCHASE_ORDER("CanMapPurchaseOrder"),
    @XmlEnumValue("CanManageNotificationTemplates")
    CAN_MANAGE_NOTIFICATION_TEMPLATES("CanManageNotificationTemplates"),
    @XmlEnumValue("CanManageReports")
    CAN_MANAGE_REPORTS("CanManageReports"),
    @XmlEnumValue("CanManageRemoteServer")
    CAN_MANAGE_REMOTE_SERVER("CanManageRemoteServer"),
    @XmlEnumValue("CanMapRemoteServer")
    CAN_MAP_REMOTE_SERVER("CanMapRemoteServer"),
    @XmlEnumValue("CanManageMetaData")
    CAN_MANAGE_META_DATA("CanManageMetaData"),
    @XmlEnumValue("CanManageLEDef")
    CAN_MANAGE_LE_DEF("CanManageLEDef"),
    @XmlEnumValue("CanManageLEDefOpt")
    CAN_MANAGE_LE_DEF_OPT("CanManageLEDefOpt"),
    @XmlEnumValue("CanMapLEDef")
    CAN_MAP_LE_DEF("CanMapLEDef"),
    @XmlEnumValue("CanManageEvent")
    CAN_MANAGE_EVENT("CanManageEvent"),
    @XmlEnumValue("CanGoDirectToLEDefWaitList")
    CAN_GO_DIRECT_TO_LE_DEF_WAIT_LIST("CanGoDirectToLEDefWaitList"),
    @XmlEnumValue("CanGoDirectToClassWaitList")
    CAN_GO_DIRECT_TO_CLASS_WAIT_LIST("CanGoDirectToClassWaitList"),
    @XmlEnumValue("CanUseIM")
    CAN_USE_IM("CanUseIM"),
    @XmlEnumValue("CanManageUserOpt")
    CAN_MANAGE_USER_OPT("CanManageUserOpt"),
    @XmlEnumValue("CanManageUserSecurity")
    CAN_MANAGE_USER_SECURITY("CanManageUserSecurity"),
    @XmlEnumValue("CanManageOrgOpt")
    CAN_MANAGE_ORG_OPT("CanManageOrgOpt"),
    @XmlEnumValue("CanManageJobOpt")
    CAN_MANAGE_JOB_OPT("CanManageJobOpt"),
    @XmlEnumValue("CanManageSkillOpt")
    CAN_MANAGE_SKILL_OPT("CanManageSkillOpt"),
    @XmlEnumValue("CanPublishLEDef")
    CAN_PUBLISH_LE_DEF("CanPublishLEDef"),
    @XmlEnumValue("CanManageActivityOpt")
    CAN_MANAGE_ACTIVITY_OPT("CanManageActivityOpt"),
    @XmlEnumValue("CanManageAudienceOpt")
    CAN_MANAGE_AUDIENCE_OPT("CanManageAudienceOpt"),
    @XmlEnumValue("CanViewAudienceUsers")
    CAN_VIEW_AUDIENCE_USERS("CanViewAudienceUsers"),
    @XmlEnumValue("CanManageTrack")
    CAN_MANAGE_TRACK("CanManageTrack"),
    @XmlEnumValue("CanManageActivityCharges")
    CAN_MANAGE_ACTIVITY_CHARGES("CanManageActivityCharges"),
    @XmlEnumValue("CanManageNotifications")
    CAN_MANAGE_NOTIFICATIONS("CanManageNotifications"),
    @XmlEnumValue("CanEditMetadata")
    CAN_EDIT_METADATA("CanEditMetadata"),
    @XmlEnumValue("CanUploadMetadataDefinitions")
    CAN_UPLOAD_METADATA_DEFINITIONS("CanUploadMetadataDefinitions"),
    @XmlEnumValue("CanChooseVirtualDirectoryForPublishing")
    CAN_CHOOSE_VIRTUAL_DIRECTORY_FOR_PUBLISHING("CanChooseVirtualDirectoryForPublishing"),
    @XmlEnumValue("CanAddExpertsToCollaborationCenter")
    CAN_ADD_EXPERTS_TO_COLLABORATION_CENTER("CanAddExpertsToCollaborationCenter"),
    @XmlEnumValue("CanManageOthersProfile")
    CAN_MANAGE_OTHERS_PROFILE("CanManageOthersProfile"),
    @XmlEnumValue("CanManageTrainingRequests")
    CAN_MANAGE_TRAINING_REQUESTS("CanManageTrainingRequests"),
    @XmlEnumValue("CanMapTrack")
    CAN_MAP_TRACK("CanMapTrack"),
    @XmlEnumValue("CanPublishKnowledgeDocs")
    CAN_PUBLISH_KNOWLEDGE_DOCS("CanPublishKnowledgeDocs"),
    @XmlEnumValue("CanUseQualifiedEmployeeFinder")
    CAN_USE_QUALIFIED_EMPLOYEE_FINDER("CanUseQualifiedEmployeeFinder"),
    @XmlEnumValue("CanViewCollaborationCenter")
    CAN_VIEW_COLLABORATION_CENTER("CanViewCollaborationCenter"),
    @XmlEnumValue("MustPayForEcommerce")
    MUST_PAY_FOR_ECOMMERCE("MustPayForEcommerce"),
    @XmlEnumValue("CanAccessReporting")
    CAN_ACCESS_REPORTING("CanAccessReporting"),
    @XmlEnumValue("CanUseSearchPath")
    CAN_USE_SEARCH_PATH("CanUseSearchPath"),
    @XmlEnumValue("CanManageQuestionBank")
    CAN_MANAGE_QUESTION_BANK("CanManageQuestionBank"),
    @XmlEnumValue("CanAttachFilesInCollaborationCenter")
    CAN_ATTACH_FILES_IN_COLLABORATION_CENTER("CanAttachFilesInCollaborationCenter"),
    @XmlEnumValue("CanManageAccounts")
    CAN_MANAGE_ACCOUNTS("CanManageAccounts"),
    @XmlEnumValue("CanManageAssignments")
    CAN_MANAGE_ASSIGNMENTS("CanManageAssignments"),
    @XmlEnumValue("CanManageContinuingEducation")
    CAN_MANAGE_CONTINUING_EDUCATION("CanManageContinuingEducation"),
    @XmlEnumValue("CanManageOthersAcquiredSkill")
    CAN_MANAGE_OTHERS_ACQUIRED_SKILL("CanManageOthersAcquiredSkill"),
    @XmlEnumValue("CanManageOthersRequiredSkill")
    CAN_MANAGE_OTHERS_REQUIRED_SKILL("CanManageOthersRequiredSkill"),
    @XmlEnumValue("CanManageOwnAcquiredSkill")
    CAN_MANAGE_OWN_ACQUIRED_SKILL("CanManageOwnAcquiredSkill"),
    @XmlEnumValue("CanManageOwnRequiredSkill")
    CAN_MANAGE_OWN_REQUIRED_SKILL("CanManageOwnRequiredSkill"),
    @XmlEnumValue("CanManagePerformance")
    CAN_MANAGE_PERFORMANCE("CanManagePerformance"),
    @XmlEnumValue("CanManageVersions")
    CAN_MANAGE_VERSIONS("CanManageVersions"),
    @XmlEnumValue("CanMapAccounts")
    CAN_MAP_ACCOUNTS("CanMapAccounts"),
    @XmlEnumValue("CanReviewContent")
    CAN_REVIEW_CONTENT("CanReviewContent"),
    @XmlEnumValue("CanSignOnBehalfOfManager")
    CAN_SIGN_ON_BEHALF_OF_MANAGER("CanSignOnBehalfOfManager"),
    @XmlEnumValue("CanUseOfflineContent")
    CAN_USE_OFFLINE_CONTENT("CanUseOfflineContent"),
    @XmlEnumValue("CanViewAdminAuditReports")
    CAN_VIEW_ADMIN_AUDIT_REPORTS("CanViewAdminAuditReports"),
    @XmlEnumValue("CanViewManagerSignatureReports")
    CAN_VIEW_MANAGER_SIGNATURE_REPORTS("CanViewManagerSignatureReports"),
    @XmlEnumValue("CanViewOthersInvoice")
    CAN_VIEW_OTHERS_INVOICE("CanViewOthersInvoice"),
    @XmlEnumValue("CanViewOthersNotificationEmails")
    CAN_VIEW_OTHERS_NOTIFICATION_EMAILS("CanViewOthersNotificationEmails"),
    @XmlEnumValue("CanViewOwnInvoice")
    CAN_VIEW_OWN_INVOICE("CanViewOwnInvoice"),
    @XmlEnumValue("CanManageOwnPreferences")
    CAN_MANAGE_OWN_PREFERENCES("CanManageOwnPreferences"),
    @XmlEnumValue("CanManageActiveActivity")
    CAN_MANAGE_ACTIVE_ACTIVITY("CanManageActiveActivity"),
    @XmlEnumValue("CanManageInActiveActivity")
    CAN_MANAGE_IN_ACTIVE_ACTIVITY("CanManageInActiveActivity"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified");
    private final String value;

    PermissionName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionName fromValue(String v) {
        for (PermissionName c: PermissionName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
