package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 03.02.2017.
 */
public class Rectangle extends Square {
    private double b;
    public Rectangle(){
        this(1,1,0);
    }

    public Rectangle(double width, double height, int color){
        this.a = width;
        this.b = height;
        setColor(color);
        calcValues();
    }


    public double getHeight() {
        return b;
    }



    public void setHeight(double height) {
        this.b = height;
        calcValues();
    }


    private void calcValues() {
        square = a * b;
        perimiter = 2 * (a + b);
    }
}
