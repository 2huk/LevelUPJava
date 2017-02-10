package ru.levelup.java1.lesson8.homework.shapes;

/**
 * Created by anton on 09.02.2017.
 */
public abstract class MultiAngle extends Shape {
    protected int anglesCount;
    protected boolean isConvex;
    abstract void setAnglesCount(int anglesCount);
    abstract void setConvex(boolean isConvex);
}
