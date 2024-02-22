package ru.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> stringOrderHashMap = new HashMap<>();
        for (Order order : orders) {
            stringOrderHashMap.put(order.getNumber(), order);
        }
        return stringOrderHashMap;
    }
}
