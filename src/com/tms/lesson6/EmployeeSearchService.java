package com.tms.lesson6;

import com.tms.lesson5.Director;
import com.tms.lesson5.Employee;
import com.tms.lesson5.Worker;

import java.util.Objects;

public class EmployeeSearchService implements EmployeeSearch {
    @Override
    public void Search(Employee director, String name) {
        Employee[] worker = director.getWorkers();
        Employee result = null;
        for (Employee value : worker) {
            if (value.firstName.equals(name)) {
                result = value;
                System.out.println("Пользователь " + name + " находиться под управлением " + director.firstName + " " + director.secondName);
            }
        }
        if (result == null) {
            System.out.println("Пользоветель не найден");
        }
    }
}