package com.tms.lesson2;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner x = new Scanner(System.in);
            System.out.print("Введите месяц : ");
            String h = x.next();

            switch (h) {
                case ("декабрь"):
                case ("январь"):
                case ("февраль"): {
                    System.out.println(h + " относится к зиме!");
                }
                break;
                case ("март"):
                case ("апрель"):
                case ("май"): {
                    System.out.println(h + " относится к весне!");
                }
                break;
                case ("июнь"):
                case ("июль"):
                case ("август"): {
                    System.out.println(h + " относится к лету!");
                }
                break;
                case ("сентябрь"):
                case ("октябрь"):
                case ("ноябрь"): {
                    System.out.println(h + " относится к осени!");
                }
                break;
                default:
                    System.out.println("вы ввели не корректно!");


            }


        }


    }
}
