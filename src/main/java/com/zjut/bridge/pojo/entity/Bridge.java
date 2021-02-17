package com.zjut.bridge.pojo.entity;

import java.io.Serializable;

/**
 * bridge
 * @author 
 */
public class Bridge implements Serializable {
    private Integer bridgeId;

    private String bridgeName;

    private Float bridgeLength;

    private Float bridgeWidth;

    private String bridgeCompany;

    private String bridgeState;

    private String bridgeNote;

    private static final long serialVersionUID = 1L;

    public Integer getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }

    public Float getBridgeLength() {
        return bridgeLength;
    }

    public void setBridgeLength(Float bridgeLength) {
        this.bridgeLength = bridgeLength;
    }

    public Float getBridgeWidth() {
        return bridgeWidth;
    }

    public void setBridgeWidth(Float bridgeWidth) {
        this.bridgeWidth = bridgeWidth;
    }

    public String getBridgeCompany() {
        return bridgeCompany;
    }

    public void setBridgeCompany(String bridgeCompany) {
        this.bridgeCompany = bridgeCompany;
    }

    public String getBridgeState() {
        return bridgeState;
    }

    public void setBridgeState(String bridgeState) {
        this.bridgeState = bridgeState;
    }

    public String getBridgeNote() {
        return bridgeNote;
    }

    public void setBridgeNote(String bridgeNote) {
        this.bridgeNote = bridgeNote;
    }
}