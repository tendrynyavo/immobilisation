package com.immobilisation.model;

import jakarta.persistence.*;

@Entity
public class Marque {
    @Id
    @Column(name = "id_livreur")
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
