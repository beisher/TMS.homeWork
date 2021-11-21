package com.tms.lesson5;

import java.util.Arrays;

public class Director extends Worker {
    public Director(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName, experience, basSalary);
    }

    Worker[] workers = null;


    public void Position() {
        setPosition(POSITION.DIRECTOR);
        System.out.println("Назначен : " + getPosition());
    }

    public void addWorker(Worker worker) {
        if (worker == null) {
            workers = new Worker[0];
            workers[0] = worker;
        } else {
            workers = Arrays.copyOf(workers, workers.length + 1);
            workers[workers.length - 1] = worker;
        }
    }
}

