package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Вам " + status + " лет?");
        System.out.println("Это " + active);
        System.out.println("Вам " + message + " " + status + " лет");
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 15, "действительно");
        Error error2 = new Error(true, 10, "точно");
        error.printInfo();
        error1.printInfo();
        error2.printInfo();
    }
}
