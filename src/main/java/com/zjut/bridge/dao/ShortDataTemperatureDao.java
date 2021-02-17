package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataTemperature;

public interface ShortDataTemperatureDao {
    int deleteByPrimaryKey(Integer shortDataTemperatureId);

    int insert(ShortDataTemperature record);

    int insertSelective(ShortDataTemperature record);

    ShortDataTemperature selectByPrimaryKey(Integer shortDataTemperatureId);

    int updateByPrimaryKeySelective(ShortDataTemperature record);

    int updateByPrimaryKey(ShortDataTemperature record);
}