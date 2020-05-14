package com.example.server.mapper;


import com.example.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {


    public User Login(String username,String password);
}
