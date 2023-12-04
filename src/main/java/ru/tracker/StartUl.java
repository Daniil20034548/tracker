package ru.tracker;

import java.time.format.DateTimeFormatter;

class StartUl {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
    }
}