/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.models.Mascota;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;


public interface MascotaService {
    
    List<Mascota> listadoMascota();
    Mascota mascotaUnico(int id);
    Mascota altaMascota(Mascota m);
    Mascota editarMascota(Mascota m);
    Mascota eliminarMascota(int id);
    
}
