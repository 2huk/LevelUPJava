package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 03.02.2017.
 */
public abstract class Shape {
    private int color;
    protected double square;
    protected double perimiter;
    private String name;

    public Shape() {
        setName(this.getClass().getSimpleName() + hashCode());

    }

    public int getColor() {
        return color;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimiter() {
        return perimiter;
    }

    public void setColor(int color) {
        this.color = color;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void draw();

    public abstract void calcValues();


}
