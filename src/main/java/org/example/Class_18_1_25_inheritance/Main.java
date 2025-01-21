package org.example.Class_18_1_25_inheritance;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player("Jaiveer", 100000000, 8.0, 8.5, 9.5);
//        System.out.println(player.getDietPlan());
//        System.out.println(player.getExercisePlan());
//        System.out.println(player.getSalary());
//        //System.out.println(player.getDescription());
//        System.out.println(player.getDescription());

        Player cricketer = new Cricketer("Nidip", 9000000, 7.5, 6.0, 8.0, "BCCI");
        System.out.println(cricketer.getDietPlan());
        System.out.println(cricketer.getExercisePlan());
        System.out.println(cricketer.getSalary());

        Player footballer = new FootBaller("Ronaldo", 1000000000, 9.0, 8.5, 9.5, "Saudi");
        System.out.println(footballer.getDietPlan());
        System.out.println(footballer.getExercisePlan());
        System.out.println(footballer.getSalary());

        // if i need league name and board name then its required. get description not added in player case
//        Cricketer cricketer1 = new Cricketer("Nidip", 9000000, 7.5, 6.0, 8.0, "BCCI");
//        System.out.println(cricketer1.getDietPlan());
//        System.out.println(cricketer1.getExercisePlan());
//        System.out.println(cricketer1.getSalary());
//        System.out.println(cricketer1.getDescription());
//
//        FootBaller footBaller1 = new FootBaller("Ronaldo", 1000000000, 9.0, 8.5, 9.5, "Saudi");
//        System.out.println(footBaller1.getDietPlan());
//        System.out.println(footBaller1.getExercisePlan());
//        System.out.println(footBaller1.getSalary());
//        System.out.println(footBaller1.getDescription());

    }
}
