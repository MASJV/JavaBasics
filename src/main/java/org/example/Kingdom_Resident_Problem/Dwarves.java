package org.example.Kingdom_Resident_Problem;

public class Dwarves extends Residents{

    public Dwarves(String name, int age, String location){
        super(name, age, location);
    }

    @Override
    public String speak(){
        return name + " speaks with a deep, hearty voice.";
    }

    public String trade(){
        return super.trade();
    }

    public String work(){
        return name + " is mining resources and forging legendary weapons.";
    }

    public String mine(){
        return name + " is mining precious resources.";
    }

    public String forge() {
        return name + " is forging a legendary weapon.";
    }

    public String learnSpell(){
        return name + " learns new spells everyday";
    }

    public String castSpell(){
        return name + " cast spells to protect the kingdom";
    }

    @Override
    public String dailyRoutine(){
        return name + " mines for about 2 hrs daily and learns atleast 3 new spells to cast them";
    }

    public String defendAgainstDragon() {
        return name + " forges weapons and cast spells for defense against the dragon.";
    }
}
