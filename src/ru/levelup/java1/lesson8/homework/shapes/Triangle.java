package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public class Triangle extends MultiAngle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, int color) {
        this.a = a;
        this.b = b;
        this.c = c;
        setColor(color);
        calcValues();
        setAnglesCount(3);
        setConvex(false);
    }

    @Override
    protected void setAnglesCount(int anglesCount) {
        this.anglesCount = anglesCount;
    }

    @Override
    protected void setConvex(boolean isConvex) {
        this.isConvex = isConvex;
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

    @Override
    protected void calcValues() {
        p = a + b + c;
        double per = p / 2;
        s = Math.sqrt(per * (per - a) * (per - b) * (per - c));

    }

}
