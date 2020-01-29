/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.dao.MascotaRepository;
import com.example.models.Mascota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.models.User;
import com.example.services.UserService;


@Service
public class MascotaServiceImp  implements MascotaService{

    
     @Autowired
    private MascotaRepository repositorio;
     
    @Override
    public List<Mascota> listadoMascota() {
        return repositorio.findAll();
    }

    @Override
    public Mascota mascotaUnico(int id) {
        return repositorio.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mascota altaMascota(Mascota m) {
        return repositorio.save(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mascota editarMascota(Mascota m) {
        return repositorio.save(m); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mascota eliminarMascota(int id) {
 Mascota m = repositorio.findById(id);
        if(m!=null){
            repositorio.delete(m);
        }return m;    }
    
}
