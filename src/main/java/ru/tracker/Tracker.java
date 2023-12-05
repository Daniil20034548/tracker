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
        Item[] copy = new Item[items.length];
        int size = 0;
        for (Item cell : items) {
            if (cell != null) {
                copy[size] = cell;
                size++;

            } else {
                break;
            }
        }
        copy = Arrays.copyOf(copy, size);
        return copy;
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[items.length];
        int size = 0;
        for (Item cell : items) {
            if (cell != null) {
                if (Objects.equals(cell.getName(), key)) {
                    copy[size] = cell;
                    size++;
                }
            } else {
                break;
            }
        }
        copy = Arrays.copyOf(copy, size);
        return copy;
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