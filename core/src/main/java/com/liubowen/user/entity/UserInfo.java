package com.liubowen.user.entity;

import com.liubowen.common.Gender;

/**
 * @author liubowen
 * @date 2018/2/6 17:32
 * @description
 */
public class UserInfo {

    private long userId;

    private String name;

    private int level;

    private Gender gender;

    public UserInfo() {
    }

    public UserInfo(long userId, String name, int level, Gender gender) {
        this.userId = userId;
        this.name = name;
        this.level = level;
        this.gender = gender;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", gender=" + gender +
                '}';
    }
}
