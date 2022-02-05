package com.tms.lesson13JDBC.entity;

public enum SEX {
    MAN,
    WOMAN;

    public static SEX getBoolean(boolean isMan){
        return isMan ? MAN : WOMAN;
    }
}
