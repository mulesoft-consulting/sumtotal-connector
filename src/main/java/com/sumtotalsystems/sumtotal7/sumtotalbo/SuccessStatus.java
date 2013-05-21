
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuccessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuccessStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="UnsupportedValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuccessStatus")
@XmlEnum
public enum SuccessStatus {

    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("Pass")
    PASS("Pass"),
    @XmlEnumValue("UnsupportedValue")
    UNSUPPORTED_VALUE("UnsupportedValue");
    private final String value;

    SuccessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuccessStatus fromValue(String v) {
        for (SuccessStatus c: SuccessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
