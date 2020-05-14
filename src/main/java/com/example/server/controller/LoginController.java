package com.example.server.controller;

import com.example.server.entity.User;
import com.example.server.service.LoginService;
import com.example.server.util.Msg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Msg Login(String username,String password){


        User user=loginService.login(username,password);

        if (user!=null)
            return Msg.success().add("userid",user.getId()).add("name",user.getName());
        return Msg.fail();

    }


}
