package org.example.Class_29_9_24.access_specifiers;

public class SingleTon {

    private final int a;

    private  static final SingleTon INSTANCE = new SingleTon(1);

    private SingleTon(int a){
        this.a = a;
    }


}
