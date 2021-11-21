package com.tms.lesson5;

public class Worker extends Employee{
    public Worker(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName, experience, basSalary);
    }

    @Override
    void Position() {
        setPosition(POSITION.WORKER);
        System.out.println("Назначен : " + getPosition());
    }
}
