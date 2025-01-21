package org.example.Class_18_1_25_inheritance;


public class Cricketer extends Player{
    private String boardName;

    public Cricketer(String name, int salary, double stamina, double agility, double speed, String boardName){
        super(name, salary, stamina, agility, speed); //super is  a keyword like this, used to access parent class ki method(super.getDietPlan())
        this.boardName = boardName;
    }

    @Override
    public String getDietPlan(){

         return "Cricketer Diet Plan";
    }

    @Override
    public String getExercisePlan(){
        return super.getExercisePlan() + " Cricketer specific exercise";
    }

    public String getDescription(){
        return "Cricketer " + this.name + " gets a salary " + this.getSalary();
    }
}
