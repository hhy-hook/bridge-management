package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.LongDataDao;
import com.zjut.bridge.service.LongDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LongDataServiceImpl implements LongDataService {

    @Resource
    LongDataDao longDataDao;

    @Override
    public JSONObject deleteByBridgeId(int id) {
        JSONObject json = new JSONObject();
        try{
            longDataDao.deleteByBridgeId(id);
            json.put("msg","success");
            json.put("code","0");
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }
}
