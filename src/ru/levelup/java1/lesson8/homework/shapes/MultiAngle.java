package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public abstract class MultiAngle extends Shape {
    private int anglesCount;
    private boolean isConvex;
    protected MultiAngle(int anglesCount, boolean isConvex){
        this.anglesCount = anglesCount;
        this.isConvex = isConvex;
    }
}
