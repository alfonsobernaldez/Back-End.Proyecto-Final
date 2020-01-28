package com.example.controllers;



import com.example.models.User;
import com.example.services.UserService;
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
public class UserController {
    @Autowired
    UserService service;
    
    @GetMapping("/users")
    public List <User>listar(){
        
        return service.listadoUsers();
        
    }
    @PostMapping ("/users")
    public User agregar(@RequestBody User u){
        
        return service.altaUser(u);
        
    }
    @GetMapping({"/users/{id}"})
    public User listarIde(@PathVariable("id") int id){
        
        return service.userUnico(id);
    }
    @PutMapping (path={"/users/{id}"})
    public User editar(@RequestBody User u, @PathVariable("id") int id){
            u.setId(id);
    return service.editarUser(u);
    }
    @DeleteMapping(path={"/users/{id}"})
    public User delete (@PathVariable ("id") int id){
        return service.eliminarUser(id);
    }
    
}
