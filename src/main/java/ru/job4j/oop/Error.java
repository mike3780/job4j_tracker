package ru.job4j.oop;

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

    public void printError() {
        System.out.println("Состояние ошибки:" + active);
        System.out.println("Статус ошибки:" + status);
        System.out.println("Описание ошибки:" + message);
    }

    public static void main(String[] args) {

        Error error = new Error();
        error.printError();
        Error err = new Error(true, 1, "Не удается найти символ");
        err.printError();
        Error notError = new Error(false, 0, "Ошибок нет");
        notError.printError();
    }

}
