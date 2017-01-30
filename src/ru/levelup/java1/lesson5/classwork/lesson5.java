package ru.levelup.java1.lesson5.classwork;

import ru.levelup.java1.lesson5.classwork.Contact;

/**
 * Created by anton on 27.01.2017.
 */
public class lesson5 {
    public static void main(String[] ars) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.print(myArrayList.isEmpty());
        for (int i = 0; i < 20; i++) {
            myArrayList.add(i);
        }
        //myArrayList.add(10,999999);
        //myArrayList.set(20,777777777);
        myArrayList.remove(10);
        //myArrayList.set(0,123123);
        System.out.println(myArrayList.contains(22));
        for (int i = 0; i < 19; i++) {
            System.out.println(myArrayList.get(i));
        }




    }
}
