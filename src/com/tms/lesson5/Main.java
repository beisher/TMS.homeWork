package com.tms.lesson5;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vladislav","Beisher",2,1000);
        worker1.Position();
        worker1.FullSalaryCalculate();

        Worker worker2 = new Worker("Genadii","Lavrov",1,1000);
        worker2.Position();
        worker2.FullSalaryCalculate();

        Director director1 = new Director("Ivan","Ivanov" ,3,2000);
        director1.Position();
        director1.addWorker(worker1);
        director1.addWorker(worker2);


        Worker worker3 = new Worker("Alexander","Nester",1,1000);
        worker3.Position();
        worker3.FullSalaryCalculate();

        Director director2  = new Director("Dmitrii","Gasanov",2,2000);
        director2.Position();
        director2.addWorker(worker3);
        director2.FullSalaryCalculate();

        director1.addWorker(director2);
        director1.FullSalaryCalculate();
        System.out.println(director1.toString());
    }
}