package Practic2;

public class Book {
    private String title;
    private String author;

    //Конструктор
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    //Геттер для получения названия книги
    public String getTitle(){
        return title;
    }
    //Геттер для получения автора
    public String getAuthor(){
        return author;
    }
    //Сеттер для изменения названия
    public void setTitle(String title){
        this.title = title;
    }
    //Сеттер для изменения автора
    public void setAuthor(String author){
        this.author = author;
    }
    //Метод printInfo() для вывода инфы о книге
    public void printInfo(){
        System.out.println("Название: " + title + ", Автор: "  + author);
    }


    //Метод main
    public static void main(String[] args){
        Book book = new Book("Гарри Поттер", "Джоан Роулинг");
        book.printInfo();

        book.setAuthor("Д.К. Роулинг");
        book.printInfo();

    }







}
