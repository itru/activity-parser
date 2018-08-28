
package com.aplana.jira.model;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aplana.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObjectType_QNAME = new QName("http://activitystrea.ms/spec/1.0/", "object-type");
    private final static QName _ActivitySource_QNAME = new QName("http://streams.atlassian.com/syndication/general/1.0", "activity-source");
    private final static QName _Username_QNAME = new QName("http://streams.atlassian.com/syndication/username/1.0", "username");
    private final static QName _Application_QNAME = new QName("http://streams.atlassian.com/syndication/general/1.0", "application");
    private final static QName _Email_QNAME = new QName("http://www.w3.org/2005/Atom", "email");
    private final static QName _Uri_QNAME = new QName("http://www.w3.org/2005/Atom", "uri");
    private final static QName _Updated_QNAME = new QName("http://www.w3.org/2005/Atom", "updated");
    private final static QName _Id_QNAME = new QName("http://www.w3.org/2005/Atom", "id");
    private final static QName _TimezoneOffset_QNAME = new QName("http://streams.atlassian.com/syndication/general/1.0", "timezone-offset");
    private final static QName _Published_QNAME = new QName("http://www.w3.org/2005/Atom", "published");
    private final static QName _Verb_QNAME = new QName("http://activitystrea.ms/spec/1.0/", "verb");
    private final static QName _Name_QNAME = new QName("http://www.w3.org/2005/Atom", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aplana.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link java.lang.Object }
     * 
     */
    public java.lang.Object createObject() {
        return new java.lang.Object();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Summary }
     * 
     */
    public Summary createSummary() {
        return new Summary();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Target }
     * 
     */
    public Target createTarget() {
        return new Target();
    }

    /**
     * Create an instance of {@link InReplyTo }
     * 
     */
    public InReplyTo createInReplyTo() {
        return new InReplyTo();
    }

    /**
     * Create an instance of {@link TimedOutSourceList }
     * 
     */
    public TimedOutSourceList createTimedOutSourceList() {
        return new TimedOutSourceList();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Generator }
     * 
     */
    public Generator createGenerator() {
        return new Generator();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link Feed }
     * 
     */
    public Feed createFeed() {
        return new Feed();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activitystrea.ms/spec/1.0/", name = "object-type")
    public JAXBElement<String> createObjectType(String value) {
        return new JAXBElement<String>(_ObjectType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://streams.atlassian.com/syndication/general/1.0", name = "activity-source")
    public JAXBElement<String> createActivitySource(String value) {
        return new JAXBElement<String>(_ActivitySource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://streams.atlassian.com/syndication/username/1.0", name = "username")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://streams.atlassian.com/syndication/general/1.0", name = "application")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createApplication(String value) {
        return new JAXBElement<String>(_Application_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "uri")
    public JAXBElement<String> createUri(String value) {
        return new JAXBElement<String>(_Uri_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "updated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUpdated(String value) {
        return new JAXBElement<String>(_Updated_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://streams.atlassian.com/syndication/general/1.0", name = "timezone-offset")
    public JAXBElement<BigInteger> createTimezoneOffset(BigInteger value) {
        return new JAXBElement<BigInteger>(_TimezoneOffset_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "published")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPublished(String value) {
        return new JAXBElement<String>(_Published_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activitystrea.ms/spec/1.0/", name = "verb")
    public JAXBElement<String> createVerb(String value) {
        return new JAXBElement<String>(_Verb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

}
