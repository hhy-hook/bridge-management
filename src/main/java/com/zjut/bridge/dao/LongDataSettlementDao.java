package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.LongDataSettlement;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface LongDataSettlementDao {
    int deleteByPrimaryKey(Date longDataSettlementDate);

    int insert(LongDataSettlement record);

    int insertSelective(LongDataSettlement record);

    LongDataSettlement selectByPrimaryKey(Date longDataSettlementDate);

    int updateByPrimaryKeySelective(LongDataSettlement record);

    int updateByPrimaryKey(LongDataSettlement record);
}