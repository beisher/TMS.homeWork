package com.tms.lesson11Threads;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        AddService addService = new AddService(arr);
        DeleteService deleteService = new DeleteService(arr);

        addService.start();
        deleteService.start();
        System.out.println("----END----");
    }
}