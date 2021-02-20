package com.zjut.bridge.controller;

import com.zjut.bridge.dao.InspectorDao;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.InspectorService;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    InspectorService inspectorService;

    @RequestMapping("/login")
    //@ResponseBody
    String login(Inspector inspector, Model model){

        if("".equals(inspector.getInspectorAccount()) || inspector.getInspectorAccount() == null ){
            model.addAttribute("errorMsg","请输入账号!");
            return "index";
        }

        boolean loginResult = inspectorService.login(inspector);

        if(loginResult){
            return "home";
        }
        model.addAttribute("errorMsg","手机号或密码输入错误!");
        return "index";
    }
}
