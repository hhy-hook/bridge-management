package com.zjut.bridge.service;

import com.zjut.bridge.pojo.entity.LongDataStree;

import java.util.List;

public interface LongDataService {
    List<LongDataStree> selectLongDataStreeByBridgeId(int bridgeId);
}
