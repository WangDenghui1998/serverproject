package com.example.server.service.Impl;

import com.example.server.entity.User;
import com.example.server.mapper.LoginMapper;
import com.example.server.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    LoginMapper loginMapper;
    @Override
    public User login(String username, String password) {
        return loginMapper.Login(username,password);
    }
}
