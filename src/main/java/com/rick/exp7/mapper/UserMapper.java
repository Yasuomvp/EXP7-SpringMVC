package com.rick.exp7.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rick.exp7.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

}
