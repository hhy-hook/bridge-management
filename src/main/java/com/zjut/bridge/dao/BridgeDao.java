package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.Bridge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BridgeDao {
    int deleteByPrimaryKey(Integer bridgeId);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer bridgeId);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);

    List<Bridge> selectBridges();
}