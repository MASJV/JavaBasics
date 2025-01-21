package org.example.Class_18_1_25_inheritance;

public class Batsman extends Cricketer{

    int runs;

    public Batsman(int runs, String name, int salary, double stamina, double agility, double speed, String boardName) {
        super(name, salary, stamina, agility, speed, boardName);
        this.runs = runs;
    }
}
