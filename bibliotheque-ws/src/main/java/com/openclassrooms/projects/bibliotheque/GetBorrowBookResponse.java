//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.23 à 03:45:04 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.annotation.Generated;
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
 *         &lt;element name="borrowWs" type="{http://openclassrooms.com/projects/bibliotheque}borrowWs"/&gt;
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
    "borrowWs"
})
@XmlRootElement(name = "getBorrowBookResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-23T03:45:04+01:00", comments = "JAXB RI v2.3.2")
public class GetBorrowBookResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-23T03:45:04+01:00", comments = "JAXB RI v2.3.2")
    protected BorrowWs borrowWs;

    /**
     * Obtient la valeur de la propriété borrowWs.
     * 
     * @return
     *     possible object is
     *     {@link BorrowWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-23T03:45:04+01:00", comments = "JAXB RI v2.3.2")
    public BorrowWs getBorrowWs() {
        return borrowWs;
    }

    /**
     * Définit la valeur de la propriété borrowWs.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-02-23T03:45:04+01:00", comments = "JAXB RI v2.3.2")
    public void setBorrowWs(BorrowWs value) {
        this.borrowWs = value;
    }

}
