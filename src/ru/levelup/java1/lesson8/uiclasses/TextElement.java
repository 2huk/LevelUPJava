package ru.levelup.java1.lesson8.uiclasses;

/**
 * Created by anton on 17.02.2017.
 */
public abstract class TextElement extends BaseElement {
    private int fontSize;
    private int fontColor;
    private String fontStyle;
    private String fontName;
    private String text;

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontColor() {
        return fontColor;
    }

    public void setFontColor(int fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    TextElement(){
        this.fontSize = 0;
        this.fontColor = 0;
        this.fontStyle = "default";
        this.fontName = "TimesNewRoman";
        this.text = "OK";


    }

}
