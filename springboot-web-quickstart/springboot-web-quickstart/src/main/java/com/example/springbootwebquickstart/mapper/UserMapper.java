package com.example.springbootwebquickstart.mapper;

import com.example.springbootwebquickstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
  public List<User> list();
}
