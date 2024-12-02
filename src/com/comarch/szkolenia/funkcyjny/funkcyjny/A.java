package com.comarch.szkolenia.funkcyjny.funkcyjny;

import java.util.function.Function;

public class A implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 6;
    }
}
