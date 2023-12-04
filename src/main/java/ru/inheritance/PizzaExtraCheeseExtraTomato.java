package ru.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String EXTRA_TOMATO = " + extra tomato";

    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);
    }

    @Override
    public String name() {
        return super.name() + EXTRA_TOMATO;
    }
}
