package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.vo.ReportVO;
import com.zjut.bridge.service.InspectionReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Resource
    InspectionReportService inspectionReportService;

    @RequestMapping("addReport")
    String addReport(InspectionReport inspectionReport, Model model){
        Date current = new Date();
        inspectionReport.setInspectionDate(current);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(current));
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

    @RequestMapping("data/reports")
    @ResponseBody
    public JSONObject reports(){

        JSONObject json = new JSONObject();

        List<ReportVO> db = inspectionReportService.selectReports();
        if(db == null || db.isEmpty()){
            json.put("msg","error");
            json.put("code","201");
            json.put("count",0);
        }else{
            json.put("msg", "success");
            json.put("code", "0");
            json.put("count",db.size());
            json.put("data", db);
        }
        return json;
    }
}
