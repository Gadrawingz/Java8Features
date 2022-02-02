package com.gadrawingz.methodref;

import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class RefStaticMethodPredefinedF {
    public static void main(String[] args) {

        // U can use predefined functional interface to refer methods.
        // We're using BiFunction interface & using it's apply() method.

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);

    }
}
