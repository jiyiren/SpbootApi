package com.spbootapi.entity;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2017/7/24 下午3:35
 * @Description
 *
 * 用户实体类
 *
 */

public class User extends BaseEntity {
    private String userName;
    private String password;

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
