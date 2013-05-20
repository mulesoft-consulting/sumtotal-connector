
package com.mulesoft.demo.sumtotal.client.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompetencyPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetencyPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionStem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Activity" minOccurs="0"/>
 *         &lt;element name="DomainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Domain" minOccurs="0"/>
 *         &lt;element name="DomainCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptText4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptMemo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptDate1" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptDate2" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDateTime"/>
 *         &lt;element name="OptYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OptMoney" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDecimal"/>
 *         &lt;element name="OptInteger" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableInt32"/>
 *         &lt;element name="OptFloat" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}NullableDouble"/>
 *         &lt;element name="OptCurrencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptCurrency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Currency" minOccurs="0"/>
 *         &lt;element name="RequiredSkills" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfCompetencyRequiredSkill"/>
 *         &lt;element name="SharedDomains" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}ArrayOfCompetencySharedDomain"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetencyPropertyBase", propOrder = {
    "id",
    "name",
    "description",
    "url",
    "questionStem",
    "activityId",
    "activity",
    "domainId",
    "domain",
    "domainCode",
    "optText1",
    "optText2",
    "optText3",
    "optText4",
    "optMemo1",
    "optDate1",
    "optDate2",
    "optYesNo",
    "optMoney",
    "optInteger",
    "optFloat",
    "optCurrencyId",
    "optCurrency",
    "requiredSkills",
    "sharedDomains"
})
@XmlSeeAlso({
    CompetencyCore.class
})
public abstract class CompetencyPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "QuestionStem")
    protected String questionStem;
    @XmlElement(name = "ActivityId")
    protected String activityId;
    @XmlElement(name = "Activity")
    protected Activity activity;
    @XmlElement(name = "DomainId")
    protected String domainId;
    @XmlElement(name = "Domain")
    protected Domain domain;
    @XmlElement(name = "DomainCode")
    protected String domainCode;
    @XmlElement(name = "OptText1")
    protected String optText1;
    @XmlElement(name = "OptText2")
    protected String optText2;
    @XmlElement(name = "OptText3")
    protected String optText3;
    @XmlElement(name = "OptText4")
    protected String optText4;
    @XmlElement(name = "OptMemo1")
    protected String optMemo1;
    @XmlElement(name = "OptDate1", required = true)
    protected NullableDateTime optDate1;
    @XmlElement(name = "OptDate2", required = true)
    protected NullableDateTime optDate2;
    @XmlElement(name = "OptYesNo")
    protected boolean optYesNo;
    @XmlElement(name = "OptMoney", required = true)
    protected NullableDecimal optMoney;
    @XmlElement(name = "OptInteger", required = true)
    protected NullableInt32 optInteger;
    @XmlElement(name = "OptFloat", required = true)
    protected NullableDouble optFloat;
    @XmlElement(name = "OptCurrencyId")
    protected String optCurrencyId;
    @XmlElement(name = "OptCurrency")
    protected Currency optCurrency;
    @XmlElement(name = "RequiredSkills", required = true, nillable = true)
    protected ArrayOfCompetencyRequiredSkill requiredSkills;
    @XmlElement(name = "SharedDomains", required = true, nillable = true)
    protected ArrayOfCompetencySharedDomain sharedDomains;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the questionStem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionStem() {
        return questionStem;
    }

    /**
     * Sets the value of the questionStem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionStem(String value) {
        this.questionStem = value;
    }

    /**
     * Gets the value of the activityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the value of the activityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityId(String value) {
        this.activityId = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link Domain }
     *     
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain }
     *     
     */
    public void setDomain(Domain value) {
        this.domain = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the optText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText1() {
        return optText1;
    }

    /**
     * Sets the value of the optText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText1(String value) {
        this.optText1 = value;
    }

    /**
     * Gets the value of the optText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText2() {
        return optText2;
    }

    /**
     * Sets the value of the optText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText2(String value) {
        this.optText2 = value;
    }

    /**
     * Gets the value of the optText3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText3() {
        return optText3;
    }

    /**
     * Sets the value of the optText3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText3(String value) {
        this.optText3 = value;
    }

    /**
     * Gets the value of the optText4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptText4() {
        return optText4;
    }

    /**
     * Sets the value of the optText4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptText4(String value) {
        this.optText4 = value;
    }

    /**
     * Gets the value of the optMemo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptMemo1() {
        return optMemo1;
    }

    /**
     * Sets the value of the optMemo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptMemo1(String value) {
        this.optMemo1 = value;
    }

    /**
     * Gets the value of the optDate1 property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getOptDate1() {
        return optDate1;
    }

    /**
     * Sets the value of the optDate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setOptDate1(NullableDateTime value) {
        this.optDate1 = value;
    }

    /**
     * Gets the value of the optDate2 property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDateTime }
     *     
     */
    public NullableDateTime getOptDate2() {
        return optDate2;
    }

    /**
     * Sets the value of the optDate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDateTime }
     *     
     */
    public void setOptDate2(NullableDateTime value) {
        this.optDate2 = value;
    }

    /**
     * Gets the value of the optYesNo property.
     * 
     */
    public boolean isOptYesNo() {
        return optYesNo;
    }

    /**
     * Sets the value of the optYesNo property.
     * 
     */
    public void setOptYesNo(boolean value) {
        this.optYesNo = value;
    }

    /**
     * Gets the value of the optMoney property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDecimal }
     *     
     */
    public NullableDecimal getOptMoney() {
        return optMoney;
    }

    /**
     * Sets the value of the optMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDecimal }
     *     
     */
    public void setOptMoney(NullableDecimal value) {
        this.optMoney = value;
    }

    /**
     * Gets the value of the optInteger property.
     * 
     * @return
     *     possible object is
     *     {@link NullableInt32 }
     *     
     */
    public NullableInt32 getOptInteger() {
        return optInteger;
    }

    /**
     * Sets the value of the optInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableInt32 }
     *     
     */
    public void setOptInteger(NullableInt32 value) {
        this.optInteger = value;
    }

    /**
     * Gets the value of the optFloat property.
     * 
     * @return
     *     possible object is
     *     {@link NullableDouble }
     *     
     */
    public NullableDouble getOptFloat() {
        return optFloat;
    }

    /**
     * Sets the value of the optFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableDouble }
     *     
     */
    public void setOptFloat(NullableDouble value) {
        this.optFloat = value;
    }

    /**
     * Gets the value of the optCurrencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptCurrencyId() {
        return optCurrencyId;
    }

    /**
     * Sets the value of the optCurrencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptCurrencyId(String value) {
        this.optCurrencyId = value;
    }

    /**
     * Gets the value of the optCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOptCurrency() {
        return optCurrency;
    }

    /**
     * Sets the value of the optCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOptCurrency(Currency value) {
        this.optCurrency = value;
    }

    /**
     * Gets the value of the requiredSkills property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompetencyRequiredSkill }
     *     
     */
    public ArrayOfCompetencyRequiredSkill getRequiredSkills() {
        return requiredSkills;
    }

    /**
     * Sets the value of the requiredSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompetencyRequiredSkill }
     *     
     */
    public void setRequiredSkills(ArrayOfCompetencyRequiredSkill value) {
        this.requiredSkills = value;
    }

    /**
     * Gets the value of the sharedDomains property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompetencySharedDomain }
     *     
     */
    public ArrayOfCompetencySharedDomain getSharedDomains() {
        return sharedDomains;
    }

    /**
     * Sets the value of the sharedDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompetencySharedDomain }
     *     
     */
    public void setSharedDomains(ArrayOfCompetencySharedDomain value) {
        this.sharedDomains = value;
    }

}
