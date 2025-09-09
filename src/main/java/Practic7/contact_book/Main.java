package Practic7.contact_book;
//Задача: разработать систему хранения контактов(имя и тел). Имя - ключ. Тел. - значение
// порядок не важен и нудно уметь находить и обновлять контакт

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Никита", 12121);
        contactBook.addContact("Коля", 12121);

        contactBook.printContacts();

        contactBook.updatePhone("Коля", 23232);
        contactBook.printContacts();
    }
}