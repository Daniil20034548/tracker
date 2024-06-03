package ru.stream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.generate(() -> 6 - new Random().nextInt(10))
                .limit(10).toList();
        System.out.println("In:");
        numbers.forEach((n) -> System.out.print(n + ", "));
        System.out.println("\nOut:");
        List<Integer> positive = numbers.stream().filter(n -> n < 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
