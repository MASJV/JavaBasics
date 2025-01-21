package org.example.Class_18_1_25_inheritance;

public class Bowler extends Cricketer {
    int wickets;

    public Bowler(int wickets, String name, int salary, double stamina, double agility, double speed, String boardName) {
        super(name, salary, stamina, agility, speed, boardName);
        this.wickets = wickets;
    }
}
