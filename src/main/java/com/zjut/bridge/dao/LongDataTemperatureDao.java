package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataTemperature;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface LongDataTemperatureDao {
    int deleteByPrimaryKey(Date longDataTemperatureDate);

    int insert(LongDataTemperature record);

    int insertSelective(LongDataTemperature record);

    LongDataTemperature selectByPrimaryKey(Date longDataTemperatureDate);

    int updateByPrimaryKeySelective(LongDataTemperature record);

    int updateByPrimaryKey(LongDataTemperature record);
}