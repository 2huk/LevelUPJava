package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Circle extends NoAngle {
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
        s = Math.PI * radius * radius;
        p = Math.PI * 2 * radius;
    }

}
