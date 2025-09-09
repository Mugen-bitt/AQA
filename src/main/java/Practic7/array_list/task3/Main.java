package Practic7.array_list.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Collections");
        words.add("API");
        words.add("AI");

        String longest = "";
        for (String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println("Самая длинная строка: " + longest);
    }
}
