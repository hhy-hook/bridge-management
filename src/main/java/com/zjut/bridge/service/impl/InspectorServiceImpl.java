package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.InspectorDao;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InspectorServiceImpl implements InspectorService {

    @Resource
    private InspectorDao inspectorDao;

    @Override
    public boolean login(Inspector inspector) {
        Inspector db = inspectorDao.selectByAccount(inspector.getInspectorAccount());
        if(db == null) {
            return false;
        }else {
            if (inspector.getInspectorPassword() == null) {
                return false;
            }
            if (inspector.getInspectorPassword().equals(db.getInspectorPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Inspector> selectInspectors() {
        return inspectorDao.selectInspectors();
    }

    @Override
    public JSONObject addInspector(Inspector inspector) {
        JSONObject json = new JSONObject();
        if(inspectorDao.insertSelective(inspector) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }

    @Override
    public Inspector selectByAccount(String inspectorAccount) {
        return inspectorDao.selectByAccount(inspectorAccount);
    }

    @Override
    public JSONObject modifyInspector(Inspector inspector) {
        JSONObject json = new JSONObject();
        if(inspectorDao.updateByPrimaryKeySelective(inspector) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }

    @Override
    public Inspector selectByPrimaryKey(Integer inspectorId) {
        return inspectorDao.selectByPrimaryKey(inspectorId);
    }

    @Override
    public JSONObject delInspector(int id) {
        JSONObject json = new JSONObject();
        if(inspectorDao.deleteByPrimaryKey(id) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","201");
        }
        return json;
    }
}
