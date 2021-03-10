package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.service.ControllerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

@Controller
@RequestMapping("/controller")
@SessionAttributes("user")
public class ControllerController {
    @Resource
    ControllerService controllerService;

    @RequestMapping("exit")
    String exit(){
        return "/index";
    }

    @RequestMapping("login")
    String login(com.zjut.bridge.pojo.entity.Controller controller,Model model){
        if("".equals(controller.getControllerAccount()) || controller.getControllerAccount() == null ){
            model.addAttribute("errorMsg","请输入账号!");
            return "/index";
        }

        boolean loginResult = controllerService.login(controller);

        if(loginResult){
            model.addAttribute("successMsg","登录成功");
            com.zjut.bridge.pojo.entity.Controller db = controllerService.selectByAccount(controller.getControllerAccount());
            model.addAttribute("user",db);
            return "/controller/c_bridge";
        }
        model.addAttribute("errorMsg","手机号或密码输入错误!");
        return "/index";
    }

    @RequestMapping("modifyController")
    String modifyController(com.zjut.bridge.pojo.entity.Controller controller,Model model){
        JSONObject json = controllerService.modifyController(controller);
        if(json.get("msg").equals("success")){
            com.zjut.bridge.pojo.entity.Controller dbuser = controllerService.selectByPrimaryKey(controller.getControllerId());
            model.addAttribute("user",dbuser);
            model.addAttribute("msg","修改用户成功!");
        }else{
            model.addAttribute("msg","修改用户失败!");
        }
        return "controller/c_self";
    }

    @RequestMapping("front/c_bridge")
    String c_bridge(){ return "/controller/c_bridge"; }

    @RequestMapping("front/c_alert_history")
    String c_alert_history(){
        return "/controller/c_alert_history";
    }

    @RequestMapping("front/c_bridge_details")
    String c_bridge_details(){
        return "/controller/c_bridge_details";
    }

    @RequestMapping("front/c_message")
    String c_message(){
        return "/controller/c_message";
    }

    @RequestMapping("front/c_inspector")
    String c_inspector(Model model){ return "/controller/c_inspector"; }

    @RequestMapping("front/c_add_i")
    String c_add_i(){
        return "/controller/c_add_i";
    }

    @RequestMapping("front/c_self")
    String c_self(){
        return "/controller/c_self";
    }

    @RequestMapping("front/bridge")
    String bridge(){return "/controller/bridge_test";}
}
