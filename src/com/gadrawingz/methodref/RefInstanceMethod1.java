package com.gadrawingz.methodref;

interface Saying {
    void say();
}

public class RefInstanceMethod1 {
    public void saySomething() {
        System.out.println("Hello, this is non-static method");
    }

    public static void main(String[] args) {

        RefInstanceMethod1 methodReference = new RefInstanceMethod1(); // Obj creation

        // Referring non-static method
        Saying saying = methodReference::saySomething;
        saying.say(); // Calling interface method

        Saying saying2 = new RefInstanceMethod1()::saySomething;
        // U can use anonymous object also
        saying2.say(); // Calling interface method
    }
}
