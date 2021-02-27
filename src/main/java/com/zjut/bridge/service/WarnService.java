package com.zjut.bridge.service;

import com.zjut.bridge.pojo.entity.WarningRecord;

import java.util.List;

public interface WarnService {
    List<WarningRecord> selectWarningRecords();
}
