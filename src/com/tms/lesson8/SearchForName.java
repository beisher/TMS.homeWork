package com.tms.lesson8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SearchForName implements SearchService {

    private Collection<User> col;
    private String name;

    @Override
    public void search(Collection<User> col, String name) {
        this.col = col;
        this.name = name;
        for (User next : this.col) {
            if (this.name.equals(next.getName())) {
                System.out.println(next + " найден");            }
        }
    }
}