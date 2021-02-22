package com.zjut.bridge.controller;

import com.zjut.bridge.service.ControllerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/controller")
public class ControllerController {
    @Resource
    ControllerService controllerService;

    @RequestMapping("login")
    String login(){
        return "controller/c_inspector";
    }

    @RequestMapping("front/c_bridge")
    String c_bridge(){ return "controller/c_bridge"; }

    @RequestMapping("front/c_alert_history")
    String c_alert_history(){
        return "controller/c_alert_history";
    }

    @RequestMapping("front/c_bridge_details")
    String c_bridge_details(){
        return "controller/c_bridge_details";
    }

    @RequestMapping("front/c_message")
    String c_message(){
        return "controller/c_message";
    }

    @RequestMapping("front/c_inspector")
    String c_inspector(){
        return "controller/c_inspector";
    }

    @RequestMapping("front/c_add_i")
    String c_add_i(){
        return "controller/c_add_i";
    }
}
