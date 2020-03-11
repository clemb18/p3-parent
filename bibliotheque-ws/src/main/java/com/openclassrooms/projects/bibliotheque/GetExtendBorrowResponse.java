//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.11 à 08:04:15 PM CET 
//


package com.openclassrooms.projects.bibliotheque;

import javax.annotation.Generated;
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
 *         &lt;element name="extendSucceed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "extendSucceed"
})
@XmlRootElement(name = "getExtendBorrowResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
public class GetExtendBorrowResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    protected boolean extendSucceed;

    /**
     * Obtient la valeur de la propriété extendSucceed.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    public boolean isExtendSucceed() {
        return extendSucceed;
    }

    /**
     * Définit la valeur de la propriété extendSucceed.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    public void setExtendSucceed(boolean value) {
        this.extendSucceed = value;
    }

}
