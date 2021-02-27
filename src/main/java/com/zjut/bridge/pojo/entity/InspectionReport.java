package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * inspection_report
 * @author 
 */
public class InspectionReport implements Serializable {
    private Integer inspectionId;

    private Integer bridgeId;

    private Integer inspectorId;

    private String inspectionNote;

    private Date inspectionDate;

    private String inspectionImg;

    private static final long serialVersionUID = 1L;

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    public String getInspectionNote() {
        return inspectionNote;
    }

    public void setInspectionNote(String inspectionNote) {
        this.inspectionNote = inspectionNote;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionImg() {
        return inspectionImg;
    }

    public void setInspectionImg(String inspectionImg) {
        this.inspectionImg = inspectionImg;
    }
}