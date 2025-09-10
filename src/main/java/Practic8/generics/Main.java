package Practic8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Элемент");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(3);

        Box<Book> boxWithBooks = new Box<>();
        boxWithBooks.setElement(new Book("Книга Элая"));
    }
}
