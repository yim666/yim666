package com.yh.ssm1.service;

import com.yh.ssm1.dao.heroDao;
import com.yh.ssm1.pojo.hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class heroServiceImpl implements heroService{
    @Autowired
    private heroDao heroDao;


    @Override
    public List<hero> get() {
        return heroDao.get();
    }
}
