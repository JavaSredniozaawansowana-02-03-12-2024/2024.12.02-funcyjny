package com.comarch.szkolenia.funkcyjny.strumienie;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla")); // 134
        cars.add(new Car("BMW", "3")); // 256
        cars.add(new Car("Kia", "Ceed")); // 467

        cars.stream()
                .peek(car -> car.setBrand("X"))
                .forEach(System.out::println);

        System.out.println(cars);
    }
}
