package com.tms.lesson1.primitive;

public class zadanie3 {
    public static void main(String[] args) {

        int mem = 2356;
        // тысяч = 2
        // сотен = 3
        // десяток = 5
        // единиц = 6
        int edinici = mem % 10;// единицы
        int desyatki = mem % 100 / 10;
        int sotni = mem % 1000 / 100;
        int tisyachi = mem / 1000;


        System.out.println("тысяч = " + tisyachi);
        System.out.println("сотен = " + sotni);
        System.out.println("десяток = " + desyatki);
        System.out.println("единиц = " + edinici);

    }
}
