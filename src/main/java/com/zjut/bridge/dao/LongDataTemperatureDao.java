package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataTemperature;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LongDataTemperatureDao {
    int deleteByPrimaryKey(Integer longDataTemperatureId);

    int insert(LongDataTemperature record);

    int insertSelective(LongDataTemperature record);

    LongDataTemperature selectByPrimaryKey(Integer longDataTemperatureId);

    int updateByPrimaryKeySelective(LongDataTemperature record);

    int updateByPrimaryKey(LongDataTemperature record);
}