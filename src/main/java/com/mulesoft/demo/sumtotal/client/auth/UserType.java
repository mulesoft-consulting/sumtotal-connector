
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="WebService"/>
 *     &lt;enumeration value="WebUI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserType", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/Authentication/")
@XmlEnum
public enum UserType {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("WebService")
    WEB_SERVICE("WebService"),
    @XmlEnumValue("WebUI")
    WEB_UI("WebUI");
    private final String value;

    UserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserType fromValue(String v) {
        for (UserType c: UserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
