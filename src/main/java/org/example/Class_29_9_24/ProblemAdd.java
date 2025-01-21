package org.example.Class_29_9_24;

public class ProblemAdd {
    public void addition (final int a, final int b){
        //a = a-2 will give error as we have use final, so a value cannot be modified.
        System.out.println(a+b);
    }
    public void addition (final double a,  final double b){
        System.out.println(a+b);
    }
    public void addition (final float a, final float b){
        System.out.println(a+b);
    }
    public void addition (final String a, final String b){
        System.out.println(a+b);
    }
}
