package com.elechen.learn.mybatis.first.po;

import java.util.Date;

/**
 * Created by Incredile on 2016/11/7.
 */


public class User {
    private int id ;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
    private String detail;
    private float score;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getDetail() {
        return detail;
    }

    public float getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setScore(float score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", detail='" + detail + '\'' +
                ", score=" + score +
                '}';
    }
}
