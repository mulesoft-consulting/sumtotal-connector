
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompletionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotCompleted"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="UnsupportedValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompletionStatus")
@XmlEnum
public enum CompletionStatus {

    @XmlEnumValue("NotCompleted")
    NOT_COMPLETED("NotCompleted"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("UnsupportedValue")
    UNSUPPORTED_VALUE("UnsupportedValue");
    private final String value;

    CompletionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletionStatus fromValue(String v) {
        for (CompletionStatus c: CompletionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
