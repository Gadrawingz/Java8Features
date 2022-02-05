package com.gadrawingz.optionalclass;
import java.util.Optional;

public class OptionalValueIsNotPresent {

    public static void main(String[] args) {

        // THIS COMMENTED EXAMPLE THROWS a NullPointerException

        // String[] myString = new String[10];
        // String lowercaseString = myString[5].toLowerCase();
        // System.out.println(lowercaseString);

        /*Exception in thread "main" java.lang.NullPointerException:
        Cannot invoke "String.toLowerCase()" because "myString[5]" is null at
        com.gadrawingz.optionalclass.OptionalValueIsNotPresent.main(OptionalValueIsNotPresent.java:8)*/

        // TO AVOID ABNORMAL TERMINATION, WE USE OPTIONAL CLASS
        // SO, OUR PROGRAM CAN EXECUTE WITHOUT CRASHING
        // BY IMPORTING: java.util.Optional;

        String[] realString = new String[10];
        Optional<String> checkNull = Optional.ofNullable(realString[5]);

        // If value is present or not
        if(checkNull.isPresent()) {
            String lowerCaseStr = realString[5].toLowerCase();
            System.out.println(lowerCaseStr);
        } else {
            System.out.println("String value is not present!");
        }

    }

}
