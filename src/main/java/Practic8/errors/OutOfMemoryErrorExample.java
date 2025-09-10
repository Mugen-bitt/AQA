package Practic8.errors;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new byte[1024 * 1024]); //Добавляет 1 мб в список бесконечно
        }
    }
}

//OutOfMemoryErrorExample - ошибка которую невозможно отловить потому что она связана с исполнением программы
//Такую ошибку мы не отлавливаем