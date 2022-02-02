package com.gadrawingz.lambdaexp;

interface Addable {
    int add(int a, int b);
}

public class LambdaMultiParams {
    public static void main(String[] args) {

        // Multiple params in lambda expression
        Addable addable1 = (a, b) -> (a + b);
        System.out.println(addable1.add(40, 5));

        // Multiple params with data type in lambda expression
        Addable addable2 = (int x, int y)-> (x+y);
        System.out.println(addable2.add(100, 50));

    }
}
