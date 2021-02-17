package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * warning_record
 * @author 
 */
public class WarningRecord implements Serializable {
    private Integer warningId;

    private Integer bridgeId;

    private Integer warningLevel;

    private String warningPoint;

    private Date warningDate;

    private static final long serialVersionUID = 1L;

    public Integer getWarningId() {
        return warningId;
    }

    public void setWarningId(Integer warningId) {
        this.warningId = warningId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Integer getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
    }

    public String getWarningPoint() {
        return warningPoint;
    }

    public void setWarningPoint(String warningPoint) {
        this.warningPoint = warningPoint;
    }

    public Date getWarningDate() {
        return warningDate;
    }

    public void setWarningDate(Date warningDate) {
        this.warningDate = warningDate;
    }
}