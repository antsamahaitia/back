/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcelle.controller;

import com.parcelle.repository.ProprietaireRepository;
import com.parcelle.modele.Proprietaire;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/Proprietaire")
public class ProprietaireController {
     @Autowired
    ProprietaireRepository proprietaireRepository;
   
     @PostMapping("/insert")
    public Proprietaire insert(@RequestBody Proprietaire p){
        p = proprietaireRepository.save(p);
        return p;
    }
    
      @DeleteMapping("/deleteProprietaire")
    public void delete(@RequestParam Integer t){
    proprietaireRepository.deleteById(t);
    
    }
    
    @PutMapping("/updateProprietaire")
    public Proprietaire update(@RequestBody Proprietaire t){
    
    proprietaireRepository.save(t);
    return t;
    }
    
    @GetMapping("/all")
    public List<Proprietaire> all() {
    return proprietaireRepository.findAll();
    }
    
    
}
