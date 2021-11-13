package com.tms.lesson4;

public class classConstructors {
    private String name;
    private int age;
    private boolean heMan;


    public classConstructors(String name){
        this(name,26);
    }

    public classConstructors(String name, int age ) {
        this(name,age,true);
    }

    public classConstructors(String name, int age, boolean Man) {
        this.name = name;
        this.age = age;
        this.heMan = Man;

    }
    public void text (){
        System.out.println(name + " " + age + " " + heMan);
    }
}
