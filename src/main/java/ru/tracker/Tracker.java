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
        return Arrays.copyOf(this.items, size);
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[items.length];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
                if (Objects.equals(items[i].getName(), key)) {
                    copy[size] = items[i];
                    size++;
                }
            }
        return Arrays.copyOf(copy, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}