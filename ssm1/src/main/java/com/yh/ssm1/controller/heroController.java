package com.yh.ssm1.controller;

import com.yh.ssm1.pojo.hero;
import com.yh.ssm1.service.heroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class heroController {
    @Autowired
    private heroService heroService;
    @RequestMapping("get")
    public List<hero> getAll(){
        return heroService.get();
    }
}
