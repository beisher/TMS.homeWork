package com.tms.lesson8;

import java.util.Collections;
import java.util.*;

public class main {
    public static void main(String[] args) {
        User user1 = new User("Alexei", 15, SEX.MAN);
        User user2 = new User("Galina", 27, SEX.WOMAN);
        User user3 = new User("Andrei", 56, SEX.MAN);
        User user4 = new User("Ivan", 24, SEX.MAN);
        User user5 = new User("Aleks", 24, SEX.MAN);
        User user6 = new User("Petr", 22, SEX.MAN);
        User user7 = new User("Olga", 34, SEX.WOMAN);
        User user8 = new User("Evgenia", 24, SEX.WOMAN);

        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);

        Collections.sort(users);
        System.out.println(users);
        System.out.println("--------");

        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
        userSet.add(user6);
        userSet.add(user7);
        userSet.add(user8);

        System.out.println("--------");
        System.out.println(userSet);

        SearchService service = new SearchForName();
        service.search(userSet, "Olga");

        System.out.println("---------");

        PrintService printService = new PrintServiceSex();
        printService.printUsers(users, SEX.WOMAN);

        System.out.println("-------------");

        SortAge sortAge = new SortAgeUsers();
        Collection<User> userCollection = sortAge.sortAgeUser(users);
        System.out.println(userCollection);
    }
}