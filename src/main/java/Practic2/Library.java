package Practic2;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    //Конструктор
    public Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    //Геттер для получения названия книги
    public String getBookTitle() {
        return bookTitle;
    }

    //Сеттер для изменения названия книги
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    //Геттер для получения автора книги
    public String getAuthor() {
        return author;
    }

    //Сеттер для изменения автора
    public void setAuthor(String author) {
        this.author = author;
    }

    //Геттер для получения года издания
    public int getYear() {
        return year;
    }

    //Сеттер для изменения года издания
    public void setYear(int year) {
        this.year = year;
    }

    //Геттер получения категории книги
    public String getCategory() {
        return category;
    }

    //Сеттер для изменения категории книги
    public void setCategory(String category) {
        this.category = category;
    }
}
class LibraryTest {
    public static void main(String[] args){
        Library book = new Library("Гарри Поттер и философский камень", "Джоан Роулинг", 1997, "Фэнтези");

        System.out.println("Название книги: " + book.getBookTitle());
        book.setBookTitle("Гарри Поттер и тайная комната");
        System.out.println("Новое название книги: " + book.getBookTitle());

        book.author = "Джоан Роулинг";
        System.out.println("Автор: " +  book.author);

        book.year = 1998;
        System.out.println("Год издания: " +  book.year);

        book.category = "Фэнтези";
        System.out.println("Категория: " +  book.category);
    }
}
