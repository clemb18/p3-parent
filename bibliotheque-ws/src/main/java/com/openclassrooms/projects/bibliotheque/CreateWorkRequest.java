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
 *         &lt;element name="workWs" type="{http://openclassrooms.com/projects/bibliotheque}workWs"/&gt;
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
    "workWs"
})
@XmlRootElement(name = "createWorkRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
public class CreateWorkRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    protected WorkWs workWs;

    /**
     * Obtient la valeur de la propriété workWs.
     * 
     * @return
     *     possible object is
     *     {@link WorkWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public WorkWs getWorkWs() {
        return workWs;
    }

    /**
     * Définit la valeur de la propriété workWs.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-07T07:52:15+01:00", comments = "JAXB RI v2.3.2")
    public void setWorkWs(WorkWs value) {
        this.workWs = value;
    }

}
