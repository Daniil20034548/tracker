package ru.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> tasks) {
        HashSet<String> number = new HashSet<>();
        for (Task numbers : tasks) {
            number.add(numbers.getNumber());
        }
        return number;
    }
}
