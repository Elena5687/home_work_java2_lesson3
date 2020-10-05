package ru.geekbrains_lesson_3.task2;

import java.util.HashMap;
import java.util.List;

public class Persson {
    private String surname;
    private int phone;
    private String email;

    public Persson(){

    }
    public Persson(String surname, int phone, String email){
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname=surname;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public int getPhone(){return phone;}
    public void setPhone(int phone){this.phone=phone;}



}







