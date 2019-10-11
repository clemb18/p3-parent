package org.occ.bibliot.model.beans;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="T_LIBRARY")
public class Library implements Serializable {

    @Id

    @Column(name = "L_ID")
    public Integer id;
    @Column(name = "L_NAME")
    private String name;
    @Column(name = "L_CITY")
    private String city;

    @OneToMany
    private List<Work> works;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }
}
