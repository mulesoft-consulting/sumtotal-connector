
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyCore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}CurrencyPropertyBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyCore")
@XmlSeeAlso({
    Currency.class
})
public abstract class CurrencyCore
    extends CurrencyPropertyBase
{


}
