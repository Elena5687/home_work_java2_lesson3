package ru.geekbrains_lesson_3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String [] words = {"job", "work", "office", "vacancy", "client", "order", "error", "cash", "shop", "boss", "error", "job", "lazy", "solution", "shop", "jealosy", "presenter", "office", "order", "cash", "persson", "client", "animal", "jealosy", "animal",};
        HashMap<String, Integer> array = new HashMap<>();
        for (String x : words){
            array.put(x,array.getOrDefault(x,0) + 1);
        }
        System.out.println(array);
    }
}
