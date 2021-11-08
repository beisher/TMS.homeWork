package com.tms.lesson3;

public class zadanie3 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 4, 10, 6, 10, 8};
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                chet = chet + arr[i];
            }
            else {
                nechet = nechet + arr[i];
            }
            System.out.println("Сумма чисел на четных местах равна = " + chet);
            System.out.println("Сумма чисел на нечетных местах равно = " + nechet);
            if (chet > nechet) {
                System.out.println(chet + " Больше " + nechet + " на : " + (chet - nechet));
            } else if (chet < nechet) {
                System.out.println(chet + " Меньше " + nechet + " на : " + (nechet - chet));
            }
        }
    }
}



