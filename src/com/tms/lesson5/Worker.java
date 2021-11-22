package com.tms.lesson5;

import java.util.Arrays;

public class Worker extends Employee{
    public Worker(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName, experience, basSalary);
    }

    @Override
    void Position() {
        setPosition(POSITION.WORKER);
    }

    @Override
    public String toString() {
        return ": {" +
                 firstName + '\'' +
                " " + secondName + '\'' + " Salary " + getFullSalary() + " Experience " + getExperience() + " years " +
                '}';
    }
}