package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Worker {
    public Director(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName, experience, basSalary);
    }

    Worker[] workers = null;

    public void Position() {
        setPosition(POSITION.DIRECTOR);
    }

    public void addWorker(Worker worker) {
        if (workers == null) {
            workers = new Worker[1];
            workers[0] = worker;
        } else {
            workers = Arrays.copyOf(workers, workers.length + 1);
            workers[workers.length - 1] = worker;
        }
    }

    public int FullSalaryCalculate() {
        setFullSalary(super.FullSalaryCalculate() * workers.length);
        return getFullSalary();

    }
    @Override
    public String toString() {
        return  firstName + " " + secondName + " : Position " + getPosition() +" , Salary: " + getFullSalary() + " Experience "+ getExperience() + " years " +
                "\n {" +
                "Под управлением директора " + Arrays.toString(workers) +
                '}';
    }
}