package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionTask;
import com.zjut.bridge.pojo.vo.TaskVO;
import com.zjut.bridge.service.InspectionTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Resource
    InspectionTaskService inspectionTaskService;

    @RequestMapping("addTask")
    String addTask(InspectionTask inspectionTask, Model model){
        /**
         * 添加
         */
        Date current = new Date();
        inspectionTask.setTaskDate(current);
        inspectionTask.setTaskState("未完成");
        JSONObject json = inspectionTaskService.addTask(inspectionTask);
        int id = inspectionTaskService.selectMaxPrimaryKey();
        if(json.get("msg").equals("success")){
            model.addAttribute("msg","添加成功!");
            model.addAttribute("id",id);
        }else{
            model.addAttribute("msg","添加失败!");
        }
        return "/controller/c_job";
    }


    @RequestMapping("data/tasks")
    @ResponseBody
    public JSONObject tasks(int inspectorId){

        JSONObject json = new JSONObject();
        List<TaskVO> db;
        if(inspectorId == -1) db = inspectionTaskService.selectTasks();
        else db = inspectionTaskService.selectTasksByInspectorId(inspectorId);

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
