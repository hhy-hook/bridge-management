package com.zjut.bridge.pojo.vo;

import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.InspectionTask;
import com.zjut.bridge.pojo.entity.Inspector;

public class TaskVO extends InspectionTask {
    private Bridge bridge;

    private Inspector inspector;

    public Bridge getBridge() {
        return bridge;
    }
    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }
    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }
    public Inspector getInspector() {
        return inspector;
    }

    public String getBridgeName() {
        return bridge.getBridgeName();
    }
    public String getInspectorName() {return inspector.getInspectorName();}
    public String getInspectorPhone() {return inspector.getInspectorPhone();}
}
