package org.example.Class_29_9_24.access_specifiers;

public class Main {
    public static void main(String[] args) {
        AccessSpecifiers accessSpecifiers = new AccessSpecifiers(1,2,3,4);
        System.out.println(accessSpecifiers.a);
        //b is private so cannot be printed
        System.out.println(accessSpecifiers.c);
        System.out.println(accessSpecifiers.d);


    }
}
