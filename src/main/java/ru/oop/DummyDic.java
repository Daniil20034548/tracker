package ru.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String say = dummyDic.engToRus("Hallow");
        System.out.println(say);
    }
}
