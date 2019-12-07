//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.12.06 à 05:14:44 PM CET 
//


package com.openclassrooms.projects.bibliot;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookWs" type="{http://openclassrooms.com/projects/bibliot}bookWs"/&gt;
 *         &lt;element name="userWs" type="{http://openclassrooms.com/projects/bibliot}userWs"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookWs",
    "userWs"
})
@XmlRootElement(name = "getBorrowBookRequest")
public class GetBorrowBookRequest {

    @XmlElement(required = true)
    protected BookWs bookWs;
    @XmlElement(required = true)
    protected UserWs userWs;

    /**
     * Obtient la valeur de la propriété bookWs.
     * 
     * @return
     *     possible object is
     *     {@link BookWs }
     *     
     */
    public BookWs getBookWs() {
        return bookWs;
    }

    /**
     * Définit la valeur de la propriété bookWs.
     * 
     * @param value
     *     allowed object is
     *     {@link BookWs }
     *     
     */
    public void setBookWs(BookWs value) {
        this.bookWs = value;
    }

    /**
     * Obtient la valeur de la propriété userWs.
     * 
     * @return
     *     possible object is
     *     {@link UserWs }
     *     
     */
    public UserWs getUserWs() {
        return userWs;
    }

    /**
     * Définit la valeur de la propriété userWs.
     * 
     * @param value
     *     allowed object is
     *     {@link UserWs }
     *     
     */
    public void setUserWs(UserWs value) {
        this.userWs = value;
    }

}
