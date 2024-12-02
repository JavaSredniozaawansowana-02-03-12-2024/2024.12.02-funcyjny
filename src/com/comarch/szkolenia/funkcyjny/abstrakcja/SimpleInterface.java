package com.comarch.szkolenia.funkcyjny.abstrakcja;

public interface SimpleInterface {
    void print();
    int getAge();
    void setAge(int age);
    void calculatePesel();
    void add(int a, int b);

    default void metodaDomyslna() {
        rzeczy1();
        System.out.println("metoda domyslna !!");
        rzeczy2();
        rzeczy3();
    }

    private void rzeczy1() {
        System.out.println("rzeczy 1");
        // jakies rzeczy 1
    }

    private void rzeczy2() {
        System.out.println("rzeczy 2");
        // jakies rzeczy 2
    }

    private void rzeczy3() {
        System.out.println("rzeczy 3");
        // jakies rzeczy 3
    }
}
