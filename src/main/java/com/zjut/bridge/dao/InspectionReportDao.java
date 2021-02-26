package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.InspectionReport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectionReportDao {
    int deleteByPrimaryKey(Integer inspectionId);

    int insert(InspectionReport record);

    int insertSelective(InspectionReport record);

    InspectionReport selectByPrimaryKey(Integer inspectionId);

    int updateByPrimaryKeySelective(InspectionReport record);

    int updateByPrimaryKey(InspectionReport record);

    int selectMaxPrimaryKey();
}