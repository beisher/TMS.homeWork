package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Employee {
    public Director(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName, experience, basSalary);
    }

    Employee[] workers = null;

    public void Position() {
        setPosition(POSITION.DIRECTOR);
    }

    public void addWorker(Employee employee) {
        if (workers == null) {
            workers = new Employee[1];
            workers[0] = employee;
        } else {
            workers = Arrays.copyOf(workers, workers.length + 1);
            workers[workers.length - 1] = employee;
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