package com.tms.lesson6;

import com.tms.lesson5.Director;
import com.tms.lesson5.Employee;
import com.tms.lesson5.POSITION;
import com.tms.lesson5.Worker;

public class EmployeeFullSearchService implements EmployeeSearch {
    @Override
    public void Search(Employee director, String name) {
        Employee[] worker = director.getWorkers();
        EmployeeSearch search = new EmployeeSearchService();
        for (Employee value : worker) {
            if (value.firstName.equals(name)) {
                System.out.println("Пользователь " + name + " находиться под управлением " + director.firstName + " " + director.secondName);
                break;
            } else if (value.getPosition().equals(POSITION.DIRECTOR)) {
                search.Search(value, name);
            }
        }
    }
}