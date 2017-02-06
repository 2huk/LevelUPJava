package ru.levelup.java1.lesson7.src.ru.lvlup.shapes;

/**
 * Created by anton on 03.02.2017.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, int color) {
        this.a = a;
        this.b = b;
        this.c = c;
        setColor(color);
        calcValues();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
        calcValues();
    }

    public void setB(double a) {
        this.b = b;
        calcValues();
    }

    public void setC(double c) {
        this.c = c;
        calcValues();

    }

    private void calcValues() {
        perimiter = a + b + c;
        double p = perimiter / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


}
