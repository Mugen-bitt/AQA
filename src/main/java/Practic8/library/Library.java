package Practic8.library;
// Библиотека в которой храниться список книг
import Practic8.library.exception.BookNotFoundException;
import Practic8.library.exception.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Добавить книгу
    // Обработка исключения: если мы добавляем сущ книгу, то у нас будет непроверяемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException{
        if (books.contains(book)){
            throw new InvalidBookException("Такая книга уже существует в библиотеке!");
        } else {
            books.add(book);
        }
    }

    // Искать книгу
    // Обработка исключения: если мы не можем найти книгу, то будет проверяемое исключение BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name){
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null){
            throw new BookNotFoundException("Не нашли книгу по имени " + name);
        }
        return foundBook.get();
    }
}



