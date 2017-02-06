package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Oval extends Circle {
    private double b;

    public Oval() {
        this(1, 1, 0);
    }

    public Oval(double width, double height, int color) {
        this.a = width;
        this.b = height;
        setColor(color);
        calcValues();
    }


    public double getB() {
        return b;
    }


    public void setB(double height) {
        this.b = height;
        calcValues();
    }


    private void calcValues() {
        square = Math.PI * a * b;
        perimiter = 4 * ((Math.PI * a * b + (a - b)) / (a + b));
    }

}
