package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.Controller;
import com.zjut.bridge.pojo.entity.Inspector;

public interface ControllerService {
    boolean login(Controller controller);

    Controller selectByAccount(String controllerAccount);

    JSONObject modifyController(Controller controller);

    Controller selectByPrimaryKey(Integer controllerId);
}
