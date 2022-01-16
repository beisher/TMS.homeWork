package com.tms.lesson11Threads;

import java.util.ArrayList;

public class DeleteService extends Thread{
    private ArrayList arr;

    public DeleteService(ArrayList arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        while(arr.size() >= 0){
            try {
                Thread.sleep(800);
                arr.remove(arr.size()-1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Удаление : " + arr.toString());
            if (arr.size() == 0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}