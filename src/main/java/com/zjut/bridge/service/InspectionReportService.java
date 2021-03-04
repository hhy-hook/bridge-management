package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.vo.ReportVO;

import java.util.List;

public interface InspectionReportService {
    JSONObject addReport(InspectionReport inspectionReport);

    int selectMaxPrimaryKey();

    List<ReportVO> selectReports();

    JSONObject deleteByInspectorId(int id);
}
