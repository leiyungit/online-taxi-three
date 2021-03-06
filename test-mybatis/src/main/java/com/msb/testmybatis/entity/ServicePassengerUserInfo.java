package com.msb.testmybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class ServicePassengerUserInfo implements Serializable {
    @Override
    public String toString() {
        return "ServicePassengerUserInfo{" +
                "id=" + id +
                ", registerDate=" + registerDate +
                ", passengerPhone='" + passengerPhone + '\'' +
                ", passengerName='" + passengerName + '\'' +
                ", passengerGender=" + passengerGender +
                ", userState=" + userState +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public Byte getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(Byte passengerGender) {
        this.passengerGender = passengerGender;
    }

    public Byte getUserState() {
        return userState;
    }

    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    private static final long serialVersionUID = -6380944281669074664L;

    private Long id;

    /**
     * ????????????
     */
    private Date registerDate;

    /**
     * ???????????????
     */
    private String passengerPhone;

    /**
     * ????????????
     */
    private String passengerName;

    /**
     * ?????????1?????????0??????
     */
    private Byte passengerGender;

    /**
     * ???????????????1????????????0?????????
     */
    private Byte userState;

    private Date createTime;

    private Date updateTime;
}
