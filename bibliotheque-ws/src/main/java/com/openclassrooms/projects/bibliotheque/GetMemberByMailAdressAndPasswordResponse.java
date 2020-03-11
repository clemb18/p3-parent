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
 *         &lt;element name="memberWs" type="{http://openclassrooms.com/projects/bibliotheque}memberWs"/&gt;
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
    "memberWs"
})
@XmlRootElement(name = "getMemberByMailAdressAndPasswordResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
public class GetMemberByMailAdressAndPasswordResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    protected MemberWs memberWs;

    /**
     * Obtient la valeur de la propriété memberWs.
     * 
     * @return
     *     possible object is
     *     {@link MemberWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    public MemberWs getMemberWs() {
        return memberWs;
    }

    /**
     * Définit la valeur de la propriété memberWs.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberWs }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2020-03-11T08:04:15+01:00", comments = "JAXB RI v2.3.2")
    public void setMemberWs(MemberWs value) {
        this.memberWs = value;
    }

}
