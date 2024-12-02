package com.comarch.szkolenia.funkcyjny.abstrakcja;

public class KlasaZastepcza implements SimpleInterface {
    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public int getAge() {
        return 10;
    }

    @Override
    public void setAge(int age) {
        System.out.println("Ustawia sie " + age);
    }

    @Override
    public void calculatePesel() {
        System.out.println("Kalkulowanie peselu");
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}
