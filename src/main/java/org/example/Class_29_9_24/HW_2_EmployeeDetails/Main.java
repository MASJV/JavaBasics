package org.example.Class_29_9_24.HW_2_EmployeeDetails;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robin Hood","Swordsman");
        Employee employee2 = new Employee("Robin Hoodooo","Swordsman");
        employee1.display();
        System.out.println(" ");
        employee1.buyCar(CarType.SPORTS, "White");
        employee1.buyCar(CarType.SPORTS, "Whiteeee");
        employee2.buyCar(CarType.SPORTS, "Whiteoooo");
        employee1.display();
        System.out.println(" ");
        employee2.display();
        System.out.println("Employee Car is: " + employee1.showCar());

    }
}
