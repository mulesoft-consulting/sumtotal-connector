
package com.sumtotalsystems.sumtotal7.sumtotalws.authentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sumtotalsystems.sumtotal7.sumtotalws.authentication package. 
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

    private final static QName _String_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sumtotalsystems.sumtotal7.sumtotalws.authentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserCredentials }
     * 
     */
    public UserCredentials createUserCredentials() {
        return new UserCredentials();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link GetWorkingDomain }
     * 
     */
    public GetWorkingDomain createGetWorkingDomain() {
        return new GetWorkingDomain();
    }

    /**
     * Create an instance of {@link GetLoggedInUser }
     * 
     */
    public GetLoggedInUser createGetLoggedInUser() {
        return new GetLoggedInUser();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetLoggedInUserResponse }
     * 
     */
    public GetLoggedInUserResponse createGetLoggedInUserResponse() {
        return new GetLoggedInUserResponse();
    }

    /**
     * Create an instance of {@link GetWorkingDomainResponse }
     * 
     */
    public GetWorkingDomainResponse createGetWorkingDomainResponse() {
        return new GetWorkingDomainResponse();
    }

    /**
     * Create an instance of {@link SetWorkingDomainResponse }
     * 
     */
    public SetWorkingDomainResponse createSetWorkingDomainResponse() {
        return new SetWorkingDomainResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link SetWorkingDomain }
     * 
     */
    public SetWorkingDomain createSetWorkingDomain() {
        return new SetWorkingDomain();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
