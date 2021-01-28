package com.example.GETMESOCIALSERVICE.repository;

import com.example.GETMESOCIALSERVICE.Model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUser() {
        User user = new User("Hafsa", "Hyderabad", 30, "C:\\Users\\syeda hafsa fatima\\Desktop\\MY phone backuup\\DCIM\\Camera\\ProfilePic.jpg");
        return user;
    }
}