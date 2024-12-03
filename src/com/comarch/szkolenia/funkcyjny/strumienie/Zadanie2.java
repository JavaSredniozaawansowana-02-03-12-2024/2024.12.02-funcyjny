package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,234,675,45,34,564,435,23,435,546,34,524);

        int sum = 0;
        int evenCounter = 0;
        for (int element : list) {
            if(element % 2 == 0) {
                sum += element;
                evenCounter++;
            }
        }
        double avg = ((double) sum) / ((double) evenCounter);
        System.out.println(avg);

        list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);

    }
}
