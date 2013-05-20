
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserAuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserAuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Anonymous"/>
 *     &lt;enumeration value="NTAuthentication"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="LDAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserAuthenticationType", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
@XmlEnum
public enum UserAuthenticationType {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("NTAuthentication")
    NT_AUTHENTICATION("NTAuthentication"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    LDAP("LDAP");
    private final String value;

    UserAuthenticationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserAuthenticationType fromValue(String v) {
        for (UserAuthenticationType c: UserAuthenticationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
