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
        setAnglesCount(4);
        setConvex(true);
    }

    @Override
    protected void setAnglesCount(int anglesCount) {
        this.anglesCount = anglesCount;
    }

    @Override
    protected void setConvex(boolean isConvex) {
        this.isConvex = isConvex;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
        calcValues();
    }

    @Override
    protected void calcValues() {
        s = width * width;
        p = 4 * width;
    }

}
