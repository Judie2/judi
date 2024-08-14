package com.example.judi.entity;

import java.util.List;

import com.example.judi.enums.SexeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {

    public final int getAge = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String nom;
    private Integer age;
    private SexeEnum sexe;

    @OneToMany(mappedBy = "idRole", cascade = CascadeType.ALL)
    private List<Role> role;

    public User() {
    }

    public User(String nom, int age, SexeEnum sexe, String email) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.email = email;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SexeEnum getSexe() {
        return sexe;
    }

    public void setSexe(SexeEnum sexe) {
        this.sexe = sexe;
    }

}
