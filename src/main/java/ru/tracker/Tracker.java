package ru.tracker;


import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[size];
        int size1 = 0;
        for (int i = 0; i < size; i++) {
                if (Objects.equals(items[i].getName(), key)) {
                    copy[size1++] = items[i];
                }
            }
        return Arrays.copyOf(copy, size1);
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
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
            items[index] = item;
            return true;
        }
        return false;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index <= size && index >= 0) {
            System.arraycopy(items, index + 1,
                    items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
    }
}