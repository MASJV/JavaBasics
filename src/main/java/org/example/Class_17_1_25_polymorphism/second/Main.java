package org.example.Class_17_1_25_polymorphism.second;

public class Main {
    public static void main(String[] args) {
            Car hondaCity = new Car("honda", 600, 10000, "honda",
                    "motorInsurance", 10, new PetrolfuelUp());

            Car marutiSuzuki = new Car("Waganor", 400, 200000,"marutiSuzuki",
                                "motorInsurance2", 8, new DieselfuelUp());

            Car Tesla = new Car("Tesla Model X", 1000, 4000, "Tesla",
                               "Elon Musk", 0, new EVfuelUp());


            hondaCity.fuelup();
            marutiSuzuki.fuelup();
            Tesla.fuelup();
    }
}
