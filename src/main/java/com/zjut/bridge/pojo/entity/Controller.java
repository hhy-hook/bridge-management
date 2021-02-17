package com.zjut.bridge.pojo.entity;

import java.io.Serializable;

/**
 * controller
 * @author 
 */
public class Controller implements Serializable {
    private Integer controllerId;

    private String controllerAccount;

    private String controllerPassword;

    private String controllerName;

    private String controllerPhone;

    private String controllerEmail;

    private Integer controllerAge;

    private String controllerAddress;

    private String controllerImg;

    private static final long serialVersionUID = 1L;

    public Integer getControllerId() {
        return controllerId;
    }

    public void setControllerId(Integer controllerId) {
        this.controllerId = controllerId;
    }

    public String getControllerAccount() {
        return controllerAccount;
    }

    public void setControllerAccount(String controllerAccount) {
        this.controllerAccount = controllerAccount;
    }

    public String getControllerPassword() {
        return controllerPassword;
    }

    public void setControllerPassword(String controllerPassword) {
        this.controllerPassword = controllerPassword;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getControllerPhone() {
        return controllerPhone;
    }

    public void setControllerPhone(String controllerPhone) {
        this.controllerPhone = controllerPhone;
    }

    public String getControllerEmail() {
        return controllerEmail;
    }

    public void setControllerEmail(String controllerEmail) {
        this.controllerEmail = controllerEmail;
    }

    public Integer getControllerAge() {
        return controllerAge;
    }

    public void setControllerAge(Integer controllerAge) {
        this.controllerAge = controllerAge;
    }

    public String getControllerAddress() {
        return controllerAddress;
    }

    public void setControllerAddress(String controllerAddress) {
        this.controllerAddress = controllerAddress;
    }

    public String getControllerImg() {
        return controllerImg;
    }

    public void setControllerImg(String controllerImg) {
        this.controllerImg = controllerImg;
    }
}