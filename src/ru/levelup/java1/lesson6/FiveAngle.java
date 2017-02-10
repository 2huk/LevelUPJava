package ru.levelup.java1.lesson6;

import ru.levelup.java1.lesson8.homework.shapes.MultiAngle;

/**
 * Created by anton on 10.02.2017.
 */
public class FiveAngle extends MultiAngle {
    private double a;

    public FiveAngle(){
        this(5,0);
    }

    public FiveAngle(double a,int color) {
        super(5, true);
        this.a = a;
        setColor(color);
        calcValues();
    }


    public double getA() {
        return a;
    }



    public void setA(double a) {
        this.a = a;
        calcValues();
    }



    @Override
    protected void calcValues() {
        setP(a*5);
        setS(a*a*Math.sqrt(25+10*Math.sqrt(5))/4);

    }

}
