package com.mycompany.app;

public class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return this.length * this.width;
    }

    public int area23(){
        return 0;
    }
}
