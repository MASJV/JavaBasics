package org.example.Class_18_1_25_inheritance;

public class AllRounder extends Cricketer{

    int runs;
    int wickets;

    public AllRounder(int runs, int wickets, String name, int salary, double stamina, double agility, double speed, String boardName) {
        super(name, salary, stamina, agility, speed, boardName);
        this.runs = runs;
        this.wickets = wickets;
    }
}
