package com.example.parentservice.impl;

import com.example.parentdao.mapper.UserDao;
import com.example.parentservice.service.UserService;
import com.example.partentmodel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.getUserList();
        return userList;
    }
}
