package com.tms.lesson9Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MainArrays {
    public static void main(String[] args) {
        int[] arr = {2,6,2,3,6,10,15,21,66};


        int max = Arrays.stream(arr)
                .sorted().max().getAsInt();
        System.out.println(max);

        int sum = Arrays.stream(arr)
                .filter(value -> value % 2 == 0 )
                .sum();
        System.out.println(sum);

        System.out.println("-------");

       Arrays.stream(arr)
               .skip(5)
               .forEach(System.out::println);
    }
}