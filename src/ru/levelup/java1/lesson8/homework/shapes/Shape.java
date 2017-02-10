package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public abstract class Shape {
    private int color;
    protected double s;
    protected double p;
    private String name;

    Shape(){
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
