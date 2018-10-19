package com.px.train.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.px.train.api.TestTrainService;
import com.px.train.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class TestTrainServiceImpl implements TestTrainService {
    @Autowired
    ClientDao clientDao;

    @Override
    public String train() {
        return clientDao.selectByPrimaryKey(1).getPwd();
    }
}
