package com.gadrawingz.optionalclass;

import java.util.Optional;

public class OptionalValueIsPresent {
    public static void main(String[] args) {

        String[] string1 = new String[10];
        string1[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(string1[5]);

        if(checkNull.isPresent()) {
            String lowercaseString = string1[5].toLowerCase();
            System.out.println(lowercaseString+"\n");
        } else {
            System.out.println("String value is present\n");
        }


        // Another example:
        String[] myString = new String[10];
        myString[5] = "JAVA MY DAILY MEAL"; // Setting val for 5th index
        Optional<String> checkNull2 = Optional.ofNullable(myString[5]);

        // Different ways for printing value...
        checkNull2.ifPresent(System.out::println); // By using method reference
        System.out.println(checkNull2.get()); // By using get method
        System.out.println(myString[5].toLowerCase());
    }
}
