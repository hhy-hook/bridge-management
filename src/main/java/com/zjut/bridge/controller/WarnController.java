package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.WarningRecord;
import com.zjut.bridge.pojo.vo.ReportVO;
import com.zjut.bridge.service.WarnService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/warn")
public class WarnController {

    @Resource
    WarnService warnService;

    @RequestMapping("data/warns")
    @ResponseBody
    public JSONObject warns(){
        JSONObject json = new JSONObject();

        List<WarningRecord> db = warnService.selectWarningRecords();
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
