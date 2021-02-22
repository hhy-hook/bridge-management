package com.zjut.bridge.service.impl;

import com.zjut.bridge.dao.ControllerDao;
import com.zjut.bridge.pojo.entity.Controller;
import com.zjut.bridge.service.ControllerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ControllerServiceImpl implements ControllerService {

    @Resource
    ControllerDao controllerDao;

    @Override
    public boolean login(Controller controller) {
        Controller db = controllerDao.selectByAccount(controller.getControllerAccount());
        if(db == null) {
            return false;
        }else {
            if (controller.getControllerPassword() == null) {
                return false;
            }
            if (controller.getControllerPassword().equals(db.getControllerPassword())){
                return true;
            }
        }
        return false;
    }
}
