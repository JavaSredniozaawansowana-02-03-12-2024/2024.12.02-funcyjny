package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "dy", "e", "f", "gy", "yh");

        List<String> result = new ArrayList<>();
        for (String element : list) {
            String newString = element + "y";
            if(!newString.contains("yy")) {
                result.add(newString);
            }
        }
        System.out.println(result);

        System.out.println(
                list.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .toList());
    }
}
