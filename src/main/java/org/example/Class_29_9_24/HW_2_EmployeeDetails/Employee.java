package org.example.Class_29_9_24.HW_2_EmployeeDetails;

public class Employee {
    private String name;
    private String designation;
    private Car car;

    public Employee(String name, String designation){
        this.name = name;
        this.designation = designation;
        this.car = null;
    }

    public void buyCar(CarType carType, String colour){
        this.car = new Car(carType, colour);
    }

    public Car showCar(){
        return car;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);

        if (car == null) {
            System.out.println("No Car assigned");
        }
        else {
            System.out.println("Car: " + car);
        }
    }
}
