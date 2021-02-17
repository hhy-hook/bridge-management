package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataStree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LongDataStreeDao {
    int deleteByPrimaryKey(Integer longDataStreeId);

    int insert(LongDataStree record);

    int insertSelective(LongDataStree record);

    LongDataStree selectByPrimaryKey(Integer longDataStreeId);

    int updateByPrimaryKeySelective(LongDataStree record);

    int updateByPrimaryKey(LongDataStree record);
}