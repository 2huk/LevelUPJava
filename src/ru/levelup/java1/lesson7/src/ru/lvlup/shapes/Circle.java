package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Circle extends Shape {
    protected double a;

    public Circle() {
        this(1, 1);
    }


    public Circle(double width, int color) {
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
        square = Math.PI * a * a;
        perimiter = Math.PI * 2 * a;
    }

}
