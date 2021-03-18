package com.zjut.bridge.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * short_data_temperature
 * @author 
 */
public class ShortDataTemperature implements Serializable {
    private Date shortDataTemperatureDate;

    private Integer bridgeId;

    private Float shortDataTemperatureA1;

    private Float shortDataTemperatureA2;

    private Float shortDataTemperatureB1;

    private Float shortDataTemperatureB2;

    private Float shortDataTemperatureC1;

    private Float shortDataTemperatureC2;

    private Float shortDataTemperatureD1;

    private Float shortDataTemperatureD2;

    private String shortDataTemperatureState;

    private static final long serialVersionUID = 1L;

    public Date getShortDataTemperatureDate() {
        return shortDataTemperatureDate;
    }

    public void setShortDataTemperatureDate(Date shortDataTemperatureDate) {
        this.shortDataTemperatureDate = shortDataTemperatureDate;
    }

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public Float getShortDataTemperatureA1() {
        return shortDataTemperatureA1;
    }

    public void setShortDataTemperatureA1(Float shortDataTemperatureA1) {
        this.shortDataTemperatureA1 = shortDataTemperatureA1;
    }

    public Float getShortDataTemperatureA2() {
        return shortDataTemperatureA2;
    }

    public void setShortDataTemperatureA2(Float shortDataTemperatureA2) {
        this.shortDataTemperatureA2 = shortDataTemperatureA2;
    }

    public Float getShortDataTemperatureB1() {
        return shortDataTemperatureB1;
    }

    public void setShortDataTemperatureB1(Float shortDataTemperatureB1) {
        this.shortDataTemperatureB1 = shortDataTemperatureB1;
    }

    public Float getShortDataTemperatureB2() {
        return shortDataTemperatureB2;
    }

    public void setShortDataTemperatureB2(Float shortDataTemperatureB2) {
        this.shortDataTemperatureB2 = shortDataTemperatureB2;
    }

    public Float getShortDataTemperatureC1() {
        return shortDataTemperatureC1;
    }

    public void setShortDataTemperatureC1(Float shortDataTemperatureC1) {
        this.shortDataTemperatureC1 = shortDataTemperatureC1;
    }

    public Float getShortDataTemperatureC2() {
        return shortDataTemperatureC2;
    }

    public void setShortDataTemperatureC2(Float shortDataTemperatureC2) {
        this.shortDataTemperatureC2 = shortDataTemperatureC2;
    }

    public Float getShortDataTemperatureD1() {
        return shortDataTemperatureD1;
    }

    public void setShortDataTemperatureD1(Float shortDataTemperatureD1) {
        this.shortDataTemperatureD1 = shortDataTemperatureD1;
    }

    public Float getShortDataTemperatureD2() {
        return shortDataTemperatureD2;
    }

    public void setShortDataTemperatureD2(Float shortDataTemperatureD2) {
        this.shortDataTemperatureD2 = shortDataTemperatureD2;
    }

    public String getShortDataTemperatureState() {
        return shortDataTemperatureState;
    }

    public void setShortDataTemperatureState(String shortDataTemperatureState) {
        this.shortDataTemperatureState = shortDataTemperatureState;
    }
}