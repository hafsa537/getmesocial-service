package com.example.GETMESOCIALSERVICE.Resource;

import com.example.GETMESOCIALSERVICE.Model.User;
import com.example.GETMESOCIALSERVICE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class UserResource {

    @Autowired
    private UserService userservice;

    @GetMapping("/user")

    public User getUser()
    {
    return userservice.getUser();
    }
}
