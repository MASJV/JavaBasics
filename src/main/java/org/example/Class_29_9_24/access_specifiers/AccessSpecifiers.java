package org.example.Class_29_9_24.access_specifiers;

public class AccessSpecifiers {

    int a; // default matlab package private

    private int b; // private means accessible within the class

    public  int c; // public means accessible from anywhere

    protected int d; // protected


    AccessSpecifiers(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //1. Abstraction
    //2. Encapsulation -> I am encapsulating data(implementation) + operations(functionalities)
    //3. Inheritance
    //4. Polymorphism
    //5. Security

    //Access specifiers:
    //1. private: accessible only within the class
    //2. public: accessible from anywhere
    //3. protected: accessible from inherited child class
    //4. default: eg. int a;
}
