package com.example.parentweb.controller;

import com.example.parentservice.service.UserService;
import com.example.partentmodel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class UserController {
    @Autowired(required = false)
    UserService userService;
    @RequestMapping("/user")
    public List<User> getUserList(){
        List<User> userList = userService.getUserList();
        return userList;
    }
}
