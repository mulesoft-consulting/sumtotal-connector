
package com.sumtotalsystems.sumtotal7.sumtotalbo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobRequiredCompetencyPropertyBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobRequiredCompetencyPropertyBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Entity">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Job" minOccurs="0"/>
 *         &lt;element name="CompetencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competency" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Competency" minOccurs="0"/>
 *         &lt;element name="PriorityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.sumtotalsystems.com/sumtotal7/sumtotalbo/}Priority" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobRequiredCompetencyPropertyBase", propOrder = {
    "id",
    "jobId",
    "job",
    "competencyId",
    "competency",
    "priorityId",
    "priority"
})
@XmlSeeAlso({
    JobRequiredCompetencyCore.class
})
public abstract class JobRequiredCompetencyPropertyBase
    extends Entity
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "JobId")
    protected String jobId;
    @XmlElement(name = "Job")
    protected Job job;
    @XmlElement(name = "CompetencyId")
    protected String competencyId;
    @XmlElement(name = "Competency")
    protected Competency competency;
    @XmlElement(name = "PriorityId")
    protected String priorityId;
    @XmlElement(name = "Priority")
    protected Priority priority;

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
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
    }

    /**
     * Gets the value of the competencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyId() {
        return competencyId;
    }

    /**
     * Sets the value of the competencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyId(String value) {
        this.competencyId = value;
    }

    /**
     * Gets the value of the competency property.
     * 
     * @return
     *     possible object is
     *     {@link Competency }
     *     
     */
    public Competency getCompetency() {
        return competency;
    }

    /**
     * Sets the value of the competency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Competency }
     *     
     */
    public void setCompetency(Competency value) {
        this.competency = value;
    }

    /**
     * Gets the value of the priorityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityId() {
        return priorityId;
    }

    /**
     * Sets the value of the priorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityId(String value) {
        this.priorityId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

}
