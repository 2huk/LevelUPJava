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
        this.width = width;
        this.height = height;
        setColor(color);
        calcValues();
        setAnglesCount(4);
        setConvex(true);
    }
    protected void setAnglesCount(int anglesCount){
        this.anglesCount = anglesCount;
    }

    protected void setConvex(boolean isConvex){
        this.isConvex = isConvex;
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


    protected void calcValues() {
        s = height * width;
        p = 2 * (height + width);
    }

}
