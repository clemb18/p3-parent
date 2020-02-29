//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.29 à 06:48:40 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour workWs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="workWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workWs", propOrder = {
    "id",
    "title",
    "author",
    "publicationDate",
    "bookDescription"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
public class WorkWs {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String title;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String author;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String publicationDate;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String bookDescription;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété author.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getAuthor() {
        return author;
    }

    /**
     * Définit la valeur de la propriété author.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propriété publicationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Définit la valeur de la propriété publicationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Obtient la valeur de la propriété bookDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getBookDescription() {
        return bookDescription;
    }

    /**
     * Définit la valeur de la propriété bookDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setBookDescription(String value) {
        this.bookDescription = value;
    }

}
