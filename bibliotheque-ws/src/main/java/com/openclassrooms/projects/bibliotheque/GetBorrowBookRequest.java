//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.16 à 03:43:17 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="workId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "", propOrder = {
    "workId",
    "memberId"
})
@XmlRootElement(name = "getBorrowBookRequest")
public class GetBorrowBookRequest {

    protected long workId;
    protected long memberId;

    /**
     * Obtient la valeur de la propriété workId.
     * 
     */
    public long getWorkId() {
        return workId;
    }

    /**
     * Définit la valeur de la propriété workId.
     * 
     */
    public void setWorkId(long value) {
        this.workId = value;
    }

    /**
     * Obtient la valeur de la propriété memberId.
     * 
     */
    public long getMemberId() {
        return memberId;
    }

    /**
     * Définit la valeur de la propriété memberId.
     * 
     */
    public void setMemberId(long value) {
        this.memberId = value;
    }

}
