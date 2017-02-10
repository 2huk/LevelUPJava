package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Square extends MultiAngle {
    protected double width;

    public Square() {
        this(1, 1);
    }


    public Square(double width, int color) {
        this.width = width;
        setColor(color);
        calcValues();
        anglesCount = 4;
        isConvex = true;

    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
        calcValues();
    }

    public void calcValues() {
        s = width * width;
        p = 4 * width;
    }

}
