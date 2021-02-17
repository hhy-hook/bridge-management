package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataSettlement;

public interface LongDataSettlementDao {
    int deleteByPrimaryKey(Integer longDataSettlementId);

    int insert(LongDataSettlement record);

    int insertSelective(LongDataSettlement record);

    LongDataSettlement selectByPrimaryKey(Integer longDataSettlementId);

    int updateByPrimaryKeySelective(LongDataSettlement record);

    int updateByPrimaryKey(LongDataSettlement record);
}