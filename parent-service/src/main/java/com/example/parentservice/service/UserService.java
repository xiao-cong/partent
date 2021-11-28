package com.example.parentservice.service;

import com.example.partentmodel.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<User> getUserList();
}
