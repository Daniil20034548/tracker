package ru.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Just tasty pizza");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("Just tasty pizza");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("Just tasty pizza");
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
