package com.gadrawingz.lambdaexp;

interface Addable1 {
    int add(int a, int b);
}

public class LambdaWithWithoutReturn {
    public static void main(String[] args) {

        // Without Lambda expression
        Addable1 addable1 = new Addable1() {
            @Override
            public int add(int a, int b) {
                return (a + b);
            }
        };

        // Lambda expression without return keyword
        Addable1 addable2 = (a, b) -> (a + b);

        // Lambda expression with return keyword
        Addable1 addable3 = (int k, int l) ->{
            return (k + l);
        };
        System.out.println(addable3.add(20, 3)); // 23
    }
}
