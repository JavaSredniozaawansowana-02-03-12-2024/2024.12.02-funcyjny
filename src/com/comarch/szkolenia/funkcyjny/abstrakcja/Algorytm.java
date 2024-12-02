package com.comarch.szkolenia.funkcyjny.abstrakcja;

public abstract class Algorytm {

    public void calculate() {
        loadData();
        step1();
        step2();
        saveData();
    }

    abstract void loadData();

    private void step1() {
        System.out.println("Step 1 !!");
    }

    private void step2() {
        System.out.println("Step 2 !!");
    }

    abstract void saveData();
}
