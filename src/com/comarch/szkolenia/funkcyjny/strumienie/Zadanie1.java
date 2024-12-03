package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    /*
    chce miec nową liste liczb
    nowa lista liczb ma być bez duplikatow
    chce tylko liczby > 3
    chce tylko liczby < 7
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,7,4,7,2,7,2,6,9,3,3,1,6,9,3,5);

        List<Integer> result = new ArrayList<>();
        for (int element : list) {
            if(element > 3 && element < 7 && !result.contains(element)) {
                result.add(element);
            }
        }
        System.out.println(result);

        List<Integer> result2 = list.stream()
                .filter(x -> x > 3 && x < 7)
                .distinct()
                .toList();
        System.out.println(result2);
    }
}
