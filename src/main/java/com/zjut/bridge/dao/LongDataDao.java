package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LongDataDao {
    int deleteByPrimaryKey(Integer longDataId);

    int insert(LongData record);

    int insertSelective(LongData record);

    LongData selectByPrimaryKey(Integer longDataId);

    int updateByPrimaryKeySelective(LongData record);

    int updateByPrimaryKey(LongData record);
}