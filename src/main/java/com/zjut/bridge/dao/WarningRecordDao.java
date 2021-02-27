package com.zjut.bridge.dao;

import com.zjut.bridge.pojo.entity.WarningRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarningRecordDao {
    int deleteByPrimaryKey(Integer warningId);

    int insert(WarningRecord record);

    int insertSelective(WarningRecord record);

    WarningRecord selectByPrimaryKey(Integer warningId);

    int updateByPrimaryKeySelective(WarningRecord record);

    int updateByPrimaryKey(WarningRecord record);

    List<WarningRecord> selectWarningRecords();
}