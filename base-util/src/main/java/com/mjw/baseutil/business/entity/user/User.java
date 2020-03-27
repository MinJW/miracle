package com.mjw.baseutil.business.entity.user;

import java.io.Serializable;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/28 10:54
 * @Version 1.0.0
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -3534162044535382123L;

    private Long userId;
    private String userName;
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
