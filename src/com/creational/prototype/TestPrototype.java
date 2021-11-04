package com.creational.prototype;

import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee employee1 = (Employee) employee.clone();
        Employee employee2 = (Employee) employee.clone();

        List<String> list = employee1.getEmplList();
        list.add("John");

        List<String> list1 = employee2.getEmplList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+employee.getEmplList());
        System.out.println("empsNew1 List: "+list);
        System.out.println("empsNew2 List: "+list1);

    }
}
