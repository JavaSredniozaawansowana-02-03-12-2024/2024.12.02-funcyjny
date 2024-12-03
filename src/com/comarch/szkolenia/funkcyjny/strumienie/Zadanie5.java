package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Janusz", "Kowalski", 3000, "LOW"));
        list.add(new Employee(2, "Karol", "Malinowski", 3300, "LOW"));
        list.add(new Employee(3, "Mateusz", "Bereda", 3600, "LOW"));
        list.add(new Employee(4, "Wiesiek", "Kowalski", 3900, "MID"));
        list.add(new Employee(5, "Zbyszek", "Malinowski", 4200, "LOW"));
        list.add(new Employee(6, "Ferdek", "Kiepski", 4500, "MID"));
        list.add(new Employee(7, "Pawel", "Kowalski", 4800, "HIGH"));
        list.add(new Employee(8, "Patryk", "Malinowski", 4900, "MID"));
        list.add(new Employee(9, "Bogdan", "Kiepski", 5400, "HIGH"));

        /*
        Napisz strumień który wypisuje ID kazdego pracownika średniego szczebla zarabiającego
        między 4000 - 5000 zmieniając przy okazji jego płacę na 4800
         */

        System.out.println(list);
    }
}
