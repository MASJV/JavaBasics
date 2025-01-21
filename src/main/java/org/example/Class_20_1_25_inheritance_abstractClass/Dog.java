package org.example.Class_20_1_25_inheritance_abstractClass;

public class Dog extends Animal{
        private String breed;
        // no private int legs as har dog ke 4 legs hote hai:)

    public Dog(String name, String colour, String breed) {
        super(name, colour);
        this.breed = breed;
    }

    public String feed(){
        return "Feeding a dog";
    }

    public String bark(){
        return "Dog is barking";
    }
}
