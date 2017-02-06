package ru.levelup.java1.lesson6.homework.incapsulation;

/**
 * Created by anton on 29.01.2017.
 */
public class MyContactList {
    private Contact[] contacts = new Contact[0];


    public void add(Contact element) {
        if (contacts.length == 0) {
            contacts = new Contact[1];
            contacts[0] = element;
        } else {
            Contact[] temp = new Contact[contacts.length + 1];
            for (int i = 0; i < contacts.length; i++) {
                temp[i] = contacts[i];
            }
            temp[temp.length - 1] = element;
            contacts = temp;

        }

    }

    public void add(int index, Contact element) {//+элемент по индексу
        Contact[] temp = new Contact[contacts.length + 1];
        for (int i = 0; i < index; i++) {
            temp[i] = contacts[i];
        }
        temp[index] = element;
        for (int i = index + 1; i < contacts.length; i++) {
            temp[i] = contacts[i];
        }
        contacts = temp;


    }


    public void remove(int index) {
        Contact[] temp = new Contact[contacts.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = contacts[i];
        }
        for (int i = index; i < contacts.length; i++) {
            temp[i - 1] = contacts[i];
        }
        contacts = temp;
    }


    public void set(int index, Contact element) {
        if ((index > contacts.length - 1) || index < 0) {
            return;
        }
        contacts[index] = element;
    }

    public Contact get(int index) {
        return contacts[index];

    }

    public boolean isEmpty() {
        if (contacts == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(Contact element) {
        for (int i = 0; i < contacts.length; i++) {
            if (element == contacts[i]) {
                return true;
            }
        }
        return false;

    }

    public void clear() {
        contacts = new Contact[0];
    }

    public int size() {
        return contacts.length;
    }
}