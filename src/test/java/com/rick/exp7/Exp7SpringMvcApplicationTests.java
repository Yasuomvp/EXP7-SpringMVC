package com.rick.exp7;

import com.rick.exp7.dto.User;
import com.rick.exp7.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Exp7SpringMvcApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        userMapper.insert(new User(null,"leesin","leesin"));
    }

}
