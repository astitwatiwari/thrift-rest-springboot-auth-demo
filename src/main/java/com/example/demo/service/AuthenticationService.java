package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationService {
    @Autowired
    UserRepository userRepository;

    public boolean authenticateUser(String userName, String password) {
        User user = userRepository.findUserByUsername(userName);
        return user.getPassword().equals(password);
    }
}
