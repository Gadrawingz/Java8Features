package com.gadrawingz.typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceGenericClassesMethods {

    public static void showList(List<Integer>list) {
        if (!list.isEmpty()) {
            list.forEach(System.out::println);
        } else System.out.println("List is empty");
    }

    public static void main(String[] args) {

        // Old approach(prior to Java 7) to create a list
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        showList(list1); // 11

        // Java 7
        // Here U can left it blank, Compiler can infer type
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        showList(list2); // 12

        showList(new ArrayList<>()); // List is empty

    }
}
