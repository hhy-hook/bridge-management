package com.zjut.bridge.service.impl;

import com.zjut.bridge.dao.BridgeDao;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.service.BridgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BridgeServiceImpl implements BridgeService {

    @Resource
    BridgeDao bridgeDao;

    @Override
    public List<Bridge> selectBridges() {
        return bridgeDao.selectBridges();
    }
}
