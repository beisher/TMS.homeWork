package com.tms.lesson4;

public class mainUser {
    public static void main(String[] args) {
        User person1 = new User("Vladislav", "Beisher", 26 , "Belarus", "Zhodino");

        person1.fullNameUser();
        person1.ageUpUser();
        person1.allInfoUser();

    }
}
