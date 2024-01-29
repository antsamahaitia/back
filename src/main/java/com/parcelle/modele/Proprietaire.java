/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcelle.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author IRINTSOA
 */
@Entity(name="Proprietaire")
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idproprietaire;
    @Column
    String nomproprietaire;

    public int getIdproprietaire() {
        return idproprietaire;
    }

    public void setIdproprietaire(int idproprietaire) {
        this.idproprietaire = idproprietaire;
    }

    public String getNomproprietaire() {
        return nomproprietaire;
    }

    public void setNomproprietaire(String nomproprietaire) {
        this.nomproprietaire = nomproprietaire;
    }

    public Proprietaire(int idproprietaire, String nomproprietaire) {
        this.idproprietaire = idproprietaire;
        this.nomproprietaire = nomproprietaire;
    }

  

    public Proprietaire() {
    }
  
 
}
