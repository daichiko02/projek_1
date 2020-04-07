package com.mycompany.app;

class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    static Rectangle makeSquare(int side){
        return new Rectangle(side,side);
    }

    int area() {
        return this.length * this.width;
    }

    int perimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
