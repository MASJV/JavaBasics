package org.example.Interface_ques;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiningFoodRestaurant implements Restaurant{
    private final String name;
    private String cuisine;
    private Set<String> menu;
    private Instant startHour;
    private Instant endHour;
    private double stars;
    private  int current_capacity = 0;
    private  static final int max_capacity = 50;

    public DiningFoodRestaurant(String name, Instant startHour, Instant endHour,
                                double stars){
        this.name = name;
        this.cuisine = "N/A";
        this.menu = new HashSet<>();
        this.startHour = startHour;
        this.endHour = endHour;
        this.stars = stars;
    }

    public DiningFoodRestaurant(String name, String cuisine, Instant startHour,
                                Instant endHour, double stars){
        this.name = name;
        this.cuisine = cuisine;
        this.menu = new HashSet<>();
        this.startHour = startHour;
        this.endHour = endHour;
        this.stars = stars;
    }

    @Override
    public String getName() {
        return String.format("%s(%f*)",this.name,this.stars);
    }

    @Override
    public String getCuisine() {
        return this.cuisine;
    }

    @Override
    public List<String> getMenu() {
        return new ArrayList<>(this.menu);
    }

    @Override
    public void addFoodItem(String foodName) {
        this.menu.add(foodName);
    }

    @Override
    public void removeFoodItem(String foodName) {
        if(!this.menu.contains(foodName)){
            throw new IllegalArgumentException(foodName + "does not exist");
        }
        this.menu.remove(foodName);
    }

    @Override
    public int getNumFoodItems() {
        return this.menu.size();
    }

    @Override
    public String makeReservation(String time, int peopleComing) {
        Instant reservationTime = Instant.parse(time);

        if(startHour.isAfter(reservationTime) || endHour.isBefore(reservationTime)){
            return "Reservation Failed: Time is outside operating hours.";
        }

        else if(current_capacity + peopleComing > max_capacity){
            return "Reservation Failed. Available Capacity is only: " + (max_capacity - current_capacity);
        }

        current_capacity += peopleComing;
        return "Reservation Success";
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return this.getNumFoodItems() > other.getNumFoodItems();
    }
}
