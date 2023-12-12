package ru.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        int speed = 0;
        System.out.println(speed);
    }

    @Override
    public void passenger(int passengers) {
        System.out.println(passengers);
    }

    @Override
    public int refuel(int refuel) {
        return 50 * refuel;
    }
}