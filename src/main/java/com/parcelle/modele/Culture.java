/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcelle.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;

/**
 *
 * @author IRINTSOA
 */
@Entity(name = "culture")
public class Culture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idculture;
    String nomculture;
    String typeculture;
    Timestamp tempsculture;
    int rendement;

    public Culture(Integer idculture, String nomculture, String typeculture, Timestamp tempsculture, int rendement) {
        this.idculture = idculture;
        this.nomculture = nomculture;
        this.typeculture = typeculture;
        this.tempsculture = tempsculture;
        this.rendement = rendement;
    }

    public Culture() {
    }

    public Integer getIdculture() {
        return idculture;
    }

    public void setIdculture(Integer idculture) {
        this.idculture = idculture;
    }

    public String getNomculture() {
        return nomculture;
    }

    public void setNomculture(String nomculture) {
        this.nomculture = nomculture;
    }

    public String getTypeculture() {
        return typeculture;
    }

    public void setTypeculture(String typeculture) {
        this.typeculture = typeculture;
    }

    public Timestamp getTempsculture() {
        return tempsculture;
    }

    public void setTempsculture(Timestamp tempsculture) {
        this.tempsculture = tempsculture;
    }

    public int getRendement() {
        return rendement;
    }

    public void setRendement(int rendement) {
        this.rendement = rendement;
    }
    
    
    
    
}
