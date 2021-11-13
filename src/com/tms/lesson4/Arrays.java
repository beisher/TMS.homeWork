package com.tms.lesson4;

import java.util.Arrays;

class ArraysA {
    public int[] arr;

    public ArraysA(int[] arrInt) {
        this.arr = arrInt;
    }

    public void arrSort() {
        arrSortTest();
    }

    public void arrInt(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                System.out.println(i);
            }
        }
    }

    private void arrSortTest() {
        Arrays.sort(arr);
        String arrString = Arrays.toString(arr);
        System.out.println(arrString);

        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}





