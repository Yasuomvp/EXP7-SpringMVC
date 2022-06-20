package com.rick.exp7.controller;


import com.rick.exp7.dto.User;
import com.rick.exp7.service.UserService;
import com.rick.exp7.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
@MapperScan("com.rick.exp7.mapper")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/index")
    public ResultVO handleIndex(){
        return ResultVO.success(Map.of("ping","pong"));
    }

    @GetMapping("/users")
    public ResultVO selectAllUsers(){
        return ResultVO.success(Map.of("userList",userService.selectAllUsers()));
    }

    @GetMapping("/users/{id}")
    public ResultVO selectUserById(@PathVariable Integer id){
        User user = userService.selectById(id);
        if (user==null){
            return ResultVO.error(200,"User Not Found");
        }else{
            return ResultVO.success(Map.of("user",user));
        }
    }

    @PostMapping("/users")
    public ResultVO insertOneUserByParams(@RequestParam String username,@RequestParam String password){
        int i = userService.insertOneUserByParams(username, password);
        if(i==1){
            return ResultVO.success(null);
        }else{
            return ResultVO.error(200,"error");
        }

    }

}
