package com.comarch.szkolenia.funkcyjny.anonimowe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Mateusz", "Janusz", "Zbyszek", "Adam", "Karol"));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 300));
        cars.add(new Car("BMW", "3", 300));
        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("Kia", "Ceed", 200));
        cars.add(new Car("Audi", "A3", 200));
        cars.add(new Car("Honda", "Civic", 250));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        Collections.sort(cars, Comparator.comparing(Car::getBrand));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println(cars);

        JakisInterfejs obiekt = new JakisInterfejs() {
            @Override
            public void a() {
                System.out.println("a");
            }

            @Override
            public void b() {
                System.out.println("b");
            }

            @Override
            public void c() {
                System.out.println("c");
            }
        };

        obiekt.a();
        obiekt.b();
        obiekt.c();

        KlasaAbstrakcyjna abstrakcyjna = new KlasaAbstrakcyjna(4,7) {
            @Override
            public void print() {
                System.out.println(this.getX() + " " + this.getY());
            }
        };

        System.out.println(abstrakcyjna.getX());
        System.out.println(abstrakcyjna.getY());
        abstrakcyjna.print();

        Car car = new Car("Fiat", "126p", 100) {
            @Override
            public String toString() {
                return this.getBrand() + " " + this.getModel() + " " + this.getPrice();
            }
        };

        System.out.println(cars.get(0));
        System.out.println(car);

        Button button = new Button();
        button.addActionListener(System.out::println);

        App.print(new Car());

        Consumer<Car> carPrinter = c -> System.out.println(c);

        carPrinter.accept(car);
        carPrinter.accept(new Car());
    }

    public static void print(Car car) {
        System.out.println(car);
    }
}
