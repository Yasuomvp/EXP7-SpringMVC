package com.rick.exp7.service;

import com.rick.exp7.dto.User;

import java.util.List;

public interface UserService {

    List<User> selectAllUsers();

    User selectById(Integer id);

    int insertOneUserByParams(String username,String password);

}
