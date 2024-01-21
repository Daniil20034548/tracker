package ru.tracker;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[size];
        int size1 = 0;
        for (int i = 0; i < size; i++) {
                if (Objects.equals(items.get(i).getName(), key)) {
                    copy[size1++] = items.get(i);
                }
            }
        return Arrays.copyOf(copy, size1);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            return true;
        }
        return false;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index <= size && index >= 0) {
            items.set(size - 1, null);
            size--;
        }
    }
}