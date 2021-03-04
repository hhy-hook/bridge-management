package com.zjut.bridge.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.ShortData;
import com.zjut.bridge.service.BridgeService;
import com.zjut.bridge.service.LongDataService;
import com.zjut.bridge.service.ShortDataService;
import com.zjut.bridge.service.WarnService;
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
    @Resource
    LongDataService longDataService;
    @Resource
    ShortDataService shortDataService;
    @Resource
    WarnService warnService;

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

    @ResponseBody
    @RequestMapping("delBridge")
    public JSONObject delBridge(int id){
        JSONObject res1 = bridgeService.delBridge(id);
        JSONObject res2 = longDataService.deleteByBridgeId(id);
        JSONObject res3 = shortDataService.deleteByBridgeId(id);
        JSONObject res4 = warnService.deleteByBridgeId(id);
        JSONObject res = new JSONObject();
        if(res1.get("msg").equals("success") && res2.get("msg").equals("success") &&
        res3.get("msg").equals("success") && res4.get("msg").equals("success")){
            res.put("msg", "success");
            res.put("code", "0");
        }else{
            res.put("msg", "error");
            res.put("code", "201");
        }
        return res;
    }
}
