package com.tms.lesson4;

public class mainArrays {
    public static void main(String[] args) {
        int[] arrayMain = {77, 3, 15, 7, 4, 5, 4, 65, 7};
        int a = 15;
        ArraysA arr1 = new ArraysA(arrayMain);

        arr1.arrIndex(a);
        arr1.arrMin();
        arr1.arrMax();


    }
}
