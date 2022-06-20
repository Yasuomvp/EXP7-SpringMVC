package com.rick.exp7.service.impl;

import com.rick.exp7.dto.User;
import com.rick.exp7.mapper.UserMapper;
import com.rick.exp7.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> selectAllUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public int insertOneUserByParams(String username, String password) {
        return userMapper.insert(new User(null,username,password));
    }


}
