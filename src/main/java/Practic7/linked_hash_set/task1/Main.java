package Practic7.linked_hash_set.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Иван");
        names.add("Алексей");
        names.add("Георгий");
        names.add("Павел");
        names.add("Мария");
        names.add("Екатерина");

        for (String name : names){
            System.out.println(name);
        }
    }
}
