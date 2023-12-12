package ru.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
    }

    @Override
    public void passenger(int passengers) {
    }

    @Override
    public int refuel(int refuel) {
        return 50 * refuel;
    }
}