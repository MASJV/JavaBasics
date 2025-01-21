package org.example.Class_17_1_25_polymorphism;

public class Bird {
    private String name;
    private String colour;
    private boolean isFly;
    private IFly iFly;

    public Bird(String name, String colour, boolean isFly, IFly iFly){
        this.name = name;
        this.colour = colour;
        this.isFly = isFly;
        this.iFly = iFly;
    }
    public void fly(){

        iFly.fly();
    }
}
