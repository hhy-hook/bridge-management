package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Inspector;

import java.util.List;

public interface InspectorService {
    public boolean login(Inspector inspector);

    public List<Inspector> selectInspectors();

    JSONObject addInspector(Inspector inspector);

    Inspector selectByAccount(String inspectorAccount);

    JSONObject modifyInspector(Inspector inspector);

    Inspector selectByPrimaryKey(Integer inspectorId);
}
