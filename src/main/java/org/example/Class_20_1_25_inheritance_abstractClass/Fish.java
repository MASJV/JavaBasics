package org.example.Class_20_1_25_inheritance_abstractClass;

public class Fish extends Animal{
    private int swimSpeed;

    public Fish(String name, String colour, int swimSpeed) {
        super(name, colour);
        this.swimSpeed = swimSpeed;
    }

    public String feed(){
        return "Feeding a fish";
    }

    public String swim(){
        return "Fish is swimming";
    }
}
