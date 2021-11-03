package com.tms.lesson2;

import javax.swing.*;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите число : ");
            String num = s.nextLine();
            switch (num) {
                case "a":
                case "i":
                case "o": {
                    System.out.println("Буква " + num + " гласная");
                    break;
                }

                case "b":
                case "c":
                case "v": {
                    System.out.println("Буква " + num + " согласная");
                    break;
                }

            }
        }


    }
}
