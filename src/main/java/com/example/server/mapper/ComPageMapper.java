package com.example.server.mapper;

import com.example.server.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComPageMapper {


    public List<Company> getCompage(Company company);

}
