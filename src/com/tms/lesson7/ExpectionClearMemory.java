package com.tms.lesson7;

public class ExpectionClearMemory extends RuntimeException{
    public ExpectionClearMemory(){
        System.out.println("Memory is empty,pls add word!");
    }
}