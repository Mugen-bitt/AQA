package Practic7.photo_editor;
//Разработать систему отмены последней операции при редактировании фото и добавить новое действие.
//Тут подходит стек.

public class Main {
    public static void main(String[] args) {
        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.addNewAction("Корректировка глаз");
        photoEditor.addNewAction("Корректировка ушей");
        photoEditor.addNewAction("Корректировка носа");
        photoEditor.addNewAction("Корректировка рук");

        photoEditor.printActions();

        photoEditor.undoLastAction();
        photoEditor.undoLastAction();

        photoEditor.printActions();
    }
}
