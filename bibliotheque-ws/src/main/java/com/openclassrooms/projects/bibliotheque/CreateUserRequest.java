//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.2 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.03.07 à 07:52:15 AM CET 
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
 *         &lt;element name="userWs" type="{http://openclassrooms.com/projects/bibliotheque}userWs"/&gt;
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
    "userWs"
})
@XmlRootElement(name = "createUserRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
public class CreateUserRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    protected UserWs userWs;

    /**
     * Obtient la valeur de la propriété userWs.
     * 
     * @return
     *     possible object is
     *     {@link UserWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public void setUserWs(UserWs value) {
        this.userWs = value;
    }

}
