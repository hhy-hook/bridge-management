package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.Bridge;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BridgeDao {
    int deleteByPrimaryKey(Integer bridgeId);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer bridgeId);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);
}