package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShortDataDao {
    int deleteByPrimaryKey(Integer shortDataId);

    int insert(ShortData record);

    int insertSelective(ShortData record);

    ShortData selectByPrimaryKey(Integer shortDataId);

    int updateByPrimaryKeySelective(ShortData record);

    int updateByPrimaryKey(ShortData record);
}