package com.gadrawingz.functionalintfcs;

interface Doable {
    default void doIt() {
        System.out.println("Do it now!");
    }
}

@FunctionalInterface
interface Sayable extends Doable {
    void say(String message); // abstract method
}

public class FunctionalIntFuncNonFunc implements Sayable{
    // Abstract method is getting used
    public void say(String message) {
        System.out.println(message);
    }
    
    public static void main(String[] args) {

        FunctionalIntFuncNonFunc fie = new FunctionalIntFuncNonFunc();
        fie.say("Hello there...");
        fie.doIt();
    }
}
