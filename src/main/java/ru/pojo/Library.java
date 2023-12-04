package ru.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("book1", 200);
        Book book1 = new Book("book2", 500);
        Book book2 = new Book("book3", 100);
        Book book3 = new Book("Clean code", 300);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        Book rs = books[0];
        books[0] = books[2];
        books[2] = rs;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Найти книгу Clean code");
        for (Book bk : books) {
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
