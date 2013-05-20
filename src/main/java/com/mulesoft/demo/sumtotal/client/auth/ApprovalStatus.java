
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApprovalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApprovalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Declined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApprovalStatus")
@XmlEnum
public enum ApprovalStatus {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Declined")
    DECLINED("Declined");
    private final String value;

    ApprovalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApprovalStatus fromValue(String v) {
        for (ApprovalStatus c: ApprovalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
