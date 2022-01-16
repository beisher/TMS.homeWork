package com.tms.lesson11Threads;

import java.util.ArrayList;

public class AddService extends Thread{
    private ArrayList arr;
    int value = 0;

    public AddService(ArrayList arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while(arr.size() < 10){
            try {
                Thread.sleep(500);
                arr.add(value++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Добавление : "+ arr.toString());
           if(arr.size() == 10){
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}