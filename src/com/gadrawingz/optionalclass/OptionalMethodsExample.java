package com.gadrawingz.optionalclass;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) {

        String[] myString = new String[10];
        myString[5] = "JAVA OPTIONAL CLASS EXAMPLE";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty); // Returns non-empty optional

        Optional<String> value = Optional.of(myString[5]);
        System.out.println("Filtered value: "+value.filter((s)-> s.equals("Abc")));
        // Outputs: Optional.empty();

        System.out.println("Filtered value: "+value.filter((s)-> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
        // Filtered value: Optional[JAVA OPTIONAL CLASS EXAMPLE]

        System.out.println("Getting value: "+value.get()); // Get the value
        // It returns value of an Optional. if value not present , it throws an NoSuchElementException

        System.out.println("Getting hashCode: "+value.hashCode()); // Gettin hashCode of the value
        System.out.println("Is value present? "+value.isPresent()); // true or false
        System.out.println("Nullable Optional "+Optional.ofNullable(myString[5]));
        // Returns non-empty Optional if Value is present, Otherwise returns an empty Optional

        // Returns value if available, Otherwise returns specified value:
        System.out.println("orElse: "+value.orElse("Value is not present"));
        System.out.println("orElse: "+empty.orElse("Value is not present"));
        value.ifPresent(System.out::println); // Printing value by using method ref.



    }
}
