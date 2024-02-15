package ru.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> stringOrderHashMap = new HashMap<>();
        for (Order results : orders) {
            stringOrderHashMap.put(results.getNumber(), results);
        }
        return stringOrderHashMap;
    }
}
