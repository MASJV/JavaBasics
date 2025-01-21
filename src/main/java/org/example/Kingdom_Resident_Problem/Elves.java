package org.example.Kingdom_Resident_Problem;

public class Elves extends Residents{

    public Elves(String name, int age, String location){
        super(name, age, location);
    }

    @Override
    public String speak(){
        return name + " speaks melodiously with wisdom.";
    }

    public String trade(){
        return super.trade();
    }

    public String work(){
        return name + " is crafting bows and enchanted armor.";
    }

    public String craftMagicItem(){
        return name + " is crafting a magical item.";
    }

    public String enhancedVision(){
        return name + " uses enhanced vision to see distant lands.";
    }

    @Override
    public String dailyRoutine(){
        return name + " performs 100 perfect shots in archery before afternoon";
    }

    public String defendAgainstDragon() {
        return name + " shoots arrows and uses magical vision to track the dragon.";
    }
}
