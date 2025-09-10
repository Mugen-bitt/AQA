package Practic8.library.exception;

// Проверяемый -> Exception (наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
