package com.comarch.szkolenia.funkcyjny.abstrakcja;

public class FileAlgorytm extends Algorytm {
    @Override
    void loadData() {
        System.out.println("Loading data from file !!!");
    }

    @Override
    void saveData() {
        System.out.println("Saving data to file !!!");
    }
}
