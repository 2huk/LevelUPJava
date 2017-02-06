package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this(1, 1);
    }


    public Circle(double radius, int color) {
        this.radius = radius;
        setColor(color);
        calcValues();
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
        calcValues();
    }


    private void calcValues() {
        square = Math.PI * radius * radius;
        perimiter = Math.PI * 2 * radius;
    }

}
