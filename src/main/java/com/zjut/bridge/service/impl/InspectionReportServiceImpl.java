package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.InspectionReportDao;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.service.InspectionReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InspectionReportServiceImpl implements InspectionReportService {

    @Resource
    InspectionReportDao inspectionReportDao;

    @Override
    public JSONObject addReport(InspectionReport inspectionReport) {
        JSONObject json = new JSONObject();
        if(inspectionReportDao.insertSelective(inspectionReport) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }

    @Override
    public int selectMaxPrimaryKey() {
        return inspectionReportDao.selectMaxPrimaryKey();
    }
}
