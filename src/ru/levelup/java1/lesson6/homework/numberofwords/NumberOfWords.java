package ru.levelup.java1.lesson6.homework.numberofwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by anton on 03.02.2017.
 */
public class NumberOfWords {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringToSearch = new String();
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        try {
            System.out.print("Введите необходимый текст\n");
            stringToSearch = reader.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrStr = stringToSearch.split("[^0-9a-zA-Zа-яА-Я]+");
        for (String e : arrStr) {
            e.toLowerCase();
        }
        for (String e : arrStr) {
            if (words.containsKey(e)) {
                words.replace(e, words.get(e) + 1);
            } else {
                words.put(e, 1);
            }
        }
        for (HashMap.Entry entry : words.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
