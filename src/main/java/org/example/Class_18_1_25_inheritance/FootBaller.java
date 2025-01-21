package org.example.Class_18_1_25_inheritance;

public class FootBaller extends Player{
    private String leagueName;

    public FootBaller(String name, int salary, double stamina, double agility, double speed, String leagueName){
        super(name, salary, stamina, agility, speed); //super is  a keyword like this, used to access parent class ki method(super.getDietPlan())
        this.leagueName = leagueName;
    }

    @Override
    public String getDietPlan(){

        return "FootBaller Diet Plan";
    }

    @Override
    public String getExercisePlan(){
        return super.getExercisePlan() + " Footballer specific exercise";
    }

    public String getDescription(){
        return "Footballer " + this.name + " gets a salary " + this.getSalary();
    }
}
