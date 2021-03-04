package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.ShortDataDao;
import com.zjut.bridge.service.ShortDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShortDataServiceImpl implements ShortDataService {

    @Resource
    ShortDataDao shortDataDao;

    @Override
    public JSONObject deleteByBridgeId(int id) {
        JSONObject json = new JSONObject();
        try{
            shortDataDao.deleteByBridgeId(id);
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
