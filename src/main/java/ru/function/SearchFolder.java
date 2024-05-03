package ru.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> predicate) {
        List<Folder> folder = new ArrayList<>();
        for (Folder folders : list) {
            if (predicate.test(folders)) {
                folder.add(folders);
            }
        }
        return folder;
    }
}
