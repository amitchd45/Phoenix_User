package com.example.omninos.Models;


public class DataModel {

    public String text;
    public int drawable;

    public DataModel(String t, int d )
    {
        text=t;
        drawable=d;
    }

    public String getText() {
        return text;
    }

    public int getDrawable() {
        return drawable;
    }
}
