package ru.levelup.java1.lesson8.uiclasses;

/**
 * Created by anton on 17.02.2017.
 */
public abstract class BaseElement implements Drawable, Moveable, Resizeable {
    protected double posX;
    protected double posY;
    protected double height;
    protected double width;
    protected String padding;
    protected String margin;
    protected int bgColor;
    protected String name;
    protected String title;
    protected boolean hover;



    @Override
    public void draw() {

    }

    @Override
    public void resize(double h, double w) {

    }

    @Override
    public void move(double x, double y) {

    }


}
