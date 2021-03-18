package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.InspectionTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectionTaskDao {
    int deleteByPrimaryKey(Integer taskId);

    int insert(InspectionTask record);

    int insertSelective(InspectionTask record);

    InspectionTask selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(InspectionTask record);

    int updateByPrimaryKey(InspectionTask record);
}