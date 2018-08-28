
package com.aplana.jira.model;

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
 *         &lt;element ref="{http://streams.atlassian.com/syndication/general/1.0}activity-source"/>
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
    "activitySource"
})
@XmlRootElement(name = "timed-out-source-list", namespace = "http://streams.atlassian.com/syndication/general/1.0")
public class TimedOutSourceList {

    @XmlElement(name = "activity-source", namespace = "http://streams.atlassian.com/syndication/general/1.0", required = true)
    protected String activitySource;

    /**
     * Gets the value of the activitySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivitySource() {
        return activitySource;
    }

    /**
     * Sets the value of the activitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivitySource(String value) {
        this.activitySource = value;
    }

}
