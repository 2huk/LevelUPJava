package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 06.02.2017.
 */
public class Square extends Shape {
    protected double width;

    public Square() {
        this(1, 1);
    }


    public Square(double width, int color) {
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


    private void calcValues() {
        square = width * width;
        perimiter = 4 * width;
    }

}
