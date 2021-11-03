package com.tms.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        String[] arr = {"a", "i", "o"};
        String[] array2 = {"b", "c", "v"};
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите число : ");
            String x = s.next();
            for (String item : arr) {
                if (x.equals(item)) {
                    System.out.println(x + " Буква гласная");
                    break;
                }
            }
            for (String value : array2) {
                if (x.equals(value)) {
                    System.out.println(x + " Буква согласная");
                    break;
                }
            }
        }
    }
}













