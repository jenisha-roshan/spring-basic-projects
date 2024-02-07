package com.example.demo.services;

import com.example.demo.dto.User;
import com.example.demo.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user){
        try {
            userRepository.save(user);
            return "Saved User";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
