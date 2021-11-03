package com.tms.lesson1.primitive;

public class zadanie2 {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 2;
        int num3 = num1 % num2;

        if (num3 == 0) {
            System.out.println("Число делится без остатка");
            System.out.println(num1/num2);
        } else if (num3 > 0) {
            System.out.println("Остаток от деления = " + num3);
            System.out.println("Целая часть от деления = " + num1 / num2);
        }
    }
}
