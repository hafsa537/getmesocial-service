package com.example.GETMESOCIALSERVICE.service;

import com.example.GETMESOCIALSERVICE.Model.User;
import com.example.GETMESOCIALSERVICE.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;
    public User getUser()
    {
            return userRepository.getUser();

            }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }
}
