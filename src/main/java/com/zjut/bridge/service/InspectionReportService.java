package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;

import java.util.List;

public interface InspectionReportService {
    public JSONObject addReport(InspectionReport inspectionReport);

    public int selectMaxPrimaryKey();

    List<InspectionReport> selectReports();
}
