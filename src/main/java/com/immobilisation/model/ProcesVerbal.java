package com.immobilisation.model;

import java.sql.Date;

import jakarta.persistence.Column;

public class ProcesVerbal {
    
    @Column(name = "id_proces")
    String id;
    String designation;
    Date date;
    int etat;
    double valeur;
    Fournisseur fournisseur;
    Livreur livreur;
    Marque marque;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    


}
