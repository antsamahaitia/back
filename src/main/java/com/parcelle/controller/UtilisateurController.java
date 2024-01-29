/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcelle.controller;


import com.parcelle.repository.UtilisateurRepository;
import com.parcelle.modele.Utilisateur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IRINTSOA
 */
@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @GetMapping("/getAll")
    public List<Utilisateur> getAllUt(){
        return utilisateurRepository.findAll();
    }
    
    @PostMapping("/insert")
    public Utilisateur insert(@RequestBody Utilisateur u){
    u = utilisateurRepository.save(u);
        return u;
   
    }
    
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer u){
    utilisateurRepository.deleteById(u);
    
    }
    
    
    @PutMapping("/update")
    public void update(@RequestBody Utilisateur u){
//    utilisateurRepository.update(u.getEmail(), u.getMdp(), u.getIdutilisateur());
    
    }
    
    @PostMapping("/login")
    public Utilisateur login(@RequestBody Utilisateur u){  
        u = utilisateurRepository.login(u.getEmail(), u.getMdp());
    return u;
    
    }
    
}

