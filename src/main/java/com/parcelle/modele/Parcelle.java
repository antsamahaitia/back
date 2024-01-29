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
import jakarta.persistence.Table;

/**
 *
 * @author IRINTSOA
 */
@Entity
@Table(name="parcelle")
public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Idparcelle;
    @Column
    int idculture;
    @Column
    String typesolparcelle;
    @Column
    int longitudeparcelle;
    @Column
    int latitudeparcelle;
    @Column
    int idproprietaire;
    @Column
    String photoparcelle;



    public int getIdparcelle() {
        return Idparcelle;
    }

    public void setIdparcelle(int Idparcelle) {
        this.Idparcelle = Idparcelle;
    }

    public int getIdculture() {
        return idculture;
    }

    public void setIdculture(int idculture) {
        this.idculture = idculture;
    }

    

    public String getTypesolparcelle() {
        return typesolparcelle;
    }

    public void setTypesolparcelle(String typesolparcelle) {
        this.typesolparcelle = typesolparcelle;
    }

    public int getLongitudeparcelle() {
        return longitudeparcelle;
    }

    public void setLongitudeparcelle(int longitudeparcelle) {
        this.longitudeparcelle = longitudeparcelle;
    }

    public int getLatitudeparcelle() {
        return latitudeparcelle;
    }

    public void setLatitudeparcelle(int latitudeparcelle) {
        this.latitudeparcelle = latitudeparcelle;
    }

    public int getIdproprietaire() {
        return idproprietaire;
    }

    public void setIdproprietaire(int idproprietaire) {
        this.idproprietaire = idproprietaire;
    }

  
    public String getPhotoparcelle() {
        return photoparcelle;
    }

    public void setPhotoparcelle(String photoparcelle) {
        this.photoparcelle = photoparcelle;
    }

    public Parcelle(int Idparcelle, int idculture, String typesolparcelle, int longitudeparcelle, int latitudeparcelle, int idproprietaire, String photoparcelle) {
        this.Idparcelle = Idparcelle;
        this.idculture = idculture;
        this.typesolparcelle = typesolparcelle;
        this.longitudeparcelle = longitudeparcelle;
        this.latitudeparcelle = latitudeparcelle;
        this.idproprietaire = idproprietaire;
        this.photoparcelle = photoparcelle;
    }

 
  
    public Parcelle() {
    }
    
    
}
