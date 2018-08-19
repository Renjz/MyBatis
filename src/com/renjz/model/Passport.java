package com.renjz.model;

import java.util.Date;

import com.renjz.annotation.Field;

public class Passport {

    @Field("PassportID")
    private int id;
    @Field("LoginName")
    private String userName;
    @Field("RegisterTime")
    private Date registerTime;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the registerTime
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime the registerTime to set
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
