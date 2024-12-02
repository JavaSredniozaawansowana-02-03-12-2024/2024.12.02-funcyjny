package com.comarch.szkolenia.funkcyjny.abstrakcja;

public class PrawdziwaKlasa implements SimpleInterface {
    private int age;

    @Override
    public void print() {
        System.out.println("Prawdziwe printowanie !!");
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void calculatePesel() {
        algorytm();
        System.out.println("Pesel wyliczony !!");
    }

    @Override
    public void add(int a, int b) {
        System.out.println("Prawdziwa metoda add !!!");
        System.out.println(a+b);
    }

    private void algorytm() {
        System.out.println("Skomplikowany algorym !!!");
    }

    @Override
    public void metodaDomyslna() {
        System.out.println("metoda domyslna w prawidzwj klasie !!!");
    }
}
