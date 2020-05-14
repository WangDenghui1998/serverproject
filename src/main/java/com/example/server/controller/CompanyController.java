package com.example.server.controller;


import com.example.server.entity.Company;
import com.example.server.entity.User;
import com.example.server.service.ComPageService;
import com.example.server.util.Msg;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javaws.IconUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.crypto.MacSpi;
import java.util.List;

@RestController
public class CompanyController {

    @Resource
    ComPageService comPageService;

    @RequestMapping(value = "/getcompage",method = RequestMethod.GET)
    public Msg getcompage(@RequestParam(value = "pn",defaultValue = "1") Integer pn,String comname,String teamid,String comid,int province,int state){

        if (comname=="")
            comname=null;
        if (teamid=="")
            teamid=null;
        if (comid=="")
            comid=null;



        Company company = new Company(comname, teamid, comid, province, state);


        List<Company> list=comPageService.getcompage(company);

        PageHelper.startPage(pn,10);


        PageInfo pageInfo=new PageInfo(list);

        if(list.size()!=0)
            return Msg.success().add("pageInfo",pageInfo);
        else
            return Msg.fail();
    }


}
