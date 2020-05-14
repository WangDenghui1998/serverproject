package com.example.server.service;

import com.example.server.entity.User;
import org.springframework.stereotype.Service;

public interface LoginService {



    public User login(String username,String password);


}
