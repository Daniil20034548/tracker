package ru.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = false;
        if (!(citizens.containsKey(citizen.getPassport()))) {
            citizens.put(citizen.getPassport(), citizen);
            result = true;
        }
        return result;
    }


    public Citizen get(String passport) {
        if (citizens == null) {
            System.out.println("Пасспорт не найден");
        }
        return citizens.get(passport);
    }
}
