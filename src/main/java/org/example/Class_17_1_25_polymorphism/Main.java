package org.example.Class_17_1_25_polymorphism;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("egloo", "white", true, new FastFly());
        Bird sparrow = new Bird("sparoo", "brown", true, new SlowFly());
        Bird penguin = new Bird("pengoo", "black", false, new NoFly());

        eagle.fly();
        sparrow.fly();
        penguin.fly();
    }
}
