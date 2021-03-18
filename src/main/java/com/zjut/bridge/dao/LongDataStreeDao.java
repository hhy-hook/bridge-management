package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataStree;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface LongDataStreeDao {
    int deleteByPrimaryKey(Date longDataStreeDate);

    int insert(LongDataStree record);

    int insertSelective(LongDataStree record);

    LongDataStree selectByPrimaryKey(Date longDataStreeDate);

    int updateByPrimaryKeySelective(LongDataStree record);

    int updateByPrimaryKey(LongDataStree record);
}