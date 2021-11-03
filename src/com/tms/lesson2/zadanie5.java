package com.tms.lesson2;

import java.util.Scanner;

/*


*/
public class zadanie5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int aa = a.nextInt();
        Scanner b = new Scanner(System.in);
        int bb = b.nextInt();
        int i = 0;

        for (int count = aa; count <= bb; ++count) {
            if (count % 3 == 0) {
                i = i + count;
            }
        }
        System.out.println(i);
    }
}
