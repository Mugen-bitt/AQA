package Practic8.library.exception;

// Непроверяемый -> RunTimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message){
        super(message);
    }
}
