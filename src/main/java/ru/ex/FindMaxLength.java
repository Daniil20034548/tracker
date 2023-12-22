package ru.ex;

public class FindMaxLength {
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (String element : shops) {
            if (element != null) {
                max = element.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}