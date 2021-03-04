package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Bridge;

import java.util.List;

public interface BridgeService {
    List<Bridge> selectBridges();

    JSONObject delBridge(int id);
}