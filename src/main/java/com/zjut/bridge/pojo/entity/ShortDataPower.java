package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * short_data_power
 * @author 
 */
public class ShortDataPower implements Serializable {
    private Date shortDataPowerDate;

    private Integer bridgeId;

    private Float shortDataPowerA1;

    private Float shortDataPowerA2;

    private Float shortDataPowerB1;

    private Float shortDataPowerB2;

    private Float shortDataPowerC1;

    private Float shortDataPowerC2;

    private Float shortDataPowerD1;

    private Float shortDataPowerD2;

    private String shortDataPowerState;

    private static final long serialVersionUID = 1L;

    public Date getShortDataPowerDate() {
        return shortDataPowerDate;
    }

    public void setShortDataPowerDate(Date shortDataPowerDate) {
        this.shortDataPowerDate = shortDataPowerDate;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Float getShortDataPowerA1() {
        return shortDataPowerA1;
    }

    public void setShortDataPowerA1(Float shortDataPowerA1) {
        this.shortDataPowerA1 = shortDataPowerA1;
    }

    public Float getShortDataPowerA2() {
        return shortDataPowerA2;
    }

    public void setShortDataPowerA2(Float shortDataPowerA2) {
        this.shortDataPowerA2 = shortDataPowerA2;
    }

    public Float getShortDataPowerB1() {
        return shortDataPowerB1;
    }

    public void setShortDataPowerB1(Float shortDataPowerB1) {
        this.shortDataPowerB1 = shortDataPowerB1;
    }

    public Float getShortDataPowerB2() {
        return shortDataPowerB2;
    }

    public void setShortDataPowerB2(Float shortDataPowerB2) {
        this.shortDataPowerB2 = shortDataPowerB2;
    }

    public Float getShortDataPowerC1() {
        return shortDataPowerC1;
    }

    public void setShortDataPowerC1(Float shortDataPowerC1) {
        this.shortDataPowerC1 = shortDataPowerC1;
    }

    public Float getShortDataPowerC2() {
        return shortDataPowerC2;
    }

    public void setShortDataPowerC2(Float shortDataPowerC2) {
        this.shortDataPowerC2 = shortDataPowerC2;
    }

    public Float getShortDataPowerD1() {
        return shortDataPowerD1;
    }

    public void setShortDataPowerD1(Float shortDataPowerD1) {
        this.shortDataPowerD1 = shortDataPowerD1;
    }

    public Float getShortDataPowerD2() {
        return shortDataPowerD2;
    }

    public void setShortDataPowerD2(Float shortDataPowerD2) {
        this.shortDataPowerD2 = shortDataPowerD2;
    }

    public String getShortDataPowerState() {
        return shortDataPowerState;
    }

    public void setShortDataPowerState(String shortDataPowerState) {
        this.shortDataPowerState = shortDataPowerState;
    }
}