package ru.levelup.java1.lesson6.homework.incapsulation;

/**
 * Created by anton on 27.01.2017.
 */
public class Contact {
    private  String name;// = new String();
    private  String phone;// = new String();
    private  int age;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }



}
