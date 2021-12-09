package com.tms.lesson9Stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Family family1 = new Family("Ivanovy", true, 1000, Arrays.asList(
                new Child("Petya", 10, SEX.MAN),
                new Child("Katya", 15, SEX.WOMAN),
                new Child("Olya", 20, SEX.WOMAN)
        ));

        Family family2 = new Family("Sidorovy", false, 5000, Arrays.asList(
                new Child("Katya2", 5, SEX.WOMAN),
                new Child("Andrei", 15, SEX.MAN),
                new Child("Ivan", 20, SEX.MAN),
                new Child("Alexander", 20, SEX.MAN)
        ));

        Family family3 = new Family("Chikanovy", true, 2000, Arrays.asList(
                new Child("Evgenii", 2, SEX.MAN),
                new Child("Kolya", 10, SEX.MAN),
                new Child("Ksenia2", 15, SEX.WOMAN),
                new Child("Oksana2", 20, SEX.WOMAN),
                new Child("Milana", 20, SEX.WOMAN)
        ));

        List<Family> families = Arrays.asList(family1, family2, family3);

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getName().contains("2"))
                .forEach(System.out::println);

        System.out.println("------");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getSex().equals(SEX.MAN))
                .forEach(System.out::println);

        System.out.println("------");

        families.stream()
                .filter(family -> family.getChildren().size() > 3)
                .forEach(System.out::println);

        System.out.println("------");

        families.stream()
                .flatMap(family -> family.getChildren().stream())
                .map(child -> child.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("------");

        long count = families.stream()
                .flatMap(family -> family.getChildren().stream())
                .count();
        System.out.println(count);

        Map<String, Integer> fam1 = families.stream()
                .collect(Collectors.toMap(Family::getName, family -> family.getChildren().size()));

        System.out.println("-----");
        fam1.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}