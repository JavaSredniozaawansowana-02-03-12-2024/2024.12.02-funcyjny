package com.comarch.szkolenia.funkcyjny.abstrakcja;

public class DBAlgorytm extends Algorytm {
    @Override
    void loadData() {
        System.out.println("Loading data from DB !!!");
    }

    @Override
    void saveData() {
        System.out.println("Saving data to DB !!!");
    }
}
