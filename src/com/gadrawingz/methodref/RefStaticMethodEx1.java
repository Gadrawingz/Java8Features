package com.gadrawingz.methodref;

interface Sayable {
    void say();
}

// Class holding static method
public class RefStaticMethodEx1 {

    public static void saySomething() {
        System.out.println("Hello , This is a static method!");
    }

    public static void main(String[] args) {
        Sayable sayable = RefStaticMethodEx1::saySomething; // Referring static method
        sayable.say(); // Calling interface method
    }
}