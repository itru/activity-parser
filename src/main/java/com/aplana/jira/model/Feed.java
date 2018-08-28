
package com.aplana.jira.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.w3.org/2005/Atom}id"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}title"/>
 *         &lt;element ref="{http://streams.atlassian.com/syndication/general/1.0}timezone-offset"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}updated"/>
 *         &lt;element ref="{http://streams.atlassian.com/syndication/general/1.0}timed-out-source-list"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}entry" maxOccurs="unbounded"/>
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
    "id",
    "link",
    "title",
    "timezoneOffset",
    "updated",
    "timedOutSourceList",
    "entry"
})
@XmlRootElement(name = "feed", namespace = "http://www.w3.org/2005/Atom")
public class Feed {

    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Link link;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Title title;
    @XmlElement(name = "timezone-offset", namespace = "http://streams.atlassian.com/syndication/general/1.0", required = true)
    protected BigInteger timezoneOffset;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String updated;
    @XmlElement(name = "timed-out-source-list", namespace = "http://streams.atlassian.com/syndication/general/1.0", required = true)
    protected TimedOutSourceList timedOutSourceList;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected List<Entry> entry;

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
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the timezoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimezoneOffset(BigInteger value) {
        this.timezoneOffset = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the timedOutSourceList property.
     * 
     * @return
     *     possible object is
     *     {@link TimedOutSourceList }
     *     
     */
    public TimedOutSourceList getTimedOutSourceList() {
        return timedOutSourceList;
    }

    /**
     * Sets the value of the timedOutSourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimedOutSourceList }
     *     
     */
    public void setTimedOutSourceList(TimedOutSourceList value) {
        this.timedOutSourceList = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entry }
     * 
     * 
     */
    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entry>();
        }
        return this.entry;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "id='" + id + '\'' +
                ", link=" + link +
                ", title=" + title +
                ", timezoneOffset=" + timezoneOffset +
                ", updated='" + updated + '\'' +
                ", timedOutSourceList=" + timedOutSourceList +
                ", entry=" + entry +
                '}';
    }
}
