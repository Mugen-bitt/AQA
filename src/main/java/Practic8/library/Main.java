package Practic8.library;

import Practic8.library.exception.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Источник", "Ayn Rand"));
        library.addBook(new Book("Шантарам", "Gregory David Roberts"));
        library.addBook(new Book("Онегин", "Пушкин"));
        //library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("111");
        } catch (BookNotFoundException e) {
            System.out.println("Поймали исключение!");
        }
    }
}
