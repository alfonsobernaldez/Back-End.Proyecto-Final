package com.example.services;

import com.example.dao.UserRepository;
import com.example.models.User;
import com.example.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository repositorio;
    
    @Override
    public List<User> listadoUsers() {
        return repositorio.findAll();
        }

    @Override
    public User userUnico(int id) {
        return repositorio.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User altaUser(User u) {
        
        return repositorio.save(u); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User editarUser(User u) {
        return repositorio.save(u); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User eliminarUser(int id) {
        User u = repositorio.findById(id);
        if(u!=null){
            repositorio.delete(u);
        }return u;
    }

    
}
