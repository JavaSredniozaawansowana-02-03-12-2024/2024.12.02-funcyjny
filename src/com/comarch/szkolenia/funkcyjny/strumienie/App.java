package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,2,4,5,6,0,6,7,1,8,20,9,7,10,15);

        Stream<Integer> stream = list.stream();
        stream
                .filter(x -> x < 7)
                .peek(System.out::println)
                .filter(x -> x > 3)
                .peek(System.out::println)
                .limit(2)
                .forEach(System.out::println);

        list.stream().count();
    }
}
