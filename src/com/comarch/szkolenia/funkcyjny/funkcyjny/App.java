package com.comarch.szkolenia.funkcyjny.funkcyjny;

import com.comarch.szkolenia.funkcyjny.anonimowe.Car;

import java.util.Random;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        /*Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Liczba: " + integer;
            }
        };*/

        Function<Integer, String> function = i -> "Liczba: " + i;

        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
        System.out.println(function.apply(30));

        /*UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 17;
            }
        };*/

        UnaryOperator<Integer> unaryOperator = i -> i * 17;

        System.out.println(unaryOperator.apply(2));
        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(14));
        System.out.println(unaryOperator.apply(26));

        /*BiFunction<Integer, String, Boolean> biFunction = new BiFunction<Integer, String, Boolean>() {
            @Override
            public Boolean apply(Integer integer, String string) {
                return string.length() > integer;
            }
        };*/

        BiFunction<Integer, String, Boolean> biFunction = (i, s) -> s.length() > i;

        System.out.println(biFunction.apply(4, "Jan"));
        System.out.println(biFunction.apply(4, "Janusz"));

        /*Predicate<Car> predicate = new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getPrice() > 500;
            }
        };*/

        Predicate<Car> predicate = car -> car.getPrice() > 500;

        System.out.println(predicate.test(new Car("X","Y", 1000)));
        System.out.println(predicate.test(new Car("X","Y", 500)));
        System.out.println(predicate.test(new Car("X","Y", 100)));

        /*Supplier<Car> defualutCarSupplier = new Supplier<Car>() {
            @Override
            public Car get() {
                return new Car("default", "default", -1);
            }
        };*/

        Supplier<Car> defualutCarSupplier = () -> new Car("default", "default", -1);

        System.out.println(defualutCarSupplier.get());
        System.out.println(defualutCarSupplier.get());
        System.out.println(defualutCarSupplier.get());
        System.out.println(defualutCarSupplier.get());

        /*Consumer<Car> consumer = new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                System.out.println(car);
            }
        };*/

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("BMW", "3", 300));
        consumer.accept(defualutCarSupplier.get());

        /*MojInterfejsFunkcyjny mojInterfejsFunkcyjny = new MojInterfejsFunkcyjny() {
            @Override
            public boolean test(int a, int b, int c, int d, int e) {
                return a*b+c > Math.pow(d,e);
            }
        };*/

        MojInterfejsFunkcyjny mojInterfejsFunkcyjny = (a,b,c,d,e) -> a*b+c > Math.pow(d,e);

        System.out.println(mojInterfejsFunkcyjny.test(2,3,4,5,1));

        BiFunction<Integer, Integer, Double> power = Math::pow;

        Function<Integer, Integer> funkcja = i -> {
            Random random = new Random();
            int iterations = random.nextInt(0, i);
            int sum = 0;
            for (int x = 0; x < iterations; x++) {
                sum += random.nextInt(0, i);
            }
            return sum;
        };

        System.out.println(App.cos(6));
        System.out.println(funkcja.apply(6));


        int x = 6;

        Function<Integer, Integer> f = i -> i * x;

        f.apply(5);
        f.apply(5);
    }

    public static Integer cos(int i) {
            Random random = new Random();
            int iterations = random.nextInt(0, i);
            int sum = 0;
            for (int x = 0; x < iterations; x++) {
                sum += random.nextInt(0, i);
            }
            return sum;
    }
}
