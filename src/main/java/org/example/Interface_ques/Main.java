package org.example.Interface_ques;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Restaurant r1 = new FastFoodRestaurant("McDonalds");
        r1.addFoodItem("Butter Paneer");
        r1.addFoodItem("Cheeseburger");
        r1.removeFoodItem("Butter Paneer");

        Restaurant r2 = new FastFoodRestaurant("Chipotle", "Mexican");
        r2.addFoodItem("Tacos");
        r2.addFoodItem("PadThai");
        r2.addFoodItem("Burrito");
        r2.addFoodItem("Burrito");
        r2.removeFoodItem("PadThai");

        System.out.println(r1.getName()); // McDonalds
        System.out.println(r1.getCuisine()); // N/A
        System.out.println(r1.getMenu()); // [Cheeseburger]
        System.out.println(r1.getNumFoodItems()); // 1

        System.out.println(r2.getName()); // Chipotle
        System.out.println(r2.getCuisine()); // Mexican
        System.out.println(r2.getMenu()); // [Tacos, Burrito]  >> order does not matter
        System.out.println(r2.getNumFoodItems()); // 2

        System.out.println(r1.hasMoreOptions(r2)); // false
        System.out.println(r1.makeReservation("8:00 pm", 20)); // No reservation needed!


        Instant startHour = Instant.parse("2025-01-15T10:30:00Z");
        Instant endHour = Instant.parse("2025-01-15T22:30:00Z");

        Restaurant r3 = new DiningFoodRestaurant("Mango", startHour, endHour,
                                            4.7);
        r3.addFoodItem("Butter Paneer");
        r3.addFoodItem("Cheeseburger");
        r3.removeFoodItem("Butter Paneer");

        Restaurant r4 = new DiningFoodRestaurant("Under the Neem Tree", startHour, endHour,
                                            4.5);
        r4.addFoodItem("Tacos");
        r4.addFoodItem("PadThai");
        r4.addFoodItem("Burrito");
        r4.removeFoodItem("PadThai");

        System.out.println(r3.getName());
        System.out.println(r3.getCuisine());
        System.out.println(r3.getMenu());
        System.out.println(r3.getNumFoodItems());

        System.out.println(r4.getName()); // Under the Neem Tree (4.5*)
        System.out.println(r4.getCuisine()); // N/A
        System.out.println(r4.getMenu()); // [Tacos, Burrito] order does not matter
        System.out.println(r4.getNumFoodItems()); // 2

        System.out.println(r3.hasMoreOptions(r4)); // false
        System.out.println(r3.makeReservation("2025-01-15T20:00:00Z", 20));
        System.out.println(r3.makeReservation("2025-01-15T22:00:00Z", 31));
        System.out.println(r3.makeReservation("2025-01-15T09:00:00Z", 13));

        System.out.println(r4.makeReservation("2025-01-15T22:00:00Z", 17));
        System.out.println(r4.makeReservation("2025-01-15T22:00:00Z", 39));



    }
}
