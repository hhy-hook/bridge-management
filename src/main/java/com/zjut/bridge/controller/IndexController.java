package com.zjut.bridge.controller;

import com.zjut.bridge.dao.InspectorDao;
import com.zjut.bridge.pojo.entity.Inspector;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    InspectorDao inspectorDao;
    @RequestMapping("/")
    //@ResponseBody
    String index(){
        Inspector inspector = inspectorDao.selectByPrimaryKey(1);
        return "index";
    }
}
