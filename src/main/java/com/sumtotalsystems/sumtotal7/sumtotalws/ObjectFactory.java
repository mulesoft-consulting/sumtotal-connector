
package com.sumtotalsystems.sumtotal7.sumtotalws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sumtotalsystems.sumtotal7.sumtotalws package. 
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

    private final static QName _UserSecurityContext_QNAME = new QName("http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", "UserSecurityContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sumtotalsystems.sumtotal7.sumtotalws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AspenContextIdentity }
     * 
     */
    public AspenContextIdentity createAspenContextIdentity() {
        return new AspenContextIdentity();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSecurityContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/", name = "UserSecurityContext")
    public JAXBElement<UserSecurityContext> createUserSecurityContext(UserSecurityContext value) {
        return new JAXBElement<UserSecurityContext>(_UserSecurityContext_QNAME, UserSecurityContext.class, null, value);
    }

}
