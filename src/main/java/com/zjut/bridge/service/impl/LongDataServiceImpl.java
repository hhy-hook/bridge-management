package com.zjut.bridge.service.impl;

import com.zjut.bridge.dao.LongDataStreeDao;
import com.zjut.bridge.pojo.entity.LongDataStree;
import com.zjut.bridge.service.LongDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongDataServiceImpl implements LongDataService {

    @Resource
    LongDataStreeDao longDataStreeDao;

    @Override
    public List<LongDataStree> selectLongDataStreeByBridgeId(int bridgeId) {
        return longDataStreeDao.selectByBridgeId(bridgeId);
    }
}
