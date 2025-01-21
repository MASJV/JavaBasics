package org.example.Kingdom_Resident_Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Residents> residents = new ArrayList<>();
        residents.add(new Elves("Legolas", 120, "Enchanted Forest"));
        residents.add(new Elves("Nicholas", 160, "Dense Forest"));
        residents.add(new Dwarves("Gimli", 150, "Mountain Halls"));
        residents.add(new Dwarves("Imli", 140, "Mountain Cave"));

        List<Elves> elves = new ArrayList<>();
        elves.add(new Elves("Legolas", 150, "Enchanted Forest"));
        elves.add(new Elves("Nicholas", 160, "Dense Forest"));
        for(Elves elf : elves){
            System.out.println(elf.speak());
            System.out.println(elf.trade());
            System.out.println(elf.craftMagicItem());
            System.out.println(elf.enhancedVision());
            System.out.println(elf.dailyRoutine());
            System.out.println(elf.defendAgainstDragon());
        }

        List<Dwarves> dwarves = new ArrayList<>();
        dwarves.add(new Dwarves("Gimli", 150, "Mountain Halls"));
        dwarves.add(new Dwarves("Imli", 140, "Mountain Cave"));

        for(Dwarves dwarf : dwarves) {
            System.out.println(dwarf.speak());
            System.out.println(dwarf.trade());
            System.out.println(dwarf.learnSpell());
            System.out.println(dwarf.castSpell());
            System.out.println(dwarf.dailyRoutine());
            System.out.println(dwarf.defendAgainstDragon());
        }

        for(Residents resident : residents){
            System.out.println(resident.name + " (Age: " + resident.age + ", Location: " + resident.location + ")");
            System.out.println(resident.speak());
            System.out.println(resident.trade());
            System.out.println(resident.dailyRoutine());
        }


    }

}
