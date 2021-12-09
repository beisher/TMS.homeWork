package com.tms.lesson8;

import java.util.*;

public class SortAgeUsers implements SortAge {
    @Override
    public Collection<User> sortAgeUser(Collection<User> col) {
        List<User> list = new ArrayList<>(col);
        Collections.sort(list);
        return list;
    }
}