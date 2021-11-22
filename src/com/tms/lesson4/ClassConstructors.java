package com.tms.lesson4;

public class ClassConstructors {
    private String name;
    private int age;
    private boolean heMan;


    public ClassConstructors(String name) {
        this(name, 26);
    }

    public ClassConstructors(String name, int age) {
        this(name, age, true);
    }

    public ClassConstructors(String name, int age, boolean Man) {
        this.name = name;
        this.age = age;
        this.heMan = Man;
    }

    public void text() {
        System.out.println(name + " " + age + " " + heMan);
    }
}