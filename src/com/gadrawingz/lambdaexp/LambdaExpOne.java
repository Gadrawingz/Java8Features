package com.gadrawingz.lambdaexp;

interface Drawable {
    void drawShape();
}

public class LambdaExpOne {

    public static void main(String[] args) {
        int width = 10;

        // Without lambda, Drawable implementation using anonymous class
        Drawable draw = new Drawable() {
            @Override
            public void drawShape() {
                System.out.println("Drawing " + width);
            }
        };
        draw.drawShape();

        // With Lambda
        Drawable draw2 = ()->{
            System.out.println("Drawing: "+width);
        };
        draw2.drawShape();
    }
}
