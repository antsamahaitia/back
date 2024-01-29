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
@Entity(name="Terrain")
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idterrain;
    @Column
    String nomterrain;
    @Column
    String typesol;
    @Column
    int nbparcelle;
    @Column
    double superficie;
    @Column
    int longitudeterrain;
    @Column
    int latitudeterrain;
    @Column
    String phototerrain;

    public int getIdterrain() {
        return idterrain;
    }

    public void setIdterrain(int idterrain) {
        this.idterrain = idterrain;
    }

    public String getNomterrain() {
        return nomterrain;
    }

    public void setNomterrain(String nomterrain) {
        this.nomterrain = nomterrain;
    }

    public String getTypesol() {
        return typesol;
    }

    public void setTypesol(String typesol) {
        this.typesol = typesol;
    }

    public int getNbparcelle() {
        return nbparcelle;
    }

    public void setNbparcelle(int nbparcelle) {
        this.nbparcelle = nbparcelle;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getLongitudeterrain() {
        return longitudeterrain;
    }

    public void setLongitudeterrain(int longitudeterrain) {
        this.longitudeterrain = longitudeterrain;
    }

    public int getLatitudeterrain() {
        return latitudeterrain;
    }

    public void setLatitudeterrain(int latitudeterrain) {
        this.latitudeterrain = latitudeterrain;
    }

    public String getPhototerrain() {
        return phototerrain;
    }

    public void setPhototerrain(String phototerrain) {
        this.phototerrain = phototerrain;
    }

    public Terrain(int idterrain, String nomterrain, String typesol, int nbparcelle, double superficie, int longitudeterrain, int latitudeterrain, String phototerrain) {
        this.idterrain = idterrain;
        this.nomterrain = nomterrain;
        this.typesol = typesol;
        this.nbparcelle = nbparcelle;
        this.superficie = superficie;
        this.longitudeterrain = longitudeterrain;
        this.latitudeterrain = latitudeterrain;
        this.phototerrain = phototerrain;
    }
  

    public Terrain() {
    }

  
    
}
