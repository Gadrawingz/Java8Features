package com.gadrawingz.lambdaexp;

interface Saying {
    public String say(String name);
}

public class LambdaSingleParam {
    public static void main(String[] args) {

        // Lambda expression with single param.
        Saying s1 = (name) -> {
            return "Hello "+name;
        };
        System.out.println(s1.say("Gadson"));


        // U can omit function parentheses.
        Saying s2 = name -> {
            return "Hello "+name;
        };
        System.out.println(s1.say("Innocent"));

    }
}
