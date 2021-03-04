package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.BridgeService;
import com.zjut.bridge.service.InspectionReportService;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/inspector")
@SessionAttributes("user")
public class InspectorController{
    @Resource
    InspectorService inspectorService;

    @Resource
    BridgeService bridgeService;

    @Resource
    InspectionReportService inspectionReportService;

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
        return "/controller/c_inspector";
    }

    @RequestMapping("delInspector")
    @ResponseBody
    public JSONObject delInspector(int id){
        JSONObject res2 = inspectionReportService.deleteByInspectorId(id);
        JSONObject res1 = inspectorService.delInspector(id);
        JSONObject res = new JSONObject();
        if(res1.get("msg").equals("success") && res2.get("msg").equals("success")){
            res.put("msg", "success");
            res.put("code", "0");
        }else{
            res.put("msg", "error");
            res.put("code", "201");
        }
        return res;
    }

    @RequestMapping("modifyInspector")
    String modifyInspector(Inspector inspector,Model model){
        JSONObject json = inspectorService.modifyInspector(inspector);
        if(json.get("msg").equals("success")){
            Inspector dbuser = inspectorService.selectByPrimaryKey(inspector.getInspectorId());
            model.addAttribute("user",dbuser);
            model.addAttribute("msg","修改用户成功!");
        }else{
            model.addAttribute("msg","修改用户失败!");
        }
        return "inspector/i_self";
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
