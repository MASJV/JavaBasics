package org.example.Class_20_1_25_inheritance_abstractClass;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Snow", "White", "Husky");
        Animal fish = new Fish("Naina", "Golden", 12);
        Animal[] animals = {dog, fish};
        for(Animal animal : animals){
            System.out.println(animal.feed());
        }

        System.out.println(dog.feed());
        //dog.bark();   Compilation error(as compiler ko lagta hai ki dog ek animal hai
        // par animal me bark method nahi hai)

        System.out.println(((Dog)dog).bark()); //compiler now understands its a dog
        //System.out.println(((Fish)dog).swim()); // compiler thinks it's okay because Fish is an Animal
        //but compiler has no idea what exact implementation is going to be used which is run time thing
        // during run time it will throw error and not in compiler time

        System.out.println(((Fish)fish).swim());

         //Animal animal = new Animal("A", "Green");
        //iska koi matlab nahi hota as aise koi abstraction create nahi ho sakta hai
        // animal is an abstraction. animal can be eiter dog or fish
        // I don't really want to allow anyone to create the object of my base class
    }
}