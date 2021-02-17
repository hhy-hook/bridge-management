package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataSeam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LongDataSeamDao {
    int deleteByPrimaryKey(Integer longDataSeamId);

    int insert(LongDataSeam record);

    int insertSelective(LongDataSeam record);

    LongDataSeam selectByPrimaryKey(Integer longDataSeamId);

    int updateByPrimaryKeySelective(LongDataSeam record);

    int updateByPrimaryKey(LongDataSeam record);
}