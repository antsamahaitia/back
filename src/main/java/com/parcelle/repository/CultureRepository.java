/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.parcelle.repository;

import com.parcelle.modele.Culture;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IRINTSOA
 */
public interface CultureRepository extends JpaRepository<Culture,Integer>{
    
}
