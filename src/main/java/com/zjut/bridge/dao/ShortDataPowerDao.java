package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataPower;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface ShortDataPowerDao {
    int deleteByPrimaryKey(Date shortDataPowerDate);

    int insert(ShortDataPower record);

    int insertSelective(ShortDataPower record);

    ShortDataPower selectByPrimaryKey(Date shortDataPowerDate);

    int updateByPrimaryKeySelective(ShortDataPower record);

    int updateByPrimaryKey(ShortDataPower record);
}