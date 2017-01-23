package ru.levelup.java1.lesson3.homework;

/**
 * Created by anton on 23.01.2017.
 */
public class Homework {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }

        //четные числа из массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        //четные х2, нечет = 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] * 2);
            } else {
                System.out.println("0");
            }
        }
        //минимальное число
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println(min);
            }
        }
        System.out.println(min);

        //инверсия
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("__________________");
        for (int i = 0; i < array.length / 2; i++) {

            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //пузырьковая сортировка
        int swapCounter = 1;
        while (swapCounter == 1) {
            swapCounter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapCounter = 1;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }

        }
        System.out.println("___________");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
