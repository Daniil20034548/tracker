package ru.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String texts : text) {
            if (!check.contains(texts)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
