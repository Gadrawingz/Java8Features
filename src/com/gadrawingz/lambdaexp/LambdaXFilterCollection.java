package com.gadrawingz.lambdaexp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class PhoneProduct {
    int id;
    String name;
    float price;
    public PhoneProduct(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaXFilterCollection {
    public static void main(String[] args) {

        List<PhoneProduct> list = new ArrayList<PhoneProduct>();

        list.add(new PhoneProduct(1,"Samsung A5", 14000f));
        list.add(new PhoneProduct(2,"Sony Xperia", 25000f));
        list.add(new PhoneProduct(5,"Nokia Lumia", 15000f));
        list.add(new PhoneProduct(3,"Redmi4", 26000f));
        list.add(new PhoneProduct(6,"Lenevo Vibe", 19000f));
        list.add(new PhoneProduct(4,"iPhone 6S", 65000f));


        // Using lambda to filter data and iterate through collection...
        Stream<PhoneProduct> filteredData = list.stream().filter(product -> product.price > 20000);
        filteredData.forEach(product-> {
            System.out.println(
                    "PHONE NAME: "+product.name+", PRICE: "+product.price
            );
        });





    }
}
