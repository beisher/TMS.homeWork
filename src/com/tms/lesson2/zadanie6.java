package com.tms.lesson2;

public class zadanie6 {
    public static void main(String[] args) {
        int[] arr = new int[]{243, 6, 23, 21, 56, 433, 65,7,5};
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;

            }
        }
        System.out.println(min + " " + max);
    }
}
