package org.example.Class_18_1_25_inheritance;

// Base class, Super class, Parent class -> the class you are inheriting
// Base class, Super class, Parent class -> the class you are inheriting
// Base class, Super class, Parent class -> the class you are inheriting

// I just want to have the base class for polymorphism or abstraction, I don't want anyone to create an object of Player
// I just want to have the base class for polymorphism or abstraction, I don't want anyone to create an object of Player
// I just want to have the base class for polymorphism or abstraction, I don't want anyone to create an object of Player

//Just because of polymorphism, I need to write dummy implementation at my base class, because it's class
//Just because of polymorphism, I need to write dummy implementation at my base class, because it's class
//Just because of polymorphism, I need to write dummy implementation at my base class, because it's class


public abstract class Player {
    protected String name;    //protected is only inside package accessible but inheritance is EVERYWHERE!?
    protected int salary;      //protected se private rakh kar public function use karne ka for inheritance
    protected double stamina;  //protected -> public na hoy, sirf jo inherit karu eska pass vo chala jaay
    protected double agility;  //(inheritance possible ho sirf without getting public
    protected double speed;

    // Just because it's a class and I want polymorphism, that's why I am keeping default dummy implementation here
    // Just because it's a class and I want polymorphism, that's why I am keeping default dummy implementation here
    // Just because it's a class and I want polymorphism, that's why I am keeping default dummy implementation here
    // Just because it's a class and I want polymorphism, that's why I am keeping default dummy implementation here

    //
    public Player(String name, int salary, double stamina, double agility, double speed){
        this.name = name;
        this.salary = salary;
        this.stamina = stamina;
        this.agility = agility;
        this.speed = speed;
    }


    public abstract String getDietPlan();

    public String getExercisePlan(){
        return "Free Hand";
    }

    public int getSalary() {
        return this.salary;
    }

    /* I don't want anyone to use this function on just plauer
        @return
     */

    public abstract String getDescription();
        // return "Cricketer " + this.name + " gets a salary " + this.getSalary();
        // not possible this as player is not a cricket, a cricketer is a player
        // return "dummy";
}
