package com.tms.lesson5;

public class main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Vladislav","Beisher",2,1000);
        System.out.println(worker1.infoPerson());
        worker1.Position();
        worker1.FullSalaryCalculate();
        Worker worker2 = new Worker("Genadii","Lavrov",1,1000);
        System.out.println(worker2.infoPerson());
        worker2.Position();
        worker2.FullSalaryCalculate();

        Director director1 = new Director("Ivan","Ivanov" ,3,2000);
        System.out.println(director1.infoPerson());
        director1.Position();
        director1.addWorker(worker1);
        System.out.println(director1.FullSalaryCalculate());


    }
}
