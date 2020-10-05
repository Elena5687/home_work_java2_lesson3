package ru.geekbrains_lesson_3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persson> perssons = new ArrayList<>();
        PhoneBook phoneBook = new PhoneBook();

        perssons.add(new Persson("Pertseva",890358985, "pertseva@mail.ru"));
        perssons.add(new Persson("Ivanov", 896556485, "ivanov@mail.ru"));
        perssons.add(new Persson("Inshakova", 896598573, "inshakova@mail.ru"));
        perssons.add(new Persson("Medvedev", 898576513, "ivanov@ya.ru"));


        ArrayList<String> emails= phoneBook.getEmailBySurname(phoneBook.emailbook(perssons), "Pertseva");
        phoneBook.getPhoneBySurname(phoneBook.phonebook(perssons),"Pertseva");
        System.out.println(emails.get(0));

    }


}
