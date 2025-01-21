package org.example.Class_17_1_25_polymorphism.second;

public class Car {
    private String name;
    private int fuelCapacity;
    private int mileage;
    private String brand;
    private String insurance;
    private int gears;
    private IFuelUp iFuelUp;

    public Car(String name, int fuelCapacity, int mileage, String brand, String insurance, int gears, IFuelUp iFuelUp){
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
        this.brand = brand;
        this.insurance = insurance;
        this.gears = gears;
        this.iFuelUp = iFuelUp;
    }
    public void fuelup(){

        iFuelUp.fuelUp();
    }
}
