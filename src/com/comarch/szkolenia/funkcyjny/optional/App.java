package com.comarch.szkolenia.funkcyjny.optional;

import com.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Optional<Car> carBox = getCarByPrice(1500);
        if(carBox.isPresent()) {
            Car car = carBox.get();
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        Supplier<Car> defaultCarSupplier = () -> new Car("default", "default", 0);

        Car car = carBox.orElseGet(defaultCarSupplier);
        System.out.println(car);

        carBox.ifPresent(c -> System.out.println(c.getBrand() + " " + c.getModel()));
        carBox.ifPresentOrElse(
                c -> System.out.println(c.getBrand() + " " + c.getModel()),
                () -> System.out.println("Nic nie ma !!!"));

        Optional<String> processedCar = carBox.map(c -> car.getBrand());
        /*Optional<String> processedCar;
        if(carBox.isPresent()) {
            Car car2 = carBox.get();
            processedCar = Optional.of(car2.getBrand());
        } else {
            processedCar = Optional.empty();
        }*/

        carBox.orElseThrow(CarProcessingException::new);
    }

    public static Optional<Car> getCarByPrice(int price) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", 300));
        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("Kia", "Ceed", 200));
        cars.add(new Car("Audi", "A3", 200));
        cars.add(new Car("Honda", "Civic", 250));

        for(Car car : cars) {
            if(car.getPrice() == price) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }

    public static Car getRandomCar() {
        return new Car("Cos", "Cos", 100);
    }
}
