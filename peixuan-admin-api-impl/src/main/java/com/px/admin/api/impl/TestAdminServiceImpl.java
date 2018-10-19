package com.px.admin.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.px.admin.api.TestAdminService;
import com.px.admin.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TestAdminServiceImpl implements TestAdminService {
    @Autowired
    ClientDao clientDao;

    @Override
    public String admin() {
        return clientDao.selectByPrimaryKey(1).getPwd();
    }
}
