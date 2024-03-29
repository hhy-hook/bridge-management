package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.WarningRecordDao;
import com.zjut.bridge.pojo.entity.WarningRecord;
import com.zjut.bridge.service.WarnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarnServiceImpl implements WarnService {
    @Resource
    WarningRecordDao warningRecordDao;

    @Override
    public List<WarningRecord> selectWarningRecords() {
        return warningRecordDao.selectWarningRecords();
    }

    @Override
    public JSONObject deleteByBridgeId(int id) {
        JSONObject json = new JSONObject();
        try{
            warningRecordDao.deleteByBridgeId(id);
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
