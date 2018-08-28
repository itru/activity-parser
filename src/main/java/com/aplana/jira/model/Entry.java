
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
 *         &lt;element ref="{http://www.w3.org/2005/Atom}title"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}summary" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}content" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}author"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}published"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}updated"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}category" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}link" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://purl.org/syndication/thread/1.0}in-reply-to" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}generator"/>
 *         &lt;element ref="{http://streams.atlassian.com/syndication/general/1.0}application"/>
 *         &lt;element ref="{http://activitystrea.ms/spec/1.0/}verb" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://activitystrea.ms/spec/1.0/}object"/>
 *         &lt;element ref="{http://activitystrea.ms/spec/1.0/}target" minOccurs="0"/>
 *         &lt;element ref="{http://streams.atlassian.com/syndication/general/1.0}timezone-offset"/>
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
    "title",
    "summary",
    "content",
    "author",
    "published",
    "updated",
    "category",
    "link",
    "inReplyTo",
    "generator",
    "application",
    "verb",
    "object",
    "target",
    "timezoneOffset"
})
@XmlRootElement(name = "entry", namespace = "http://www.w3.org/2005/Atom")
public class Entry {

    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Title title;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom")
    protected Summary summary;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom")
    protected Content content;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Author author;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String published;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String updated;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom")
    protected Category category;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected List<Link> link;
    @XmlElement(name = "in-reply-to", namespace = "http://purl.org/syndication/thread/1.0")
    protected InReplyTo inReplyTo;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Generator generator;
    @XmlElement(namespace = "http://streams.atlassian.com/syndication/general/1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String application;
    @XmlElement(namespace = "http://activitystrea.ms/spec/1.0/", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> verb;
    @XmlElement(namespace = "http://activitystrea.ms/spec/1.0/", required = true)
    protected Object object;
    @XmlElement(namespace = "http://activitystrea.ms/spec/1.0/")
    protected Target target;
    @XmlElement(name = "timezone-offset", namespace = "http://streams.atlassian.com/syndication/general/1.0", required = true)
    protected String timezoneOffset;

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
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link Summary }
     *     
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary }
     *     
     */
    public void setSummary(Summary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Author }
     *     
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Author }
     *     
     */
    public void setAuthor(Author value) {
        this.author = value;
    }

    /**
     * Gets the value of the published property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublished(String value) {
        this.published = value;
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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * 
     * 
     */
    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the inReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link InReplyTo }
     *     
     */
    public InReplyTo getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Sets the value of the inReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InReplyTo }
     *     
     */
    public void setInReplyTo(InReplyTo value) {
        this.inReplyTo = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link Generator }
     *     
     */
    public Generator getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Generator }
     *     
     */
    public void setGenerator(Generator value) {
        this.generator = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerb() {
        if (verb == null) {
            verb = new ArrayList<String>();
        }
        return this.verb;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setObject(Object value) {
        this.object = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

    /**
     * Gets the value of the timezoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneOffset(String value) {
        this.timezoneOffset = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id='" + id + '\'' +
                ", title=" + title +
                ", summary=" + summary +
                ", content=" + content +
                ", author=" + author +
                ", published='" + published + '\'' +
                ", updated='" + updated + '\'' +
                ", category=" + category +
                ", link=" + link +
                ", inReplyTo=" + inReplyTo +
                ", generator=" + generator +
                ", application='" + application + '\'' +
                ", verb=" + verb +
                ", object=" + object +
                ", target=" + target +
                ", timezoneOffset=" + timezoneOffset +
                '}';
    }
}
