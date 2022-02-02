package com.gadrawingz.methodref;
import java.util.function.BiFunction;

// Here we are using BiFunction interface
// It's a predefined interface and contains a functional method apply().
// Here we're referring add method to apply method.

class Arithmetic2 {
    public int add(int a, int b) {
        return a+b;
    }
}

public class RefInstanceMethod3 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
        int result = adder.apply(10, 20);
        System.out.println("\n\n"+result);
    }
}
