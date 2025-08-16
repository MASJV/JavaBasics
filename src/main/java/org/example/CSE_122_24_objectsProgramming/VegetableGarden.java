package org.example.CSE_122_24_objectsProgramming;

import java.util.HashMap;
import java.util.Map;

public class VegetableGarden implements Garden{
    private int maxSpots;
    private int occupiedSpots;
    private Map<String, Plant> plants;

    public VegetableGarden(int spots) {
        if(spots < 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        this.maxSpots = spots;
        this.occupiedSpots = 0;
        this.plants = new HashMap<>();
    }

    @Override
    public int getMaxSpots(){
        return this.maxSpots;
    }

    @Override
    public int getOccupiedSpots(){
        return this.occupiedSpots;
    }

    @Override
    public void plant(String name, int num, double temp){
        if(num < 0 || occupiedSpots + num > maxSpots){
            throw new IllegalArgumentException("Invalid Input");
        }

    }

    @Override
    public void pick(String name){
        // Removes a single instance of a plant named 'name' within this garden. Should throw
        // an IllegalArgumentException if no plants with the given 'name' exist.
    }

   //@Override
    //public Set<String> needsShade(double temp){
        // Given a specific day's 'temp', returns a Set of all plants that require shade. A
        // plant needs shade if the current temp is greater than its ideal temperature + 10
        // degrees Fahrenheit. The returned Set should have all elements in sorted order.

    //}

    @Override
    public void copyInto(Garden other){
        // Copies all plants within this garden to the provided 'other' instance. Should throw
        // an IllegalArgumentException if there aren’t enough spots present. This garden
        // should remain unmodified.
    }

}
