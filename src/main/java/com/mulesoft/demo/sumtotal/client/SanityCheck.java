package com.mulesoft.demo.sumtotal.client;

import com.mulesoft.demo.sumtotal.client.auth.*;

/**
 *
 */
public class SanityCheck {

    public static void main(String [] args) throws Exception {
        UserCredentials creds = new UserCredentials();
        creds.setUsername("wstest");
        creds.setPasscode("learning");
        creds.setAccountType(UserType.WEB_SERVICE);
        creds.setAuthenticationType(UserAuthenticationType.NOT_SPECIFIED);
        Authentication auth = new Authentication();
        AuthenticationSoap soap = auth.getAuthenticationSoap12();
        soap.login(creds);
        GetLoggedInUser getLoggedInUser = new GetLoggedInUser();
        getLoggedInUser.setPopulationLevel(1);
        GetLoggedInUserResponse resp = soap.getLoggedInUser(getLoggedInUser);
        System.out.println("LAST NAME OF LOGGED IN USER: " + resp.getGetLoggedInUserResult().getLastName());
    }
}
