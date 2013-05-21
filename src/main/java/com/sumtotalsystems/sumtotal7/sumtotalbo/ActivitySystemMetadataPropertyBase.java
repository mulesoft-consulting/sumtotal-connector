
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivitySystemMetadataPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitySystemMetadataPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}MediaType" minOccurs="0"/>
 *         &lt;element name="ContentTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ContentType" minOccurs="0"/>
 *         &lt;element name="LEMtdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LEMtd" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}LEMtd" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitySystemMetadataPropertyBase", propOrder = {
    "id",
    "mediaTypeId",
    "mediaType",
    "contentTypeId",
    "contentType",
    "leMtdId",
    "leMtd",
    "expiryDate"
})
@XmlSeeAlso({
    ActivitySystemMetadataCore.class
})
public abstract class ActivitySystemMetadataPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "MediaTypeId")
    protected String mediaTypeId;
    @XmlElement(name = "MediaType")
    protected MediaType mediaType;
    @XmlElement(name = "ContentTypeId")
    protected String contentTypeId;
    @XmlElement(name = "ContentType")
    protected ContentType contentType;
    @XmlElement(name = "LEMtdId")
    protected String leMtdId;
    @XmlElement(name = "LEMtd")
    protected LEMtd leMtd;
    @XmlElement(name = "ExpiryDate", required = true)
    protected NullableDateTime expiryDate;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mediaTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeId() {
        return mediaTypeId;
    }

    /**
     * Sets the value of the mediaTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeId(String value) {
        this.mediaTypeId = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMediaType(MediaType value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the contentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTypeId() {
        return contentTypeId;
    }

    /**
     * Sets the value of the contentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTypeId(String value) {
        this.contentTypeId = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the leMtdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEMtdId() {
        return leMtdId;
    }

    /**
     * Sets the value of the leMtdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEMtdId(String value) {
        this.leMtdId = value;
    }

    /**
     * Gets the value of the leMtd property.
     * 
     * @return
     *     possible object is
     *     {@link LEMtd }
     *     
     */
    public LEMtd getLEMtd() {
        return leMtd;
    }

    /**
     * Sets the value of the leMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEMtd }
     *     
     */
    public void setLEMtd(LEMtd value) {
        this.leMtd = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setExpiryDate(NullableDateTime value) {
        this.expiryDate = value;
    }

}
