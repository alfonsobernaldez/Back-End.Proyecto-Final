package com.example.controllers;


import com.example.models.Mascota;
import com.example.services.MascotaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping
public class MascotaController {
    
    @Autowired
    MascotaService service;
    
    @GetMapping("/mascotas")
    public List <Mascota>listar(){
        
        return service.listadoMascota();
        
    }
    @PostMapping ("/mascotas")
    public Mascota agregar(@RequestBody Mascota m){
        
        return service.altaMascota(m);
        
    }
    @GetMapping({"/mascotas/{id}"})
    public Mascota listarIde(@PathVariable("id") int id){
        
        return service.mascotaUnico(id);
    }
    @PutMapping (path={"/users/{id}"})
    public Mascota editar(@RequestBody Mascota m, @PathVariable("id") int id){
            m.setId(id);
    return service.editarMascota(m);
    }
    @DeleteMapping(path={"/mascotas/{id}"})
    public Mascota delete (@PathVariable ("id") int id){
        return service.eliminarMascota(id);
    }
    
}
