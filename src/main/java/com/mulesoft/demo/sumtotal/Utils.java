package com.mulesoft.demo.sumtotal;

import com.sumtotalsystems.sumtotal7.sumtotalbo.User;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserSecurityContext;
import com.sumtotalsystems.sumtotal7.sumtotalws.UserToken;
import com.sumtotalsystems.sumtotal7.sumtotalws.authentication.*;
import com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement.UserManagement;
import com.sumtotalsystems.sumtotal7.sumtotalws.usermanagement.UserManagementSoap;
;

import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;

/**
 *
 */
public class Utils {
    static final AuthenticationSoap authSoapClient = new Authentication().getAuthenticationSoap();
    static final UserManagementSoap usersSoapClient = new UserManagement().getUserManagementSoap();
    static final String USER = "wstest";
    static final String PASS = "learning";
    static final String DOMAIN_ID = "3";
    static final int POPULATION = 1;

    public static void main(String [] args) throws Exception {
        UserToken token = doAuth(USER, PASS);
        System.out.println("Token is " + token.getValue());
        User authUser = getUser(USER, token);
        System.out.println("Logged in User's sec role id is " + authUser.getSecurityRoleId());
        String newUserName = "MuleSoft_" + new Object().hashCode();
        User createdUser = doCreateUser(newUserName, authUser, token);
        System.out.println("New User is " + createdUser.getUsername());
        endSession(token);

        //brief test to make sure this fails when logged out
        try {
            getUser(USER, token);
        } catch (SOAPFaultException sfe) {
            System.out.println("User token successfully invalidated");
            //sfe.printStackTrace();
            return;
        }
        System.out.println("If this line is reached an invalidated token has been used successfully - that's not a good thing");

    }

    static UserSecurityContext getUserSecurityContext(UserToken userToken) {
        UserSecurityContext securityContext = new UserSecurityContext();
        securityContext.setToken(userToken);
        return securityContext;
    }

    /**
     * RefUser is a an existing User object whose values we can copy (eg, TZ preference) as they are painful to lookup
     * manually.
     */
    static User doCreateUser(String userName, User refUser, UserToken userToken) {
        User user = new User();
        user.setUsername(userName);
        user.setFirstName("Test");
        user.setLastName("User");
        user.setIsLoginEnabled(true);
        user.setPassword("learning");
        user.setDomainId("3");
        user.setSecurityRoleId(refUser.getSecurityRoleId());
        user.setLanguagePreferenceId(refUser.getLanguagePreferenceId());
        user.setTimeZonePreferenceId(refUser.getTimeZonePreferenceId());
        User created = usersSoapClient.createUser(user, getUserSecurityContext(userToken));
        return created;
    }

    static User getUser(String userName, UserToken token) {
        UserManagementSoap soapClient = new UserManagement().getUserManagementSoap();
        return soapClient.getUserByUserName(DOMAIN_ID, userName, POPULATION, getUserSecurityContext(token));
    }

    static UserToken doAuth(String username, String password) {
        UserCredentials credentials = new UserCredentials();
        credentials.setUsername(username);
        credentials.setPasscode(password);
        credentials.setAuthenticationType(UserAuthenticationType.NOT_SPECIFIED);
        credentials.setAccountType(UserType.NOT_SPECIFIED);
        Holder<UserToken> holder = new Holder<UserToken>(new UserToken());
        authSoapClient.login(credentials, holder);
        return holder.value;
    }

    static void endSession(UserToken token) {
        authSoapClient.logout(getUserSecurityContext(token));
    }
}
