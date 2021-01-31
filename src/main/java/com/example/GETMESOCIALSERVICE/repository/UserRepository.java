package com.example.GETMESOCIALSERVICE.repository;

import com.example.GETMESOCIALSERVICE.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {

    List<User> userList=new ArrayList();
    public User getUser() {

        User user = new User("Hafsa", "Hyderabad", 30 , "C:\\Users\\syeda hafsa fatima\\Desktop\\MY phone backuup\\DCIM\\Camera\\ProfilePic.jpg");
        return user;
    }

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }
}