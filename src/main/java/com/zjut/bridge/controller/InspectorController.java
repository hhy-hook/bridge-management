package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.BridgeService;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/inspector")
@SessionAttributes("user")
public class InspectorController{
    @Resource
    InspectorService inspectorService;

    @Resource
    BridgeService bridgeService;

    @RequestMapping("login")
    String login(Inspector inspector, Model model){

        if("".equals(inspector.getInspectorAccount()) || inspector.getInspectorAccount() == null ){
            model.addAttribute("errorMsg","请输入账号!");
            return "index";
        }

        boolean loginResult = inspectorService.login(inspector);

        if(loginResult){
            model.addAttribute("successMsg","登录成功");
            Inspector db = inspectorService.selectByAccount(inspector.getInspectorAccount());
            model.addAttribute("user",db);
            return "inspector/i_bridge";
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

    @RequestMapping("addReport")
    String addReport(InspectionReport report, MultipartFile pic){
        return "inspector/i_report";
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

    @RequestMapping("front/i_alert_history")
    String i_alert_history(){ return "/inspector/i_alert_history"; }

    @RequestMapping("front/i_bridge")
    String i_bridge(){ return "/inspector/i_bridge"; }

    @RequestMapping("front/i_bridge_details")
    String i_bridge_details(){ return "/inspector/i_bridge_details"; }

    @RequestMapping("front/i_report")
    String i_report(Model model){
        List<Bridge> bridgeList = bridgeService.selectBridges();
        model.addAttribute("bridges",bridgeList);
        return "/inspector/i_report";
    }

    @RequestMapping("front/i_report_history")
    String i_report_history(){ return "/inspector/i_report_history"; }

    @RequestMapping("front/i_self")
    String i_self(){ return "/inspector/i_self"; }
}
