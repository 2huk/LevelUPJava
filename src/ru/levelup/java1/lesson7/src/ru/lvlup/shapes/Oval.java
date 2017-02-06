package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Oval extends Circle {
    private double secondaryRadius;

    public Oval() {
        this(1, 1, 0);
    }

    public Oval(double radius, double secondaryRadius, int color) {
        this.radius = radius;
        this.secondaryRadius = secondaryRadius;
        setColor(color);
        calcValues();
    }


    public double getSecondaryRadius() {
        return secondaryRadius;
    }


    public void setSecondaryRadius(double secondaryRadius) {
        this.secondaryRadius = secondaryRadius;
        calcValues();
    }


    private void calcValues() {
        square = Math.PI * radius * secondaryRadius;
        perimiter = 4 * ((Math.PI * radius * secondaryRadius + (radius - secondaryRadius)) / (radius + secondaryRadius));
    }

}
