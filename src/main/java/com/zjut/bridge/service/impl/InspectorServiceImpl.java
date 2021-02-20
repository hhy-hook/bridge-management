package com.zjut.bridge.service.impl;

import com.zjut.bridge.dao.InspectorDao;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.service.InspectorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InspectorServiceImpl implements InspectorService {

    @Resource
    private InspectorDao inspectorDao;

    @Override
    public boolean login(Inspector inspector) {
        Inspector db = inspectorDao.selectByAccount(inspector.getInspectorAccount());
        if(db == null) {
            return false;
        }else {
            if (inspector.getInspectorPassword() == null) {
                return false;
            }
            if (inspector.getInspectorPassword().equals(db.getInspectorPassword())){
                return true;
            }
        }
        return false;
    }
}
