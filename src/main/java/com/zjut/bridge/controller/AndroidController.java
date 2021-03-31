package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.pojo.vo.TaskVO;
import com.zjut.bridge.service.InspectionReportService;
import com.zjut.bridge.service.InspectionTaskService;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/as")
public class AndroidController {

    @Resource
    InspectorService inspectorService;

    @Resource
    InspectionReportService inspectionReportService;

    @Resource
    InspectionTaskService inspectionTaskService;

    @RequestMapping("login")
    @ResponseBody
    public JSONObject login(Inspector inspector){
        JSONObject res = new JSONObject();
        if("".equals(inspector.getInspectorAccount()) || inspector.getInspectorAccount() == null ){
            res.put("code", "201");
            res.put("msg","请输入账号!");
            return res;
        }

        boolean loginResult = inspectorService.login(inspector);

        if(loginResult){
            res.put("code","0");
            res.put("msg","登录成功");
            Inspector db = inspectorService.selectByAccount(inspector.getInspectorAccount());
            res.put("user",db);
            return res;
        }
        res.put("code","201");
        res.put("msg","手机号或密码输入错误!");
        return res;
    }

    @RequestMapping("addReport")
    @ResponseBody
    public JSONObject addReport(InspectionReport inspectionReport){
        JSONObject res = new JSONObject();
        Date current = new Date();
        inspectionReport.setInspectionDate(current);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(current));
        JSONObject json = inspectionReportService.addReport(inspectionReport);
        if(json.get("msg").equals("success")){
            res.put("code","0");
            res.put("msg","上传成功");
        }else{
            res.put("code","201");
            res.put("msg","上传失败");
        }
        return res;
    }

    @RequestMapping("taskData")
    @ResponseBody
    public JSONObject taskData(int inspectorId)
    {
        JSONObject res = new JSONObject();
        List<TaskVO> db;
        if(inspectorId == -1) db = inspectionTaskService.selectTasks();
        else db = inspectionTaskService.selectTasksByInspectorId(inspectorId);

        if(db == null) {
            res.put("code","201");
            res.put("msg","查询失败");
        } else {
            res.put("code","0");
            res.put("data",db);
            res.put("msg","查询成功");
        }
        return res;
    }
}
