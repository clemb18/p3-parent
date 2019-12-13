//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.13 à 10:40:54 PM CET 
//


package com.openclassrooms.projects.bibliot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
    "workTitle"
})
public class BorrowWs {

    protected long id;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startBorrowDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endBorrowDate;
    protected boolean extended;
    @XmlElement(required = true)
    protected String workTitle;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
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
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété startBorrowDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartBorrowDate() {
        return startBorrowDate;
    }

    /**
     * Définit la valeur de la propriété startBorrowDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartBorrowDate(XMLGregorianCalendar value) {
        this.startBorrowDate = value;
    }

    /**
     * Obtient la valeur de la propriété endBorrowDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndBorrowDate() {
        return endBorrowDate;
    }

    /**
     * Définit la valeur de la propriété endBorrowDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndBorrowDate(XMLGregorianCalendar value) {
        this.endBorrowDate = value;
    }

    /**
     * Obtient la valeur de la propriété extended.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * Définit la valeur de la propriété extended.
     * 
     */
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
    public void setWorkTitle(String value) {
        this.workTitle = value;
    }

}
