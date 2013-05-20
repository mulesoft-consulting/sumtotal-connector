
package com.mulesoft.demo.sumtotal.client.auth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCore">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}UserPropertyBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCore")
@XmlSeeAlso({
    User.class
})
public abstract class UserCore
    extends UserPropertyBase
{


}
