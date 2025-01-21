package org.example.Class_29_9_24.HW_2_EmployeeDetails;

import lombok.*;

@ToString
@Getter
@Setter

public class Car {
        private static int idCounter = 0;
        private int id;
        private CarType carType;
        private String colour;

        public Car(CarType carType, String colour){
                this.id = ++idCounter;     //idCounter value first then add if idCounter++;
                this.carType = carType;
                this.colour = colour;
        }

}
