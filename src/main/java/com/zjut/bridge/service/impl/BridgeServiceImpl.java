package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.BridgeDao;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.service.BridgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BridgeServiceImpl implements BridgeService {

    @Resource
    BridgeDao bridgeDao;

    @Override
    public List<Bridge> selectBridges() {
        return bridgeDao.selectBridges();
    }

    @Override
    public JSONObject delBridge(int id) {
        JSONObject json = new JSONObject();
        if(bridgeDao.deleteByPrimaryKey(id) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","201");
        }
        return json;
    }
}
