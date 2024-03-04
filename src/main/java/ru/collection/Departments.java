package ru.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : departments) {
            String result = "";
            for (String string : value.split("/")) {
                temp.add(result + string);
                result += (string + "/");
            }
        }
        return new ArrayList<>(temp);
    }

    public static void sortAsc(List<String> departments) {
        Collections.sort(departments);
    }

    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}
