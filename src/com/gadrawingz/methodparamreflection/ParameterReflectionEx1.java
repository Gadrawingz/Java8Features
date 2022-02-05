package com.gadrawingz.methodparamreflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterReflectionEx1 {
    public static void main(String[] args) {

        // Creating object of a class
        Calculate calculate = new Calculate();

        // Instantiating Class class
        Class cls = calculate.getClass();

        // Getting declared method inside the Calculate class
        Method[] method = cls.getDeclaredMethods(); // Returns array of methods

        // Iterating method array
        for(Method method1: method) {
            // Getting name of method
            System.out.print(method1.getName());

            // Getting parameter of each method
            Parameter parameter[] = method1.getParameters();

            // Iterating parameter array
            for (Parameter parameter2:parameter) {
                System.out.print(" "+parameter2.getParameterizedType()); // returns type of param.
                System.out.print(" "+parameter2.getName()); // Returns parameter name
            }

        }
        
    }
}
