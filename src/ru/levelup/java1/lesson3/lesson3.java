package ru.levelup.java1.lesson3;

/**
 * Created by anton on 20.01.2017.
 */
public class lesson3 {
    public static void main(String[] args) {
        int a = 250;
        int b = 200;
        int c = 200;

        if (a >= b) {
            if (b >= c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else if (a <= c) {
            System.out.println(a);
        }

        int[] arr = new int[10];
        for (int i = 20, j = 0; i >= 2; i -= 2, j++) {
            arr[j] = i;
            System.out.println(arr[i]);
        }
        System.out.println(arr);


    }
}
