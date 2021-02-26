package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;

public interface InspectionReportService {
    public JSONObject addReport(InspectionReport inspectionReport);
    public int selectMaxPrimaryKey();
}
