package com.comarch.szkolenia.funkcyjny.funkcyjny;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class App2 {
    public static void main(String[] args) {
        loadAndCalculate(App2::loadDataFromDB, App2::calculate1);
        loadAndCalculate(App2::loadDataFromFile, App2::calculate3);
        loadAndCalculate(App2::loadDataFromInternet, App2::calculate2);
        loadAndCalculate(App2::loadDataFromFile, App2::calculate1);
    }

    public static int loadDataFromDB() {
        return 3;
    }

    public static int loadDataFromFile() {
        return 4;
    }

    public static int loadDataFromInternet() {
        return 5;
    }

    public static void calculate1(int x) {
        System.out.println(x * 3);
    }

    public static void calculate2(int x) {
        System.out.println(x * 4);
    }

    public static void calculate3(int x) {
        System.out.println(x * 5);
    }

    public static void loadAndCalculate(Supplier<Integer> loader, Consumer<Integer> calculator) {
        int x = loader.get();
        calculator.accept(x);
    }
}
