package com.mjw.user.dto;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/20 17:26
 * @Version 1.0.0
 **/
public class User {

    private Integer userId;
    private String userName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
