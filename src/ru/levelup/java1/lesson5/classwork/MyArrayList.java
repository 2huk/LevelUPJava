package ru.levelup.java1.lesson5.classwork;

import java.util.ArrayList;

/**
 * Created by anton on 27.01.2017.
 */
public class MyArrayList {
    int[] values = new int[0];

    public void add(int element) {
        if (values == null) {
            values = new int[1];
            values[0] = element;
        } else {
            int[] temp = new int[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = element;
            values = temp;

        }

    }

    public void add(int index, int element) {//+элемент по индексу
        int[] temp = new int[values.length + 1];
        for (int i = 0; i < index; i++) {
            temp[i] = values[i];
        }
        temp[index] = element;
        for (int i = index + 1; i < values.length; i++) {
            temp[i] = values[i];
        }
        values = temp;


    }


    public void remove(int index) {
        int[] temp = new int[values.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = values[i];
        }
        for (int i = index; i < values.length; i++) {
            temp[i - 1] = values[i];
        }
        values = temp;
    }


    public void set(int index, int element) {
        if ((index > values.length - 1) || index < 0) {
            return;
        }
        values[index] = element;
    }

    public int get(int index) {
        return values[index];

    }

    public boolean isEmpty() {
        if (values.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < values.length; i++){
            if (element == values[i]){
                return true;
            }
        }
        return false;

    }

    public void clear() {
        values = new int[0];
    }

    public int size() {
        return values.length;
    }
}
