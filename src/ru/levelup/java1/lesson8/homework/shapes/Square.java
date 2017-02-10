package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Square extends MultiAngle {
    private double width;

    public Square() {
        this(1, 1);
    }


    public Square(double width, int color) {
        super(4,true);
        this.width = width;
        setColor(color);
        calcValues();
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
        setS(width * width);
        setP(4 * width);
    }

}
