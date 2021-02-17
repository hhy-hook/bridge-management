package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * long_data
 * @author 
 */
public class LongData implements Serializable {
    private Integer longDataId;

    private Integer longDataStreeId;

    private Integer longDataTemperatureId;

    private Integer longDataSeamId;

    private Integer longDataSettlementId;

    private Integer bridgeId;

    private Date longDataDate;

    private static final long serialVersionUID = 1L;

    public Integer getLongDataId() {
        return longDataId;
    }

    public void setLongDataId(Integer longDataId) {
        this.longDataId = longDataId;
    }

    public Integer getLongDataStreeId() {
        return longDataStreeId;
    }

    public void setLongDataStreeId(Integer longDataStreeId) {
        this.longDataStreeId = longDataStreeId;
    }

    public Integer getLongDataTemperatureId() {
        return longDataTemperatureId;
    }

    public void setLongDataTemperatureId(Integer longDataTemperatureId) {
        this.longDataTemperatureId = longDataTemperatureId;
    }

    public Integer getLongDataSeamId() {
        return longDataSeamId;
    }

    public void setLongDataSeamId(Integer longDataSeamId) {
        this.longDataSeamId = longDataSeamId;
    }

    public Integer getLongDataSettlementId() {
        return longDataSettlementId;
    }

    public void setLongDataSettlementId(Integer longDataSettlementId) {
        this.longDataSettlementId = longDataSettlementId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Date getLongDataDate() {
        return longDataDate;
    }

    public void setLongDataDate(Date longDataDate) {
        this.longDataDate = longDataDate;
    }
}