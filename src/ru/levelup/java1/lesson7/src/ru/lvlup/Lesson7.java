package ru.levelup.java1.lesson7.src.ru.lvlup;

import ru.levelup.java1.lesson7.src.ru.lvlup.shapes.Oval;
import ru.levelup.java1.lesson7.src.ru.lvlup.shapes.Rectangle;
import ru.levelup.java1.lesson7.src.ru.lvlup.shapes.Square;

/**
 * Created by anton on 03.02.2017.
 */
public class Lesson7 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,20,0);
        rect.setHeight(1000);
        Square sq = new Square();
        Oval oval = new Oval(10,5,0);
        oval.setB(22);
    }
}
