package ru.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        int rst = y;
        return sum(rst) + multiply(rst) + minus(rst) + divide(rst);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(5));
        System.out.println(minus(5));
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.divide(5));
        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.sumAllOperation(10));
    }
}
