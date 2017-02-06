package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 03.02.2017.
 */
public class Rectangle extends Square {
    private double height;
    public Rectangle(){
        this(1,1,0);
    }

    public Rectangle(double width, double height, int color){
        this.width = width;
        this.height = height;
        setColor(color);
        calcValues();
    }


    public double getHeight() {
        return height;
    }



    public void setHeight(double height) {
        this.height = height;
        calcValues();
    }


    private void calcValues() {
        square = height * width;
        perimiter = 2 * (height + width);
    }
}
