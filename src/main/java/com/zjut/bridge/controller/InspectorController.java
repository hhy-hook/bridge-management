package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/inspector")
public class InspectorController {
    @Resource
    InspectorService inspectorService;

    @RequestMapping("login")
    String login(Inspector inspector, Model model){

        if("".equals(inspector.getInspectorAccount()) || inspector.getInspectorAccount() == null ){
            model.addAttribute("errorMsg","请输入账号!");
            return "index";
        }

        boolean loginResult = inspectorService.login(inspector);

        if(loginResult){
            model.addAttribute("successMsg","登录成功");
            return "controller/c_inspector";
        }
        model.addAttribute("errorMsg","手机号或密码输入错误!");
        return "index";
    }

    @RequestMapping("addInspector")
    String addInspector(Inspector inspector,Model model){
        JSONObject json = inspectorService.addInspector(inspector);
        if(json.get("msg").equals("success")){
            model.addAttribute("msg","添加用户成功!");

        }else{
            model.addAttribute("msg","添加用户失败!");
        }
        return "controller/c_inspector";
    }

    @RequestMapping("data/inspectors")
    @ResponseBody
    public JSONObject inspectors(){

        JSONObject json = new JSONObject();

        List<Inspector> db =inspectorService.selectInspectors();
        if(db == null || db.isEmpty()){
            json.put("msg","error");
            json.put("code","222222");
        }else{
            json.put("msg", "success");
            json.put("code", "0");
            json.put("data", db);
        }
        return json;
    }
}
