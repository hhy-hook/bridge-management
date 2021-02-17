package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * short_data
 * @author 
 */
public class ShortData implements Serializable {
    private Integer shortDataId;

    private Integer shortDataPowerId;

    private Integer shortDataStreeId;

    private Integer shortDataTemperatureId;

    private Integer bridgeId;

    private Date shortDataDate;

    private static final long serialVersionUID = 1L;

    public Integer getShortDataId() {
        return shortDataId;
    }

    public void setShortDataId(Integer shortDataId) {
        this.shortDataId = shortDataId;
    }

    public Integer getShortDataPowerId() {
        return shortDataPowerId;
    }

    public void setShortDataPowerId(Integer shortDataPowerId) {
        this.shortDataPowerId = shortDataPowerId;
    }

    public Integer getShortDataStreeId() {
        return shortDataStreeId;
    }

    public void setShortDataStreeId(Integer shortDataStreeId) {
        this.shortDataStreeId = shortDataStreeId;
    }

    public Integer getShortDataTemperatureId() {
        return shortDataTemperatureId;
    }

    public void setShortDataTemperatureId(Integer shortDataTemperatureId) {
        this.shortDataTemperatureId = shortDataTemperatureId;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Date getShortDataDate() {
        return shortDataDate;
    }

    public void setShortDataDate(Date shortDataDate) {
        this.shortDataDate = shortDataDate;
    }
}