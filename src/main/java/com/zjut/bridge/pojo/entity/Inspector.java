package com.zjut.bridge.pojo.entity;

import java.io.Serializable;

/**
 * inspector
 * @author 
 */
public class Inspector implements Serializable {
    private Integer inspectorId;

    private String inspectorAccount;

    private String inspectorPassword;

    private String inspectorName;

    private Byte inspectorSex;

    private String inspectorPhone;

    private String inspectorEmail;

    private Integer inspectorAge;

    private String inspectorAddress;

    private String inspectorImg;

    private static final long serialVersionUID = 1L;

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    public String getInspectorAccount() {
        return inspectorAccount;
    }

    public void setInspectorAccount(String inspectorAccount) {
        this.inspectorAccount = inspectorAccount;
    }

    public String getInspectorPassword() {
        return inspectorPassword;
    }

    public void setInspectorPassword(String inspectorPassword) {
        this.inspectorPassword = inspectorPassword;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public Byte getInspectorSex() {
        return inspectorSex;
    }

    public void setInspectorSex(Byte inspectorSex) {
        this.inspectorSex = inspectorSex;
    }

    public String getInspectorPhone() {
        return inspectorPhone;
    }

    public void setInspectorPhone(String inspectorPhone) {
        this.inspectorPhone = inspectorPhone;
    }

    public String getInspectorEmail() {
        return inspectorEmail;
    }

    public void setInspectorEmail(String inspectorEmail) {
        this.inspectorEmail = inspectorEmail;
    }

    public Integer getInspectorAge() {
        return inspectorAge;
    }

    public void setInspectorAge(Integer inspectorAge) {
        this.inspectorAge = inspectorAge;
    }

    public String getInspectorAddress() {
        return inspectorAddress;
    }

    public void setInspectorAddress(String inspectorAddress) {
        this.inspectorAddress = inspectorAddress;
    }

    public String getInspectorImg() {
        return inspectorImg;
    }

    public void setInspectorImg(String inspectorImg) {
        this.inspectorImg = inspectorImg;
    }
}