package com.tms.lesson3;

public class zadanie2 {
    public static void main(String[] args) {
        int[] arrInt1 = new int[15];
        arrInt1[0] = 1;
        arrInt1[1] = 1;
        for (int i = 2; i < arrInt1.length; i++) {
            arrInt1[i] = arrInt1[i - 1] + arrInt1[i - 2];
        }
        for (int j : arrInt1) {
            System.out.println(j);
        }
    }
}
