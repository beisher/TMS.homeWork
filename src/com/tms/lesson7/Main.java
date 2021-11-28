package com.tms.lesson7;

import com.tms.lesson5.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> memory = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово : ");
        for (; ; ) {
            try {
                String s = scanner.nextLine();
                if(s.equals("get")){
                    if(memory.isEmpty()){
                        throw new ExpectionClearMemory();
                    }
                    memory.remove(0);
                }else if(s.equals("exit")){
                    break;
                }
                else {
                    if (memory.size() == 5) {
                        throw new ExcpetionFullMemory();
                    }
                    memory.add(s);
                }
                System.out.println(memory);
            } catch (ExcpetionFullMemory exc) {
                System.out.println("Память заполнена");
            } catch (ExpectionClearMemory exc){
                System.out.println("Массив пустой, нельзя удалить!");
            }
        }
    }
}