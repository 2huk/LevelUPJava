package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Rect extends MultiAngle {
    private double width;
    private double height;

    public Rect() {
        this(1, 1, 0);
    }

    public Rect(double width, double height, int color) {
        super(4,true);
        this.width = width;
        this.height = height;
        setColor(color);
        calcValues();
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        calcValues();
    }

    public void setHeight(double height) {
        this.height = height;
        calcValues();
    }

    @Override
    protected void calcValues() {
        setS(height * width);
        setP(2 * (height + width));
    }

}
