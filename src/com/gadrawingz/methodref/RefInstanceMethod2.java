package com.gadrawingz.methodref;

public class RefInstanceMethod2 {

    public void printMessage() {
        System.out.println("Hello, this is an instance method");
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new RefInstanceMethod2()::printMessage);
        thread.start();
    }
}
