
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPendingEvaluationsResult" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/}ArrayOfEvaluation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPendingEvaluationsResult"
})
@XmlRootElement(name = "GetPendingEvaluationsResponse", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
public class GetPendingEvaluationsResponse {

    @XmlElement(name = "GetPendingEvaluationsResult", namespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    protected ArrayOfEvaluation getPendingEvaluationsResult;

    /**
     * Gets the value of the getPendingEvaluationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvaluation }
     *     
     */
    public ArrayOfEvaluation getGetPendingEvaluationsResult() {
        return getPendingEvaluationsResult;
    }

    /**
     * Sets the value of the getPendingEvaluationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvaluation }
     *     
     */
    public void setGetPendingEvaluationsResult(ArrayOfEvaluation value) {
        this.getPendingEvaluationsResult = value;
    }

}
