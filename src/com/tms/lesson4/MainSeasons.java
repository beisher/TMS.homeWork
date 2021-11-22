package com.tms.lesson4;

public class MainSeasons {
    public static void main(String[] args) {
        MONTHS month = MONTHS.February;

        switch (month) {
            case December:
            case January:
            case February:
                System.out.println("This month is : " + SEASONS.Winter);
                break;
            case March:
            case April:
            case May:
                System.out.println("This month is : " + SEASONS.Spring);
                break;
            case June:
            case July:
            case August:
                System.out.println("This month is : " + SEASONS.Summer);
            case September:
            case October:
            case Novembe:
                System.out.println("This month is : " + SEASONS.Autumn);
                break;
        }
    }
}