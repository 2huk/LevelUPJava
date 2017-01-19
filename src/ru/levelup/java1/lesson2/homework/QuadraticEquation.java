package ru.levelup.java1.lesson2.homework;

import java.io.*;
import java.util.*;

/**
 * Created by anton on 17.01.2017.
 */
public class QuadraticEquation {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;//почему нужно инициалировать переменные сейчас почему нельзя в строке 15?
        double b = 0;
        double c = 0;
        try {
            System.out.print("a = ");
            a = Double.parseDouble(reader.readLine());//вот здесь например, у try catch своя область видимости, у ЛЮБЫХ {}область видимости ограничена, или есть исклюения?
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
            main(null);
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.print("b = ");
            b = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
            main(null);
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.print("c = ");
            c = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
            main(null);
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

        double d = Math.pow(b, 2) - 4 * a * c;
        if ((a == 0.0) && (b == 0.0)) {
            System.out.println("Некорректный ввод");
        } else if (a == 0.0) {
            double x = -c / b;
            System.out.println("Корень уравнения:" + x);
        } else if (d > 0) {
            double x = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения:" + x + ", " + y);
        } else if (d == 0) {
            double x = -b / (2 * a);
            //double y = x;
            System.out.println("Корни уравнения:" + x + ", " + x);
        } else if (d < 0) {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(Math.abs(d)) / (2 * a);
            System.out.println("Корни уравнения:" + real + " + " + "i * " + imaginary + ", " + real + " - " + "i * " + imaginary);
        }


    }

}
