package com.example.judi.model;

import com.example.judi.enums.SexeEnum;

public class UserDto {
    private String email;
    private String nom;
    private int age;
    private SexeEnum sexe;
    
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public SexeEnum getSexe() {
        return sexe;
    }
    public void setSexe(SexeEnum sexe) {
        this.sexe = sexe;
    }

}
