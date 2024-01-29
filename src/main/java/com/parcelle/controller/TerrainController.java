/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parcelle.controller;

import com.parcelle.repository.TerrainRepository;
import com.parcelle.modele.Terrain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IRINTSOA
 */
@RestController
@RequestMapping("/terrain")
public class TerrainController {
    @Autowired
    TerrainRepository terrainRepository;
   
     @PostMapping("/insertTerrain")
    public Terrain insert(@RequestBody Terrain t){
        t = terrainRepository.save(t);
        return t;
    }
    
      @DeleteMapping("/deleteTerrain")
    public void delete(@RequestParam Integer t){
    terrainRepository.deleteById(t);
    
    }
    
    @GetMapping("/all")
    public List<Terrain> all() {
        return terrainRepository.findAll();
    }
    
 
    
    
}