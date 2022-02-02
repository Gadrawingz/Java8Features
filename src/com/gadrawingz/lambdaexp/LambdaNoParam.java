package com.gadrawingz.lambdaexp;

interface Sayable {
    public String saySomething();
}

public class LambdaNoParam {
    public static void main(String[] args) {

        Sayable sayable = ()-> {
            return "I have nothin' to say bruh!";
        };
        System.out.println(sayable.saySomething());
    }
}
