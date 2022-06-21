package com.example.travelblog.controller;

import com.example.travelblog.domain.User;
import com.example.travelblog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.findAllUsers() ;
    }

    @GetMapping("/user/{user_id}")
    public User getUserById(@PathVariable int user_id){

        return userService.findUserById(user_id);
    }

    @GetMapping("/user/post/{user_id}")
    public List<User> getUsersForPost(@PathVariable int user_id){

        return userService.getUsersByPost(user_id);
    }

    @PutMapping("/user/{id}")
    public void changeUserName(@PathVariable int id, @RequestBody User user){
        System.out.println(user.getFirstName());
        userService.updateUserFirstName(user.getFirstName(), id);
    }
}
