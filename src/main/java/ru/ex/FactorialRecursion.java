package ru.ex;

public class FactorialRecursion {
    public static int calc(int n) {
        return n > 0 ? calc(n - 1) * n : 1;
    }

    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }
}
