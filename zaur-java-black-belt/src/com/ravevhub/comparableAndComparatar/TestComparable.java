package com.ravevhub.comparableAndComparatar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee = new Employee(100, "Nikita", "Volkov", 77777);
        Employee employee1 = new Employee(100, "Ivan", "Azek", 77777);
        Employee employee2 = new Employee(100, "Ivan", "Before", 77777);
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        Collections.sort(list);
    }

}

class Employee implements Comparable<Employee> { // интерфейс сравнения сложных объектов
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     *
     */
    @Override
    public int compareTo(Employee o) {
//        if(this.id == o.id) {
//            return 0;
//        } else if(this.id < o.id) {
//            return -1;
//        }else {
//            return 1;
//        }
        int res = this.name.compareTo(o.name);
        if(res==0) {
            res=this.surname.compareTo(o.surname);
        }
        return res;

    }
}
