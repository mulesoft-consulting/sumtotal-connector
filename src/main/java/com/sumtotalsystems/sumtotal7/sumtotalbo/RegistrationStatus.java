
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistrationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="OnWaitlist"/>
 *     &lt;enumeration value="HoldForApproval"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="ReservedWaitList"/>
 *     &lt;enumeration value="ExpiredWaitList"/>
 *     &lt;enumeration value="Replaced"/>
 *     &lt;enumeration value="Waived"/>
 *     &lt;enumeration value="InProgress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegistrationStatus")
@XmlEnum
public enum RegistrationStatus {

    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("OnWaitlist")
    ON_WAITLIST("OnWaitlist"),
    @XmlEnumValue("HoldForApproval")
    HOLD_FOR_APPROVAL("HoldForApproval"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("ReservedWaitList")
    RESERVED_WAIT_LIST("ReservedWaitList"),
    @XmlEnumValue("ExpiredWaitList")
    EXPIRED_WAIT_LIST("ExpiredWaitList"),
    @XmlEnumValue("Replaced")
    REPLACED("Replaced"),
    @XmlEnumValue("Waived")
    WAIVED("Waived"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress");
    private final String value;

    RegistrationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegistrationStatus fromValue(String v) {
        for (RegistrationStatus c: RegistrationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
