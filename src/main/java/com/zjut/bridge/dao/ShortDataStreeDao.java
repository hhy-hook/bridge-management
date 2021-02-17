package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataStree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShortDataStreeDao {
    int deleteByPrimaryKey(Integer shortDataStreeId);

    int insert(ShortDataStree record);

    int insertSelective(ShortDataStree record);

    ShortDataStree selectByPrimaryKey(Integer shortDataStreeId);

    int updateByPrimaryKeySelective(ShortDataStree record);

    int updateByPrimaryKey(ShortDataStree record);
}