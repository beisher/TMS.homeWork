package com.tms.lesson13JDBC.entity;

import java.sql.Date;

public class User {
    private int id;
    private String name;
    private SEX sex;
    private Date date;

    public User(int id, String name, SEX sex, Date date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public User(String name, SEX sex, Date date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SEX getSex() {
        return sex;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", date='" + date + '\'' +
                '}';
    }
}