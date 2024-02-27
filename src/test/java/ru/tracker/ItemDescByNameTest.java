package ru.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {

    @Test
    public void whenDescByName() {
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        List<Item> items = new ArrayList<>();
        items.add(item2);
        items.add(item3);
        items.add(item1);
        List<Item> excepted = List.of(item3, item2, item1);
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(excepted);
    }
}