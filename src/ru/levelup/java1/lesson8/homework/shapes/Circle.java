package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Circle extends NoAngle {
    private double radius;

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

    @Override
    protected void calcValues() {
        setS(Math.PI * radius * radius);
        setP(Math.PI * 2 * radius);
    }

}
