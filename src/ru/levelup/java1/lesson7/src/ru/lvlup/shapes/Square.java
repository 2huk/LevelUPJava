package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Square extends Shape {
    protected double a;

    public Square() {
        this(1, 1);
    }


    public Square(double width, int color) {
        this.a = width;
        setColor(color);
        calcValues();
    }

    public double getA() {
        return a;
    }


    public void setA(double width) {
        this.a = width;
        calcValues();
    }


    private void calcValues() {
        square = a * a;
        perimiter = 4 * a;
    }

}
