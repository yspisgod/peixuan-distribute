package com.px.person.api.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.px.person.api.TestService;
import com.px.person.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;



@Service
public class TestServiceImpl implements TestService {
    @Autowired
    ClientDao clientDao;

    @Override
    public String sayHello() {
        return clientDao.selectByPrimaryKey(1).getPwd();
    }
}
