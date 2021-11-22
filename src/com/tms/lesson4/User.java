package com.tms.lesson4;

public class User {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    public User(String nameUser, String secondNameUser, int ageUser, String country, String city) {
        this.firstName = nameUser;
        this.secondName = secondNameUser;
        this.age = ageUser;
        this.address = new Address(country, city);
    }

    public void fullNameUser() {
        System.out.println("Имя Фамилия - " + firstName + " " + secondName);
    }

    public void allInfoUser() {
        System.out.println("Имя пользователя - " + firstName);
        System.out.println("Фамилия пользователя - " + secondName);
        System.out.println("Возраст пользователя - " + age);
        System.out.println("Его пол - " + SEX.Man);
        System.out.println("Адрес пользователя - " + this.address.country + ", " + this.address.city);
    }

    public void ageUpUser() {
        age++;
        System.out.println("Возраст пользователя через год = " + age);
    }

    private static class Address {
        String country;
        String city;

        public Address(String country, String city) {
            this.country = country;
            this.city = city;
        }
    }
}