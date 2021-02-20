package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.Inspector;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectorDao {
    int deleteByPrimaryKey(Integer inspectorId);

    int insert(Inspector record);

    int insertSelective(Inspector record);

    Inspector selectByPrimaryKey(Integer inspectorId);

    int updateByPrimaryKeySelective(Inspector record);

    int updateByPrimaryKey(Inspector record);

    Inspector selectByAccount(String account);
}