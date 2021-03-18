package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataSeam;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface LongDataSeamDao {
    int deleteByPrimaryKey(Date longDataSeamDate);

    int insert(LongDataSeam record);

    int insertSelective(LongDataSeam record);

    LongDataSeam selectByPrimaryKey(Date longDataSeamDate);

    int updateByPrimaryKeySelective(LongDataSeam record);

    int updateByPrimaryKey(LongDataSeam record);
}