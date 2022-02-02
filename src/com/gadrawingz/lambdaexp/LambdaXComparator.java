package com.gadrawingz.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaXComparator {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();


        // Adding Products
        list.add(new Product(4, "Zend Laptop", 800000f));
        list.add(new Product(1, "HP Laptop", 400000f));
        list.add(new Product(2, "Dell Laptop", 350000f));
        list.add(new Product(3, "Positivo BGH", 80000f));

        System.out.println("Sorting on the basis of name...");

        // Implementing Lambda expression
        Collections.sort(list,(p1, p2)-> {
            return p1.name.compareTo(p2.name);
        });

        for(Product p:list) {
            System.out.println("ID: " + p.id + ", NAME: " + p.name + ", PRICE: " + p.price);
        }
    }
}
