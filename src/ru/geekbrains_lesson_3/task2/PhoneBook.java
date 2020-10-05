package ru.geekbrains_lesson_3.task2;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    HashMap<String, ArrayList<Persson>> phoneBook = new HashMap<>();

    public ArrayList<String> getEmailBySurname(Map<String, String> map, String surname) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(surname)) {
                arrayList.add(pair.getValue());
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> getPhoneBySurname(Map<String, Integer> map, String surname) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getKey().equals(surname)) {
                arrayList.add(pair.getValue());
            }

        }
        return arrayList;
    }
    public HashMap<String, String> emailbook(java.util.List<Persson> perssons){

        HashMap<String, String> map = new HashMap<>();
        for (Persson persson : perssons){
            System.out.println("surname : "  +persson.getSurname() + " and email : " + persson.getEmail() );
            map.put(persson.getSurname() , persson.getEmail());
        }
        return map;
    }
    public HashMap<String, Integer> phonebook(List<Persson> perssons){
        HashMap<String, Integer> map = new HashMap<>();
        for (Persson persson : perssons){
            System.out.println("surname : "   +persson.getSurname() + " and phone :" + persson.getPhone());
            map.put(persson.getSurname(),persson.getPhone());
        }
        return map;
    }

}






