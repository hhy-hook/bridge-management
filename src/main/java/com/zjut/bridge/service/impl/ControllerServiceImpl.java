package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.ControllerDao;
import com.zjut.bridge.pojo.entity.Controller;
import com.zjut.bridge.pojo.entity.Inspector;
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

    @Override
    public Controller selectByAccount(String controllerAccount) {
        return controllerDao.selectByAccount(controllerAccount);
    }

    @Override
    public JSONObject modifyController(Controller controller) {
        JSONObject json = new JSONObject();
        if(controllerDao.updateByPrimaryKeySelective(controller) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }

    @Override
    public Controller selectByPrimaryKey(Integer controllerId) {
        return controllerDao.selectByPrimaryKey(controllerId);
    }
}
