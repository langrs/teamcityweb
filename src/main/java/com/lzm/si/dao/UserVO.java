package com.lzm.si.dao;

import java.io.Serializable;

public class UserVO implements Serializable{

    private String userNo;
    private String userName;
    private int age;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userNo='" + userNo + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
