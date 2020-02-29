//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.29 à 06:48:40 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import java.util.Date;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.openclassrooms.bibliotheque.adapters.DateTypeAdapter;


/**
 * <p>Classe Java pour borrowWs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="borrowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startBorrowDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="endBorrowDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="workTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowWs", propOrder = {
    "id",
    "status",
    "startBorrowDate",
    "endBorrowDate",
    "extended",
    "workTitle",
    "memberId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
public class BorrowWs {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String status;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected Date startBorrowDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(DateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected Date endBorrowDate;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected boolean extended;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected String workTitle;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    protected long memberId;

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
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété startBorrowDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public Date getStartBorrowDate() {
        return startBorrowDate;
    }

    /**
     * Définit la valeur de la propriété startBorrowDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setStartBorrowDate(Date value) {
        this.startBorrowDate = value;
    }

    /**
     * Obtient la valeur de la propriété endBorrowDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public Date getEndBorrowDate() {
        return endBorrowDate;
    }

    /**
     * Définit la valeur de la propriété endBorrowDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setEndBorrowDate(Date value) {
        this.endBorrowDate = value;
    }

    /**
     * Obtient la valeur de la propriété extended.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public boolean isExtended() {
        return extended;
    }

    /**
     * Définit la valeur de la propriété extended.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setExtended(boolean value) {
        this.extended = value;
    }

    /**
     * Obtient la valeur de la propriété workTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public String getWorkTitle() {
        return workTitle;
    }

    /**
     * Définit la valeur de la propriété workTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setWorkTitle(String value) {
        this.workTitle = value;
    }

    /**
     * Obtient la valeur de la propriété memberId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public long getMemberId() {
        return memberId;
    }

    /**
     * Définit la valeur de la propriété memberId.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-29T06:48:40+01:00", comments = "JAXB RI v2.3.2")
    public void setMemberId(long value) {
        this.memberId = value;
    }

}
