package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataPower;

public interface ShortDataPowerDao {
    int deleteByPrimaryKey(Integer shortDataPowerId);

    int insert(ShortDataPower record);

    int insertSelective(ShortDataPower record);

    ShortDataPower selectByPrimaryKey(Integer shortDataPowerId);

    int updateByPrimaryKeySelective(ShortDataPower record);

    int updateByPrimaryKey(ShortDataPower record);
}