package com.px.train.api.impl;

import com.px.train.api.TestTrainService;
import com.px.train.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testTrainServiceImpl")
public class TestTrainServiceImpl implements TestTrainService {
    @Autowired
    ClientDao clientDao;

    @Override
    public String train() {
        return clientDao.selectByPrimaryKey(1).getPwd();
    }
}
