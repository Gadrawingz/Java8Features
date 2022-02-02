package com.gadrawingz.functionalintfcs;

interface Doable {
    default void doIt() {
        System.out.println("Do it now!");
    }
}

public class FunctionalIntFuncNonFunc {
    public static void main(String[] args) {
    }
}
