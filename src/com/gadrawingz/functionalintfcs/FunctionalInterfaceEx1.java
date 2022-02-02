package com.gadrawingz.functionalintfcs;

@FunctionalInterface
interface Writable {
    void write(String text);
}

// We implement it
public class FunctionalInterfaceEx1 implements Writable {

    public void write(String message) {
        System.out.println(message); // abstract method
    }

    public static void main(String[] args) {
        FunctionalInterfaceEx1 fie = new FunctionalInterfaceEx1();
        fie.write("Hello classroom this is notice...");
    }
}