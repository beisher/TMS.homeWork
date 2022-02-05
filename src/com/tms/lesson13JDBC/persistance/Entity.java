package com.tms.lesson13JDBC.persistance;

import java.util.List;

public interface Entity<T> {
    void save(T entity);

    boolean update(T entity);

    boolean delete(T entity);

    T get(Integer id);

    List<T> getAll();
}