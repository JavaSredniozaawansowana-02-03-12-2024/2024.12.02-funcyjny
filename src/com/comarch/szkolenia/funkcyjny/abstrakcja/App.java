package com.comarch.szkolenia.funkcyjny.abstrakcja;

public class App {
    public static void main(String[] args) {
        System.out.println("Poczatek programu !!!");
        SimpleInterface obiekt = new PrawdziwaKlasa();
        obiekt.calculatePesel();
        obiekt.add(3, 5);
        int age = obiekt.getAge();
        if(age < 10) {
            obiekt.setAge(25);
        }
        System.out.println("wiek: " + obiekt.getAge());

        Algorytm algorytm = new DBAlgorytm();
        algorytm.calculate();

        Algorytm algorytm2 = new FileAlgorytm();
        algorytm2.calculate();
    }
}
