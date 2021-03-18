package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataTemperature;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface ShortDataTemperatureDao {
    int deleteByPrimaryKey(Date shortDataTemperatureDate);

    int insert(ShortDataTemperature record);

    int insertSelective(ShortDataTemperature record);

    ShortDataTemperature selectByPrimaryKey(Date shortDataTemperatureDate);

    int updateByPrimaryKeySelective(ShortDataTemperature record);

    int updateByPrimaryKey(ShortDataTemperature record);
}