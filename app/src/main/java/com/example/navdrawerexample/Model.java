package com.example.navdrawerexample;

public class Model {
    public Model(String name, int img) {
        this.name = name;
        this.img = img;
    }

    String name;

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    int img;
}