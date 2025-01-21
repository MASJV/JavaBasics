package org.example.Class_29_9_24;

public class MainS {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Robin","Nairobi");
        Student student2 = new Student(1,"Robin","Nairobi");

        System.out.println("Our Result: " + student1.equalsTo(student2));
        System.out.println("Java Result: " + student1.equals(student2));//delombok @data then //equals then java default reference equal checking which will give false.

        System.out.println(student1);
        System.out.println(student2);

        if(student1==student2){
            System.out.println("equals");
        }
        else{
            System.out.println("not equals");
        }
    }
}
