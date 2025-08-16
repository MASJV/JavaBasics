package org.example.CSE_122_24_objectsProgramming;

// Represents a Garden in which users can plant items
public interface Garden {
    // Returns the maximum number of spots present within this garden.
    public int getMaxSpots();

    // Returns the total number of spots occupied with plants within this garden.
    public int getOccupiedSpots();

    // Plants 'num' instances of 'name' within the garden where 'temp' represents the
    // given plant's ideal temperature in degrees Fahrenheit. Should throw an
    // IllegalArgumentException if there aren't enough spots available within this garden
    // or if num is not positive. You may assume the temp for plants with the same name
    // will be equal.
    public void plant(String name, int num, double temp);

    // Removes a single instance of a plant named 'name' within this garden. Should throw
    // an IllegalArgumentException if no plants with the given 'name' exist.
    public void pick(String name);

    // Given a specific day's 'temp', returns a Set of all plants that require shade. A
    // plant needs shade if the current temp is greater than its ideal temperature + 10
    // degrees Fahrenheit. The returned Set should have all elements in sorted order.
    //public Set<String> needsShade(double temp);

    // Copies all plants within this garden to the provided 'other' instance. Should throw
    // an IllegalArgumentException if there aren’t enough spots present. This garden
    // should remain unmodified.
    public void copyInto(Garden other);
}
