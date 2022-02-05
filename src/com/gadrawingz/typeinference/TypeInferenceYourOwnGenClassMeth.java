package com.gadrawingz.typeinference;

// We are creating our own generic class & method
class GenericClass<Rapper> {
    Rapper name;

    public void setName(Rapper name) {
        this.name = name;
    }

    public Rapper getName() {
        return name;
    }

    public String genericMethod(GenericClass<String> rapper) {
        rapper.setName("Gadrawin");
        return rapper.getName();
    }
}

public class TypeInferenceYourOwnGenClassMeth {
    public static void main(String[] args) {

        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setName("2Pac Shakur");
        System.out.println(genericClass.getName());

        GenericClass<String> genericClass2 = new GenericClass<>();
        genericClass2.setName("XXXTENTACION");
        System.out.println(genericClass2.getName());

        // New improved type inference
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));

    }
}
