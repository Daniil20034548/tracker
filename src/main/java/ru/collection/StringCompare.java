package ru.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = Integer.compare(left.length(), right.length());
        int lenght = Math.min(left.length(), right.length());
            for (int i = 0; i < lenght; i++) {
                int compare = Character.compare(left.charAt(i), right.charAt(i));
                if (compare != 0) {
                    result = compare;
                    break;
                }
            }
        return result;
    }
}
