package com.ravevhub.comparableAndComparatar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {
        List<EmployeeComparator> list = new ArrayList<>();
        EmployeeComparator employee = new EmployeeComparator(100, "Nikita", "Volkov", 77777);
        EmployeeComparator employee1 = new EmployeeComparator(100, "Ivan", "Azek", 77777);
        EmployeeComparator employee2 = new EmployeeComparator(100, "Ivan", "Before", 77777);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        Collections.sort(list, new idComparator());
    }

}

class EmployeeComparator {
    int id;
    String name;
    String surname;
    int salary;

    public EmployeeComparator(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}

/**
 * Comparator используется для неестественной сортировки
 */
class idComparator implements Comparator<EmployeeComparator> {

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        if(o1.id == o2.id) {
            return 0;
        } else if(o1.id < o2.id) {
            return -1;
        }else {
            return 1;
        }
    }
}

class SalaryComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.salary-o2.salary;
    }
}


