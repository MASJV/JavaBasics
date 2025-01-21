package org.example.Interface_ques;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FastFoodRestaurant implements Restaurant{
    private String name;
    private String cuisine;
    private Set<String> menu;

    public FastFoodRestaurant(String name){
        this.name = name;
        this.cuisine = "N/A";
        this.menu = new HashSet<>();
    }

    public FastFoodRestaurant(String name, String cuisine){
        this.name = name;
        this.cuisine = cuisine;
        this.menu = new HashSet<>();
    }

    @Override
    public String getName() {
        return this.name;
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

//    @Override
    public String makeReservation(String time, int peopleComing) {
        return "No reservation needed!";
    }

    @Override
    public boolean hasMoreOptions(Restaurant other) {
        return this.getNumFoodItems() > other.getNumFoodItems();
    }
}
