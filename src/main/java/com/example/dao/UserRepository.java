package com.example.dao;

import com.example.models.User;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User,Integer> {
    
    List<User> findAll();
    User findById(int id);
    User save (User u);
    void delete (User u);
}
