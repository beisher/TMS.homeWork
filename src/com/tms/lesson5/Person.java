package com.tms.lesson5;

public class Person {
    public String firstName;
    public String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

   public String infoPerson(){
      return "FirstName and SecondName: " + firstName + " " + secondName;
    }
}