package com.example.parentdao.mapper;


import com.example.partentmodel.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> getUserList();
}
