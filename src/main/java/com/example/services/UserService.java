package com.example.services;

import com.example.models.User;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;



public interface UserService {

    List<User> listadoUsers();
    User userUnico(int id);
    User altaUser(User u);
    User editarUser(User u);
    User eliminarUser(int id);
}
