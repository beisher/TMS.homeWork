package com.tms.lesson3;

import javax.naming.PartialResultException;

public class zadanie1 {
    public static void main(String[] args) {
        int[] arrInt = {3, 5, 3, 1, 10, 20, 19, 25, 10};
        int max = arrInt[0];
        int min = arrInt[0];
        for (int i : arrInt) {
            if (max > i) {
                max = i;
            }
            if (min < i) {
                min = i;
            }
        }
        System.out.println(min + max);
    }
}
