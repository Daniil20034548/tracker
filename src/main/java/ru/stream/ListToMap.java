package ru.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ListToMap {
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors
                        .toConcurrentMap(student -> student.getSurname(), student -> student,
                                (student1, student2) -> student1));
    }
}
