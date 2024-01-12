package com.immobilisation.model;

import jakarta.persistence.Column;

public class Marque {
    
    @Column(name = "id_livreur")
    String id;
    String nom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

}
