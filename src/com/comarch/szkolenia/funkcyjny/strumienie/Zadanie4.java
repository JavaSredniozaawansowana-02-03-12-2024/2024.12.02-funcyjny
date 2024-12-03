package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.List;

public class Zadanie4 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "asdklfh",
                "jshd",
                "akjshd",
                "asdDfasd",
                "ASDfasd",
                "asdf asdf",
                "asdfaaas aaaa",
                "asdDF sadf",
                "asdfasd.asdf",
                "asdfADS.asdf",
                "asdf asd.asd",
                "asdfASD asdf.asdf",
                "asdf.asdf.asdf",
                "asdf,asdf",
                "asdf,asdf.asd",
                "asdf,asdf,asdf.dfg.dfgh",
                "asdf,asdf.asdfASD",
                "asdf,asdf.asdfASa asdf");

        String s = "asdfASDasdf";
        s.equals(s.toLowerCase());
        s.contains(" ");
        s.replaceAll("\\.", "");
        s.replaceAll(",", "");

        /*
        policz średnią długość stringów,
        które:
        nie zawierają wielkich liter
        nie zawierają spacji
        mają usunięte kropki
        mają usunięte przecinki
         */
    }
}
