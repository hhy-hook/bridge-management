package com.zjut.bridge.service;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.pojo.entity.InspectionTask;
import com.zjut.bridge.pojo.vo.TaskVO;

import java.util.List;

public interface InspectionTaskService {
    List<TaskVO> selectTasks();
    List<TaskVO> selectTasksByInspectorId(int inspectorId);
    int selectMaxPrimaryKey();
    JSONObject addTask(InspectionTask inspectionTask);
}
