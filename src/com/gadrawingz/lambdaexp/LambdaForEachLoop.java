package com.gadrawingz;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Amanda");
        list.add("Hamza");
        list.add("Gadson");
        list.add("Daniel");

        // Lambda into play...
        list.forEach(
                (n)-> System.out.println(n)
        );
    }
}