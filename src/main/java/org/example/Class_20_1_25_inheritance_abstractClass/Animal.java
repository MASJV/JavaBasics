package org.example.Class_20_1_25_inheritance_abstractClass;

/**
 * 1. An Abstract can't be instantiated
 * 2. An Abstract class can have constructor
 * 3.Abstract class can have abstract methods  or can have normal methods
 *
 */


public abstract class Animal {  //we don't want to allow object of base class

    private String name;  //final ka dekho search karke(REVISE)
    private String colour;

    public Animal(String name, String colour){
        this.name = name;
        this.colour = colour;
    }


    //TODO: if we can fix it means if we don't provide implementation it would be good

//    public String feed(){   // jabarjasti had to use feed t0 ovverride in dog and fish
//        return "Dummy feed";
//    }

    public abstract String feed();

    /** after abstracting  this method, either dummy or actual thing needs to be written
     *  in the subclasses(dog and fish)
     */


}