package com.immobilisation.model;

import jakarta.persistence.*;

@Entity
public class Fournisseur {
    @Id
    @Column(name = "id_fournisseur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
