package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.ShortDataStree;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface ShortDataStreeDao {
    int deleteByPrimaryKey(Date shortDataStreeDate);

    int insert(ShortDataStree record);

    int insertSelective(ShortDataStree record);

    ShortDataStree selectByPrimaryKey(Date shortDataStreeDate);

    int updateByPrimaryKeySelective(ShortDataStree record);

    int updateByPrimaryKey(ShortDataStree record);
}