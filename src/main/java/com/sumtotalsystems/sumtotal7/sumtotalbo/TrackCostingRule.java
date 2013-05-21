
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackCostingRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackCostingRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoEcommerceFixedPrice"/>
 *     &lt;enumeration value="NoEcommerceVariablePrice"/>
 *     &lt;enumeration value="EcommerceFixedPrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackCostingRule")
@XmlEnum
public enum TrackCostingRule {

    @XmlEnumValue("NoEcommerceFixedPrice")
    NO_ECOMMERCE_FIXED_PRICE("NoEcommerceFixedPrice"),
    @XmlEnumValue("NoEcommerceVariablePrice")
    NO_ECOMMERCE_VARIABLE_PRICE("NoEcommerceVariablePrice"),
    @XmlEnumValue("EcommerceFixedPrice")
    ECOMMERCE_FIXED_PRICE("EcommerceFixedPrice");
    private final String value;

    TrackCostingRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackCostingRule fromValue(String v) {
        for (TrackCostingRule c: TrackCostingRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
