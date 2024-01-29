/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.parcelle.repository;

import com.parcelle.modele.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IRINTSOA
 */
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Integer>{
    
}
