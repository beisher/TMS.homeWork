package com.tms.lesson2;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите Exit для выхода :");
            Scanner x = new Scanner(System.in);
            String xx = x.next();
            if (xx.equals("exit")) {
                System.out.println("Вы вышли из программы");
                break;
            }
        }
    }
}
