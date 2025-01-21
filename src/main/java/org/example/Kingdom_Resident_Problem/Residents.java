package org.example.Kingdom_Resident_Problem;

public abstract class Residents {
    protected String name;  //if private then extend me aayega nahi, public use karke
                            // getter setter se varna karna padega
    protected int age;  //why not private. where to access? previous question files?
    protected String location;

    public Residents(String name, int age, String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String speak(){
        return "Hi. My name is: " + name;
    }

    public String trade(){
        return name + " is trading goods";
    }

    public String dailyRoutine(){
        return name + " follows a daily routine";
    }

}
