package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.Controller;

public interface ControllerDao {
    int deleteByPrimaryKey(Integer controllerId);

    int insert(Controller record);

    int insertSelective(Controller record);

    Controller selectByPrimaryKey(Integer controllerId);

    int updateByPrimaryKeySelective(Controller record);

    int updateByPrimaryKey(Controller record);
}