package com.tms.lesson4;

import java.util.Arrays;

class ArraysA {
    private int[] arr;

    public ArraysA(int[] arrInt) {
        this.arr = arrInt;
    }

    public void arrIndex(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println(i);
            }
        }
    }

    private void arrSort() {
        Arrays.sort(arr);

    }

    public void arrMax() {
        arrSort();
        System.out.println(arr[arr.length - 1]);
    }

    public void arrMin() {
        arrSort();
        System.out.println(arr[0]);
    }
}