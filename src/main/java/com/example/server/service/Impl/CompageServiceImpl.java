package com.example.server.service.Impl;

import com.example.server.entity.Company;
import com.example.server.mapper.ComPageMapper;
import com.example.server.service.ComPageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompageServiceImpl implements ComPageService {

    @Resource
    ComPageMapper comPageMapper;

    @Override
    public List<Company> getcompage(Company company) {
        return comPageMapper.getCompage(company);
    }

}
