package com.zjut.bridge.service.impl;

import com.zjut.bridge.dao.WarningRecordDao;
import com.zjut.bridge.pojo.entity.WarningRecord;
import com.zjut.bridge.service.WarnService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarnServiceImpl implements WarnService {
    @Resource
    WarningRecordDao warningRecordDao;

    @Override
    public List<WarningRecord> selectWarningRecords() {
        return warningRecordDao.selectWarningRecords();
    }
}
