package com.tms.lesson3;

public class zadanie4 {
    public static void main(String[] args) {
        int[] arrInt = {6, 7, 6, 6};
        int maxRepeat = 0;
        int number = 0;
        for (int i = 0; i < arrInt.length; i++) {

            int maxNumberRepeat = 0;
            for (int j = 0; j < arrInt.length; j++) {
                if (arrInt[i] == arrInt[j]) {
                    maxNumberRepeat++;
                }
            }
            if (maxRepeat < maxNumberRepeat) {
                maxRepeat = maxNumberRepeat;
                number = arrInt[i];
            }
        }
        System.out.println("Кол-во повторений = " + maxRepeat);
        System.out.println("Число которое повторяется = " + number);
    }
}
