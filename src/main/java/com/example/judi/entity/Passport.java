package com.example.judi.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPass;
    private Integer numero;

    

    public Passport() {
    }

    public Passport(Integer numero) {
        this.numero = numero;
    }

    public Integer getIdPass() {
        return idPass;
    }

    public void setIdPass(Integer idPass) {
        this.idPass = idPass;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
