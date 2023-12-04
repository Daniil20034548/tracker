package ru.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String EXTRA_CHEESE = " + extra cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + EXTRA_CHEESE;
    }
}

