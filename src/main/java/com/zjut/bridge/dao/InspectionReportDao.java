package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.InspectionReport;

public interface InspectionReportDao {
    int deleteByPrimaryKey(Integer inspectionId);

    int insert(InspectionReport record);

    int insertSelective(InspectionReport record);

    InspectionReport selectByPrimaryKey(Integer inspectionId);

    int updateByPrimaryKeySelective(InspectionReport record);

    int updateByPrimaryKey(InspectionReport record);
}