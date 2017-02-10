package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Oval extends NoAngle {
    private double firstRadius;
    private double secondaryRadius;

    public Oval() {
        this(1, 1, 0);
    }

    public Oval(double firstRadius, double secondaryRadius, int color) {
        this.firstRadius = firstRadius;
        this.secondaryRadius = secondaryRadius;
        setColor(color);
        calcValues();
    }

    public double getFirstRadius() {
        return firstRadius;
    }

    public double getSecondaryRadius() {
        return secondaryRadius;
    }

    public void setFirstRadius(double firstRadius) {
        this.firstRadius = firstRadius;
        calcValues();
    }

    public void setSecondaryRadius(double secondaryRadius) {
        this.secondaryRadius = secondaryRadius;
        calcValues();
    }

    protected void calcValues() {
        s = Math.PI * firstRadius * secondaryRadius;
        p = Math.PI * (firstRadius + secondaryRadius);
    }

}
