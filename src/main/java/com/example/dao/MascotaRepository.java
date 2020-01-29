/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao;

import com.example.models.Mascota;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface MascotaRepository extends Repository<Mascota,Integer> {
    
    List <Mascota> findAll();
    Mascota findById (int id);
    Mascota save (Mascota m);
    void delete (Mascota m);
}
