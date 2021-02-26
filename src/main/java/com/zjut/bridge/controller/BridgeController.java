package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.service.BridgeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/bridge")
public class BridgeController {

    @Resource
    BridgeService bridgeService;

    @ResponseBody
    @RequestMapping("data/bridges")
    public JSONObject bridges(){
        JSONObject json = new JSONObject();
        List<Bridge> db = bridgeService.selectBridges();

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
