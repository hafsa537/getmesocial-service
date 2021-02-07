package com.example.GETMESOCIALSERVICE.Resource;

import com.example.GETMESOCIALSERVICE.Model.User;
import com.example.GETMESOCIALSERVICE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")

    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @GetMapping("/user/{userId")
    public User getUserbyId(@PathVariable("userId") int userId)
    {
        return userService.getUserbyId(userId);
    }
}
