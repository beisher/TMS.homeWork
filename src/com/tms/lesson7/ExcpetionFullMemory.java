package com.tms.lesson7;

public class ExcpetionFullMemory extends RuntimeException {
    public ExcpetionFullMemory() {
        System.out.println("Memory is full");
    }
}