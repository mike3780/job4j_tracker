package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book mathematics = new Book("Discrete mathematics", 3);
        Book informatics = new Book("Clean code", 5);
        Book english = new Book("Grammar", 2);
        Book electronics = new Book("Microcontrollers STM32", 4);
        Book[] books = {mathematics, informatics, english, electronics};
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());
        }
        Book tmp;
        tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }

    }
}
