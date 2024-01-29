package com.parcelle.repository;


import com.parcelle.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author IRINTSOA
 */
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{
    
//    @Query("from Utilisateur")
    @Query("from Utilisateur where Email= ?1 and Mdp= ?2 ")
    public Utilisateur login(String email,String mdp);
    
    
    
    
    
}
