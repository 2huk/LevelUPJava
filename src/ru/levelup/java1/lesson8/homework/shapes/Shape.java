package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public abstract class Shape {
    private int color;
    private double s;
    private double p;
    private String name;

    protected Shape() {
        setName(this.getClass().getSimpleName() + hashCode());
    }

    public int getColor() {
        return color;
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }

    protected void setS(double s) {
        this.s = s;
    }

    protected void setP(double p) {
        this.p = p;
    }

    public void setColor(int color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void calcValues();

}
