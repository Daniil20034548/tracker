package ru.poly;

public class Bus implements Transport {

    @Override
    public int drive() {
        int speed = 50;
        return speed;
    }

    @Override
    public int passenger(int passengers) {
        passengers = 30;
        return passengers;
    }

    @Override
    public void refuel(int refuel) {
        final int PRISE = 50;
        refuel *= PRISE;
    }
}
