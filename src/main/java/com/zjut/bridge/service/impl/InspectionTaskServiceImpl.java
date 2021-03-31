package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.BridgeDao;
import com.zjut.bridge.dao.InspectionTaskDao;
import com.zjut.bridge.dao.InspectorDao;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.InspectionTask;
import com.zjut.bridge.pojo.entity.Inspector;
import com.zjut.bridge.pojo.vo.TaskVO;
import com.zjut.bridge.service.InspectionTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class InspectionTaskServiceImpl implements InspectionTaskService {

    @Resource
    InspectionTaskDao inspectionTaskDao;
    @Resource
    BridgeDao  bridgeDao;
    @Resource
    InspectorDao inspectorDao;

    @Override
    public List<TaskVO> selectTasks() {
        List<TaskVO> origin = inspectionTaskDao.selectTasks();
        for(TaskVO t : origin){
            Bridge bridge = bridgeDao.selectByPrimaryKey(t.getBridgeId());
            t.setBridge(bridge);
            Inspector inspector = inspectorDao.selectByPrimaryKey(t.getInspectorId());
            t.setInspector(inspector);
        }
        return origin;
    }

    @Override
    public List<TaskVO> selectTasksByInspectorId(int inspectorId) {
        List<TaskVO> origin = inspectionTaskDao.selectTasksByInspectorId(inspectorId);
        for(TaskVO t : origin){
            Bridge bridge = bridgeDao.selectByPrimaryKey(t.getBridgeId());
            t.setBridge(bridge);
            Inspector inspector = inspectorDao.selectByPrimaryKey(t.getInspectorId());
            t.setInspector(inspector);
        }
        return origin;
    }

    @Override
    public int selectMaxPrimaryKey() {
        return inspectionTaskDao.selectMaxPrimaryKey();
    }

    @Override
    public JSONObject addTask(InspectionTask inspectionTask) {
        JSONObject json = new JSONObject();
        if(inspectionTaskDao.insertSelective(inspectionTask) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }
}
