package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.InspectionReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Resource
    InspectionReportService inspectionReportService;

    @RequestMapping("addReport")
    String addReport(InspectionReport inspectionReport, Model model){
        JSONObject json = inspectionReportService.addReport(inspectionReport);
        int id = inspectionReportService.selectMaxPrimaryKey();
        if(json.get("msg").equals("success")){
            model.addAttribute("msg","添加成功!");
            model.addAttribute("id",id);
        }else{
            model.addAttribute("msg","添加失败!");
        }
        return "redirect:/inspector/front/i_report";
    }

}
