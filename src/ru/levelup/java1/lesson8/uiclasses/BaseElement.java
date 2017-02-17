package ru.levelup.java1.lesson8.uiclasses;

/**
 * Created by anton on 17.02.2017.
 */
public abstract class BaseElement implements Drawable, Moveable, Resizeable {
    private double posX;
    private double posY;
    private double height;
    private double width;
    private double padding;
    private double margin;
    private int bgColor;
    private String name;
    private String title;
    private boolean hover;

    BaseElement() {
        this.posX = 0;
        this.posY = 0;
        this.height = 0;
        this.width = 0;
        this.padding = 0;
        this.margin = 0;
        this.bgColor = 0;
        this.name = "Name";
        this.title = "Title";
        this.hover = false;

    }


    public double getPosX() {
        return posX;
    }

    protected void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    protected void setPosY(double posY) {
        this.posY = posY;
    }

    public double getHeight() {
        return height;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    public double getPadding() {
        return padding;
    }

    public void setPadding(double padding) {
        this.padding = padding;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHover() {
        return hover;
    }


    @Override
    public void draw() {

    }

    @Override
    public void resize(double h, double w) {
        this.height = h;
        this.width = w;

    }

    @Override
    public void move(double x, double y) {
        this.posX = x;
        this.posY = y;

    }


}
